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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test class for Calculator without logging service.
 */
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Initialize the Calculator without a logging service
        calculator = new Calculator();
    }

    // --- Test Cases for Add Method ---

    @Test
    public void testAddNoValues() {
        double result = calculator.add();
        assertEquals(0.0, result, 0.0001, "Adding no numbers should return 0.0");
    }

    @Test
    public void testAddSingleValue() {
        double result = calculator.add(5.0);
        assertEquals(5.0, result, 0.0001, "Adding a single number should return the number itself");
    }

    @Test
    public void testAddPositiveNumbers() {
        double result = calculator.add(1.0, 2.0, 3.0);
        assertEquals(6.0, result, 0.0001, "Adding positive numbers 1.0, 2.0, 3.0 should return 6.0");
    }

    @Test
    public void testAddNegativeNumbers() {
        double result = calculator.add(-1.0, -2.0, -3.0);
        assertEquals(-6.0, result, 0.0001, "Adding negative numbers -1.0, -2.0, -3.0 should return -6.0");
    }

    @Test
    public void testAddMixedNumbers() {
        double result = calculator.add(1.0, -2.0, 3.0);
        assertEquals(2.0, result, 0.0001, "Adding mixed numbers 1.0, -2.0, 3.0 should return 2.0");
    }

    // --- Test Cases for Subtract Method ---

    @Test
    public void testSubtractNoValues() {
        double result = calculator.subtract();
        assertEquals(0.0, result, 0.0001, "Subtracting no numbers should return 0.0");
    }

    @Test
    public void testSubtractSingleValue() {
        double result = calculator.subtract(5.0);
        assertEquals(5.0, result, 0.0001, "Subtracting a single number should return the number itself");
    }

    @Test
    public void testSubtractPositiveNumbers() {
        double result = calculator.subtract(10.0, 3.0, 2.0);
        assertEquals(5.0, result, 0.0001, "Subtracting 10.0 - 3.0 - 2.0 should return 5.0");
    }

    @Test
    public void testSubtractNegativeNumbers() {
        double result = calculator.subtract(-10.0, -3.0, -2.0);
        assertEquals(-5.0, result, 0.0001, "Subtracting negative numbers -10.0 - (-3.0) - (-2.0) should return -5.0");
    }

    @Test
    public void testSubtractMixedNumbers() {
        double result = calculator.subtract(10.0, -3.0, 2.0);
        assertEquals(11.0, result, 0.0001, "Subtracting mixed numbers 10.0 - (-3.0) - 2.0 should return 11.0");
    }

    // --- Test Cases for Multiply Method ---

    @Test
    public void testMultiplyNoValues() {
        double result = calculator.multiply();
        assertEquals(1.0, result, 0.0001, "Multiplying no numbers should return 1.0 (identity for multiplication)");
    }

    @Test
    public void testMultiplySingleValue() {
        double result = calculator.multiply(5.0);
        assertEquals(5.0, result, 0.0001, "Multiplying a single number should return the number itself");
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        double result = calculator.multiply(2.0, 3.0, 4.0);
        assertEquals(24.0, result, 0.0001, "Multiplying 2.0 * 3.0 * 4.0 should return 24.0");
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        double result = calculator.multiply(-2.0, -3.0, -4.0);
        assertEquals(-24.0, result, 0.0001, "Multiplying negative numbers -2.0 * -3.0 * -4.0 should return -24.0");
    }

    @Test
    public void testMultiplyMixedNumbers() {
        double result = calculator.multiply(2.0, -3.0, 4.0);
        assertEquals(-24.0, result, 0.0001, "Multiplying mixed numbers 2.0 * -3.0 * 4.0 should return -24.0");
    }

    // --- Test Cases for Divide Method ---

    @Test
    public void testDivideNoValues() {
        double result = calculator.divide();
        assertEquals(1.0, result, 0.0001, "Dividing no numbers should return 1.0 (identity for division)");
    }

    @Test
    public void testDivideSingleValue() {
        double result = calculator.divide(5.0);
        assertEquals(5.0, result, 0.0001, "Dividing a single number should return the number itself");
    }

    @Test
    public void testDividePositiveNumbers() {
        double result = calculator.divide(100.0, 5.0, 2.0);
        assertEquals(10.0, result, 0.0001, "Dividing 100.0 / 5.0 / 2.0 should return 10.0");
    }

    @Test
    public void testDivideNegativeNumbers() {
        double result = calculator.divide(-100.0, -5.0, -2.0);
        assertEquals(-10.0, result, 0.0001, "Dividing negative numbers -100.0 / -5.0 / -2.0 should return -10.0");
    }

    @Test
    public void testDivideMixedNumbers() {
        double result = calculator.divide(100.0, -5.0, 2.0);
        assertEquals(-10.0, result, 0.0001, "Dividing mixed numbers 100.0 / -5.0 / 2.0 should return -10.0");
    }

    @Test
    public void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(100.0, 0.0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Division by zero should throw ArithmeticException with message 'Cannot divide by zero'");
    }
}
