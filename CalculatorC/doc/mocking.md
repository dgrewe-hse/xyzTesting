# Mock Testing in C: Calculator Example

## Overview

This project demonstrates the use of **mock testing** in C using a basic **Calculator** implementation. The calculator supports basic arithmetic operations such as addition, subtraction, multiplication, and division, and incorporates logging functionality. The project uses **CUnit** as the unit testing framework, and **mocking** is implemented for the logging functionality to verify log messages without invoking the actual logger.

## What is Mock Testing?

**Mock testing** is a technique used in unit testing to simulate the behavior of complex objects or external services. In this project, the **logging functionality** is mocked to verify that the correct log messages are generated during the execution of arithmetic operations, without depending on an actual logging implementation.

Mock testing is particularly useful when:
- You want to **isolate** a unit under test and focus on its core functionality without involving external dependencies.
- You want to **simulate different conditions**, such as verifying specific outputs or error messages.
- You want to test **error scenarios** (e.g., division by zero) without actually triggering errors that could halt execution.

In this example, the **logging** service is mocked to check if the correct log messages are produced during each operation, like "Adding numbers", "Subtracting numbers", etc.

## The Calculator

The calculator performs the following operations:
- **Add**: Adds an array of numbers.
- **Subtract**: Subtracts an array of numbers.
- **Multiply**: Multiplies an array of numbers.
- **Divide**: Divides an array of numbers and handles division by zero gracefully.

Each function accepts a logger, which is a function pointer (`LogFunction`) that logs the operation. If no logging function is provided (i.e., the logger is `NULL`), no logging occurs.

### Sample Functions:

```c
double add(double* numbers, int count, LogFunction logger);
double subtract(double* numbers, int count, LogFunction logger);
double multiply(double* numbers, int count, LogFunction logger);
double divide(double* numbers, int count, LogFunction logger);
```

## Mocking the Logging Service

In our unit tests, we use a mock logging function to simulate the behavior of a real logger. The mock function captures the log messages for verification during tests, allowing us to confirm that the calculator is logging the correct messages during operations.

### Mock Function

```c
char log_message_buffer[256];  // Buffer to hold log messages

void mock_log_message(const char* message) {
    strncpy(log_message_buffer, message, sizeof(log_message_buffer) - 1);
    log_message_buffer[sizeof(log_message_buffer) - 1] = '\0'; // Ensure null termination
}
```

### Testing with CUnit

We use CUnit to test the calculator with and without mocking. The mock tests check whether the correct log messages are generated during each arithmetic operation.

#### Example Test for `add()`

```c
void test_add_with_mock_log() {
    log_message_buffer[0] = '\0';  // Clear buffer before the test
    double numbers[] = {2.0, 3.0, 4.0};
    add(numbers, 3, mock_log_message);
    CU_ASSERT_STRING_EQUAL(log_message_buffer, "Adding numbers");
}
```

#### Example Test for Division by Zero:

The `divide()` function has special handling for division by zero. Instead of terminating the program, it logs an error message and returns 0.0. Here’s the corresponding test:

```c
void test_divide_by_zero_with_mock_log() {
    log_message_buffer[0] = '\0';  // Clear buffer before the test
    double numbers[] = {100.0, 0.0};
    double result = divide(numbers, 2, mock_log_message);

    CU_ASSERT_DOUBLE_EQUAL(result, 0.0, 0.0001);  // Check result is 0.0
    CU_ASSERT_STRING_EQUAL(log_message_buffer, "Error: Division by zero attempted");
}
```

## Summary of Mock Testing Benefits

* Isolation: Mock testing allows us to isolate the core logic of the calculator and verify its functionality without relying on external dependencies (such as an actual logging service).
* Error Simulation: We can simulate error conditions (like division by zero) and verify that the correct error messages are logged, without affecting the flow of the test suite.
* Verification of Behavior: Mocking ensures that we can verify how the calculator interacts with the logging system, checking that the correct log messages are produced in different scenarios.
