
# Integration Testing

Integration testing is a crucial phase in software development that focuses on verifying the interactions between different components or modules of a system. Unlike unit tests, which isolate and test individual components, integration tests examine how various parts of the application work together to ensure they function correctly as a whole.

In our `CalculatorIntegrationTest` class, located in the `src/test/java/de/hse/swt` package, we implemented integration tests to verify the interaction between the `Calculator` class and the logging functionality. Here's what we did to achieve integration testing:

1. **Test Setup**: We used the `@BeforeEach` annotation to set up the test environment before each test method. This involved initializing the `LoggingService` (specifically, the `Slf4jLoggingService`) and creating a `Calculator` instance with this logging service.

2. **Testing Arithmetic Operations**: We created separate test methods for each arithmetic operation (add, subtract, multiply, divide) to verify not only the correctness of the calculations but also the logging behavior.

3. **Verifying Logging Behavior**: After each operation, we used `assertEquals` to check if the `LoggingService` recorded the expected number of log entries. This ensures that the `Calculator` class is correctly interacting with the logging service.

4. **Error Handling**: We included a test for division by zero to verify that the error is logged correctly and an exception is thrown.

5. **Flexibility in Logging Implementation**: The test class is designed to work with different logging service implementations. We can easily switch between `Slf4jLoggingService` and `ConsoleLoggingService` by changing a single line of code.

By implementing these integration tests, we ensure that the `Calculator` class works correctly with the logging service, validating both the arithmetic operations and the logging functionality in a real-world scenario.
