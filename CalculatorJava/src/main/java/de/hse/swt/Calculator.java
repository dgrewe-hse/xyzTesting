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

import java.util.stream.DoubleStream;

/**
 * A simple Calculator that supports basic arithmetic operations
 * and logs each operation using a LoggerService.
 * 
 * @author Dennis Grewe
 * @version 1.0
 */
public class Calculator {

    /**
     * Adds a series of numbers and logs the operation.
     * @param numbers the numbers to be added
     * @return the sum of all the numbers
     */
    public double add(double... numbers) {
        double result = DoubleStream.of(numbers).sum();
        return result;
    }

    /**
     * Multiplies a series of numbers and logs the operation.
     * @param numbers the numbers to be multiplied
     * @return the product of all the numbers
     */
    public double multiply(double... numbers) {
        double result = DoubleStream.of(numbers).reduce(1, (a, b) -> a * b);
        return result;
    }

    /**
     * Subtracts the numbers in sequence and logs the operation.
     * @param numbers the numbers to be subtracted (first number minus the rest)
     * @return the result of subtracting the numbers in sequence
     */
    public double subtract(double... numbers) {
        if (numbers.length == 0) {
            return 0.0;  // Default return value when no arguments are provided
        }
        return DoubleStream.of(numbers)
                           .skip(1)
                           .reduce(numbers[0], (a, b) -> a - b);
    }

    /**
     * Divides the numbers in sequence and logs the operation.
     * Throws an ArithmeticException if division by zero occurs.
     * @param numbers the numbers to be divided (first number divided by the rest)
     * @return the result of dividing the numbers in sequence
     * @throws ArithmeticException if division by zero is attempted
     */
    public double divide(double... numbers) {
        if (numbers.length == 0) {
            return 1.0;  // Default return value when no arguments are provided
        }
        return DoubleStream.of(numbers)
                           .skip(1)
                           .reduce(numbers[0], (a, b) -> {
                               if (b == 0) {
                                   throw new ArithmeticException("Cannot divide by zero");
                               }
                               return a / b;
                           });
    }
}