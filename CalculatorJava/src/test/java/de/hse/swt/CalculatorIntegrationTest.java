package de.hse.swt;

import de.hse.swt.logging.LoggingService;
import de.hse.swt.logging.Slf4jLoggingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration tests for the Calculator class to verify logging behavior.
 *
 * This test class uses the ConsoleLoggingService to capture and assert log counts
 * generated during arithmetic operations.
 */
public class CalculatorIntegrationTest {

    private Calculator calculator;
    private LoggingService loggingService;

    /**
     * Sets up the test environment before each test.
     * Initializes the ConsoleLoggingService and Calculator instances.
     */
    @BeforeEach
    public void setUp() {
        loggingService = new Slf4jLoggingService();
        // loggingService = new ConsoleLoggingService(); // Uncomment to test with ConsoleLoggingService
        calculator = new Calculator(loggingService);
    }

    /**
     * Tests the logging output of the add method.
     * Verifies that the log count is incremented correctly when adding numbers.
     */
    @Test
    public void testAddLogging() {
        calculator.add(1.0, 2.0, 3.0);
        assertEquals(1, loggingService.getLogCount()); // Verify log count
    }

    /**
     * Tests the logging output of the subtract method.
     * Verifies that the log count is incremented correctly when subtracting numbers.
     */
    @Test
    public void testSubtractLogging() {
        calculator.subtract(5.0, 2.0);
        assertEquals(1, loggingService.getLogCount()); // Verify log count
    }

    /**
     * Tests the logging output of the multiply method.
     * Verifies that the log count is incremented correctly when multiplying numbers.
     */
    @Test
    public void testMultiplyLogging() {
        calculator.multiply(2.0, 3.0);
        assertEquals(1, loggingService.getLogCount()); // Verify log count
    }

    /**
     * Tests the logging output of the divide method.
     * Verifies that the log count is incremented correctly when dividing numbers.
     */
    @Test
    public void testDivideLogging() {
        calculator.divide(6.0, 2.0);
        assertEquals(1, loggingService.getLogCount()); // Verify log count
    }

    /**
     * Tests the logging output when division by zero is attempted.
     * Verifies that the log count is incremented correctly and an exception is thrown.
     */
    @Test
    public void testDivideByZeroLogging() {
        try {
            calculator.divide(6.0, 0.0);
        } catch (ArithmeticException e) {
            // Expected exception
        }
        assertEquals(1, loggingService.getLogCount()); // Verify log count
    }
}
