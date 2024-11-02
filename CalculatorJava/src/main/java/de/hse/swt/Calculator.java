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

import de.hse.swt.logging.LoggingService;

/**
 * A simple Calculator that supports basic arithmetic operations
 * and logs each operation using a LoggerService.
 *
 * @author Dennis Grewe
 * @version 1.0
 */
public class Calculator {
    /**
     * Private property to a LoggingService instance.
     */
    private LoggingService loggingService;
    private boolean loggingEnabled;

    /**
     * Constructor with LoggingService.
     * @param loggingService the logger service used to log operations
     */
    public Calculator(LoggingService loggingService) {
        this.loggingService = loggingService;
        this.loggingEnabled = true;
    }

    /**
     * Constructor without LoggingService (logging disabled).
     */
    public Calculator() {
        this.loggingEnabled = false;
    }

    private void log(String message) {
        if (loggingEnabled && loggingService != null) {
            loggingService.log(message);
        }
    }

    /**
     * Adds a series of numbers and logs the operation.
     * @param numbers the numbers to be added
     * @return the sum of all the numbers
     */
    public double add(double... numbers) {
        double result = DoubleStream.of(numbers).sum();
        log("Adding numbers: " + DoubleStream.of(numbers).mapToObj(Double::toString).reduce((a, b) -> a + ", " + b).orElse("None") + " = " + result);
        return result;
    }

    /**
     * Subtracts the numbers in sequence and logs the operation.
     * If no numbers are provided, returns 0.
     * @param numbers the numbers to be subtracted (first number minus the rest)
     * @return the result of subtracting the numbers in sequence
     */
    public double subtract(double... numbers) {
        if (numbers.length == 0) {
            log("No numbers provided for subtraction.");
            return 0.0;
        }
        double result = DoubleStream.of(numbers).skip(1).reduce(numbers[0], (a, b) -> a - b);
        log("Subtracting numbers: " + DoubleStream.of(numbers).mapToObj(Double::toString).reduce((a, b) -> a + ", " + b).orElse("None") + " = " + result);
        return result;
    }

    /**
     * Multiplies a series of numbers and logs the operation.
     * If no numbers are provided, returns 1.
     * @param numbers the numbers to be multiplied
     * @return the product of all the numbers
     */
    public double multiply(double... numbers) {
        double result = DoubleStream.of(numbers).reduce(1, (a, b) -> a * b);
        log("Multiplying numbers: " + DoubleStream.of(numbers).mapToObj(Double::toString).reduce((a, b) -> a + ", " + b).orElse("None") + " = " + result);
        return result;
    }

    /**
     * Divides the numbers in sequence and logs the operation.
     * If no numbers are provided, returns 1.
     * Throws an ArithmeticException if division by zero occurs.
     * @param numbers the numbers to be divided (first number divided by the rest)
     * @return the result of dividing the numbers in sequence
     * @throws ArithmeticException if division by zero is attempted
     */
    public double divide(double... numbers) {
        if (numbers.length == 0) {
            log("No numbers provided for division.");
            return 1.0;
        }
        double result = DoubleStream.of(numbers).skip(1).reduce(numbers[0], (a, b) -> {
            if (b == 0) {
                log("Attempted division by zero.");
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        });
        log("Dividing numbers: " + DoubleStream.of(numbers).mapToObj(Double::toString).reduce((a, b) -> a + ", " + b).orElse("None") + " = " + result);
        return result;
    }
}
