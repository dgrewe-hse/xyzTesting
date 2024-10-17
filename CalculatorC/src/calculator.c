/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include "calculator.h"
#include <stdio.h>
#include <stdlib.h>

/**
 * @brief Adds an array of numbers.
 *
 * @param numbers An array of double values to be added.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The sum of the numbers.
 */
double add(double* numbers, int count, LogFunction logger) {
    double result = 0.0;
    for (int i = 0; i < count; i++) {
        result += numbers[i];
    }
    if (logger != NULL) {
        logger("Adding numbers");
    }
    return result;
}

/**
 * @brief Subtracts an array of numbers.
 *
 * @param numbers An array of double values where the first number is the base
 *                and the rest are subtracted from it.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The result of subtracting the numbers.
 */
double subtract(double* numbers, int count, LogFunction logger) {
    if (count == 0) {
        return 0.0;
    }
    double result = numbers[0];
    for (int i = 1; i < count; i++) {
        result -= numbers[i];
    }
    if (logger != NULL) {
        logger("Subtracting numbers");
    }
    return result;
}

/**
 * @brief Multiplies an array of numbers.
 *
 * @param numbers An array of double values to be multiplied.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The product of the numbers.
 */
double multiply(double* numbers, int count, LogFunction logger) {
    if (count == 0) {
        return 1.0; // Identity for multiplication
    }
    double result = 1.0;
    for (int i = 0; i < count; i++) {
        result *= numbers[i];
    }
    if (logger != NULL) {
        logger("Multiplying numbers");
    }
    return result;
}

/**
 * @brief Divides an array of numbers.
 *
 * @param numbers An array of double values where the first number is divided
 *                by the rest. Division by zero will terminate the program.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The result of dividing the numbers.
 */
/**
 * @brief Divides an array of numbers and handles division by zero gracefully.
 *
 * @param numbers An array of double values where the first number is divided
 *                by the rest.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The result of dividing the numbers, or 0.0 if division by zero occurs.
 */
double divide(double* numbers, int count, LogFunction logger) {
    if (count == 0) {
        if (logger != NULL) {
            logger("Attempted division with no values");
        }
        return 1.0; // Identity for division
    }
    double result = numbers[0];
    for (int i = 1; i < count; i++) {
        if (numbers[i] == 0) {
            if (logger != NULL) {
                logger("Error: Division by zero attempted");
            }
            return 0.0; // Return 0.0 instead of exiting to not terminate mock test
        }
        result /= numbers[i];
        if (logger != NULL) {
            logger("Dividing numbers");
        }
    }
    return result;
}