#include <CUnit/CUnit.h>
#include <CUnit/Basic.h>
#include <string.h>
#include "calculator.h"

// Buffer to hold the last log message for verification
char log_message_buffer[256];

// Mock version of log_message that stores the message for verification
void mock_log_message(const char* message) {
    strncpy(log_message_buffer, message, sizeof(log_message_buffer) - 1);
    log_message_buffer[sizeof(log_message_buffer) - 1] = '\0'; // Ensure null termination
}

/**
 * @brief Test case for the add function using mock log.
 */
void test_add_with_mock_log() {
    log_message_buffer[0] = '\0'; // Clear buffer before the test
    double numbers[] = {2.0, 3.0, 4.0};
    add(numbers, 3, mock_log_message);
    CU_ASSERT_STRING_EQUAL(log_message_buffer, "Adding numbers");
}

/**
 * @brief Test case for the subtract function using mock log.
 */
void test_subtract_with_mock_log() {
    log_message_buffer[0] = '\0'; // Clear buffer before the test
    double numbers[] = {10.0, 3.0, 2.0};
    subtract(numbers, 3, mock_log_message);
    CU_ASSERT_STRING_EQUAL(log_message_buffer, "Subtracting numbers");
}

/**
 * @brief Test case for the multiply function using mock log.
 */
void test_multiply_with_mock_log() {
    log_message_buffer[0] = '\0'; // Clear buffer before the test
    double numbers[] = {2.0, 3.0, 4.0};
    multiply(numbers, 3, mock_log_message);
    CU_ASSERT_STRING_EQUAL(log_message_buffer, "Multiplying numbers");
}

/**
 * @brief Test case for the divide function using mock log.
 */
void test_divide_with_mock_log() {
    log_message_buffer[0] = '\0'; // Clear buffer before the test
    double numbers[] = {100.0, 5.0, 2.0};
    divide(numbers, 3, mock_log_message);
    CU_ASSERT_STRING_EQUAL(log_message_buffer, "Dividing numbers");
}

/**
 * @brief Test case for division by zero using mock log.
 */
void test_divide_by_zero_with_mock_log() {
    log_message_buffer[0] = '\0'; // Clear buffer before the test
    double numbers[] = {100.0, 0.0};
    divide(numbers, 2, mock_log_message);
    CU_ASSERT_STRING_EQUAL(log_message_buffer, "Error: Division by zero attempted");
}

int main() {
    // Initialize CUnit test registry
    if (CUE_SUCCESS != CU_initialize_registry()) {
        return CU_get_error();
    }

    // Add test suite
    CU_pSuite pSuite = CU_add_suite("CalculatorMockTestSuite", 0, 0);

    // Add tests to suite
    if (NULL == pSuite ||
        (NULL == CU_add_test(pSuite, "test_add_with_mock_log", test_add_with_mock_log)) ||
        (NULL == CU_add_test(pSuite, "test_subtract_with_mock_log", test_subtract_with_mock_log)) ||
        (NULL == CU_add_test(pSuite, "test_multiply_with_mock_log", test_multiply_with_mock_log)) ||
        (NULL == CU_add_test(pSuite, "test_divide_with_mock_log", test_divide_with_mock_log)) ||
        (NULL == CU_add_test(pSuite, "test_divide_by_zero_with_mock_log", test_divide_by_zero_with_mock_log))) {
        CU_cleanup_registry();
        return CU_get_error();
    }

    // Run tests using the basic interface
    CU_basic_set_mode(CU_BRM_VERBOSE);
    CU_basic_run_tests();

    // Clean up the registry and return
    CU_cleanup_registry();

    return CU_get_error();
}
