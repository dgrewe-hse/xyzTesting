/** Copyright (c) 2024. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation.  
 *
 * This code is distributed for educational purposes only, but WITHOUT
 * ANY WARRANTY; See the GNU General Public License version 3 for more 
 * details (a copy is included in the LICENSE file that
 * accompanied this code).
 */
package de.hse.swt;

import de.hse.swt.logging.LoggingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

/**
 * Unit tests for the Calculator class with mocked LoggingService.
 */
public class CalculatorMockitoTest {

    private Calculator calculator;
    private LoggingService mockLoggingService;

    @BeforeEach
    public void setUp() {
        // Create a mock LoggingService
        mockLoggingService = Mockito.mock(LoggingService.class);
        calculator = new Calculator(mockLoggingService);
    }

    @Test
    public void testAdd() {
        assertEquals(6.0, calculator.add(1.0, 2.0, 3.0), 0.0001, "Adding 1.0, 2.0, 3.0 should return 6.0");
        verify(mockLoggingService).log("Adding numbers: 1.0, 2.0, 3.0 = 6.0");
    }

    @Test
    public void testSubtract() {
        assertEquals(5.0, calculator.subtract(10.0, 3.0, 2.0), 0.0001, "Subtracting 10.0 - 3.0 - 2.0 should return 5.0");
        verify(mockLoggingService).log("Subtracting numbers: 10.0, 3.0, 2.0 = 5.0");
    }

    @Test
    public void testMultiply() {
        assertEquals(24.0, calculator.multiply(2.0, 3.0, 4.0), 0.0001, "Multiplying 2.0 * 3.0 * 4.0 should return 24.0");
        verify(mockLoggingService).log("Multiplying numbers: 2.0, 3.0, 4.0 = 24.0");
    }

    @Test
    public void testDivide() {
        assertEquals(10.0, calculator.divide(100.0, 5.0, 2.0), 0.0001, "Dividing 100.0 / 5.0 / 2.0 should return 10.0");
        verify(mockLoggingService).log("Dividing numbers: 100.0, 5.0, 2.0 = 10.0");
    }

    @Test
    public void testDivideByZero() {
        // Expect the ArithmeticException for divide by zero
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(100.0, 0.0));
        assertEquals("Cannot divide by zero", exception.getMessage());

        // Verify that the logging service logs the attempt and then logs the division by zero
        verify(mockLoggingService).log("Attempted division by zero.");
    }
}
