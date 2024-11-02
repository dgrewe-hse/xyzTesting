# Copyright (c) 2024. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
# nder the terms of the GNU General Public License version 3 only, as
# published by the Free Software Foundation.
#
# This code is distributed for educational purposes only, but WITHOUT
# ANY WARRANTY; See the GNU General Public License version 3 for more
# details (a copy is included in the LICENSE file that
# accompanied this code).
#
# author: Dennis Grewe
# version: 1.0


class Calculator:
    """
    A simple calculator that supports basic arithmetic operations like
    addition, subtraction, multiplication, and division.
    """

    def add(self, *numbers):
        """
        Adds a series of numbers.

        :param numbers: A variable number of arguments representing the numbers to be added.
        :return: The sum of the provided numbers. Returns 0 if no numbers are provided.
        """
        return sum(numbers)

    def subtract(self, *numbers):
        """
        Subtracts numbers in sequence. If no numbers are provided, returns 0.0.

        :param numbers: A variable number of arguments where the first number is the starting point
                        and the rest are subtracted from it.
        :return: The result of subtracting the numbers in sequence.
        """
        if len(numbers) == 0:
            return 0.0
        return numbers[0] - sum(numbers[1:])

    def multiply(self, *numbers):
        """
        Multiplies a series of numbers. If no numbers are provided, returns 1.0 (identity for multiplication).

        :param numbers: A variable number of arguments representing the numbers to be multiplied.
        :return: The product of the provided numbers.
        """
        result = 1.0
        for num in numbers:
            result *= num
        return result

    def divide(self, *numbers):
        """
        Divides numbers in sequence. If no numbers are provided, returns 1.0 (identity for division).
        Raises ZeroDivisionError if a division by zero is attempted.

        :param numbers: A variable number of arguments where the first number is divided by the rest.
        :return: The result of dividing the numbers in sequence.
        :raises ZeroDivisionError: If division by zero is attempted.
        """
        if len(numbers) == 0:
            return 1.0
        result = numbers[0]
        for num in numbers[1:]:
            if num == 0:
                raise ZeroDivisionError("Cannot divide by zero")
            result /= num
        return result
