# Copyright (c) 2024. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
#nder the terms of the GNU General Public License version 3 only, as
# published by the Free Software Foundation.  
#
# This code is distributed for educational purposes only, but WITHOUT
# ANY WARRANTY; See the GNU General Public License version 3 for more 
# details (a copy is included in the LICENSE file that
# accompanied this code).
# tests/test_calculator.py

import unittest
from calculator.calculator import Calculator

class TestCalculatorAddition(unittest.TestCase):
    """
    This class contains unit tests for the addition functionality of the Calculator.
    Each method tests different scenarios for the add() method.
    """

    def setUp(self):
        """
        Setup a Calculator instance for each test.
        """
        self.calculator = Calculator()

    def test_add_no_values(self):
        """Test adding with no values (should return 0.0)."""
        self.assertEqual(self.calculator.add(), 0.0, "Adding no values should return 0.0")

    def test_add_single_value(self):
        """Test adding a single number (should return the number itself)."""
        self.assertEqual(self.calculator.add(5.0), 5.0, "Adding a single number should return the number itself")

    def test_add_positive_numbers(self):
        """Test adding multiple positive numbers (e.g., 1.0 + 2.0 + 3.0)."""
        self.assertEqual(self.calculator.add(1.0, 2.0, 3.0), 6.0, "Adding positive numbers should return 6.0")

    def test_add_negative_numbers(self):
        """Test adding multiple negative numbers (e.g., -1.0 + -2.0 + -3.0)."""
        self.assertEqual(self.calculator.add(-1.0, -2.0, -3.0), -6.0, "Adding negative numbers should return -6.0")

    def test_add_mixed_numbers(self):
        """Test adding a mix of positive and negative numbers (e.g., 1.0 + -2.0 + 3.0)."""
        self.assertEqual(self.calculator.add(1.0, -2.0, 3.0), 2.0, "Adding mixed numbers should return 2.0")


class TestCalculatorSubtraction(unittest.TestCase):
    """
    Unit tests for subtraction functionality in Calculator.
    """

    def setUp(self):
        """
        Setup a Calculator instance for each test.
        """
        self.calculator = Calculator()

    def test_subtract_no_values(self):
        """Test subtracting with no values (should return 0.0)."""
        self.assertEqual(self.calculator.subtract(), 0.0, "Subtracting no values should return 0.0")

    def test_subtract_single_value(self):
        """Test subtracting a single number (should return the number itself)."""
        self.assertEqual(self.calculator.subtract(5.0), 5.0, "Subtracting a single number should return the number itself")

    def test_subtract_positive_numbers(self):
        """Test subtracting multiple positive numbers (e.g., 10.0 - 3.0 - 2.0)."""
        self.assertEqual(self.calculator.subtract(10.0, 3.0, 2.0), 5.0, "Subtracting positive numbers should return 5.0")

    def test_subtract_negative_numbers(self):
        """Test subtracting multiple negative numbers (e.g., -10.0 - -3.0 - -2.0)."""
        self.assertEqual(self.calculator.subtract(-10.0, -3.0, -2.0), -5.0, "Subtracting negative numbers should return -5.0")

    def test_subtract_mixed_numbers(self):
        """Test subtracting a mix of positive and negative numbers (e.g., 10.0 - -3.0 - 2.0)."""
        self.assertEqual(self.calculator.subtract(10.0, -3.0, 2.0), 11.0, "Subtracting mixed numbers should return 11.0")


class TestCalculatorMultiplication(unittest.TestCase):
    """
    This class contains unit tests for the multiplication functionality of the Calculator.
    Each method tests different scenarios for the multiply() method.
    """

    def setUp(self):
        """
        Setup a Calculator instance for each test.
        """
        self.calculator = Calculator()

    def test_multiply_no_values(self):
        """Test multiplying with no values (should return 1.0)."""
        self.assertEqual(self.calculator.multiply(), 1.0, "Multiplying no values should return 1.0")

    def test_multiply_single_value(self):
        """Test multiplying a single number (should return the number itself)."""
        self.assertEqual(self.calculator.multiply(5.0), 5.0, "Multiplying a single number should return the number itself")

    def test_multiply_positive_numbers(self):
        """Test multiplying multiple positive numbers (e.g., 2.0 * 3.0 * 4.0)."""
        self.assertEqual(self.calculator.multiply(2.0, 3.0, 4.0), 24.0, "Multiplying positive numbers should return 24.0")

    def test_multiply_negative_numbers(self):
        """Test multiplying multiple negative numbers (e.g., -2.0 * -3.0 * -4.0)."""
        self.assertEqual(self.calculator.multiply(-2.0, -3.0, -4.0), -24.0, "Multiplying negative numbers should return -24.0")

    def test_multiply_mixed_numbers(self):
        """Test multiplying a mix of positive and negative numbers (e.g., 2.0 * -3.0 * 4.0)."""
        self.assertEqual(self.calculator.multiply(2.0, -3.0, 4.0), -24.0, "Multiplying mixed numbers should return -24.0")


class TestCalculatorDivision(unittest.TestCase):
    """
    Unit tests for division functionality in Calculator.
    """

    def setUp(self):
        """
        Setup a Calculator instance for each test.
        """
        self.calculator = Calculator()

    def test_divide_no_values(self):
        """Test dividing with no values (should return 1.0)."""
        self.assertEqual(self.calculator.divide(), 1.0, "Dividing no values should return 1.0")

    def test_divide_single_value(self):
        """Test dividing a single number (should return the number itself)."""
        self.assertEqual(self.calculator.divide(5.0), 5.0, "Dividing a single number should return the number itself")

    def test_divide_positive_numbers(self):
        """Test dividing multiple positive numbers (e.g., 100.0 / 5.0 / 2.0)."""
        self.assertEqual(self.calculator.divide(100.0, 5.0, 2.0), 10.0, "Dividing positive numbers should return 10.0")

    def test_divide_negative_numbers(self):
        """Test dividing multiple negative numbers (e.g., -100.0 / -5.0 / -2.0)."""
        self.assertEqual(self.calculator.divide(-100.0, -5.0, -2.0), -10.0, "Dividing negative numbers should return -10.0")

    def test_divide_mixed_numbers(self):
        """Test dividing a mix of positive and negative numbers (e.g., 100.0 / -5.0 / 2.0)."""
        self.assertEqual(self.calculator.divide(100.0, -5.0, 2.0), -10.0, "Dividing mixed numbers should return -10.0")

    def test_divide_by_zero(self):
        """Test dividing by zero (should raise ZeroDivisionError)."""
        with self.assertRaises(ZeroDivisionError):
            self.calculator.divide(100.0, 0.0)

if __name__ == '__main__':
    # This block allows the tests to be run directly using any unittest runner.
    unittest.main()