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

#ifndef CALCULATOR_H
#define CALCULATOR_H

/**
 * @brief A function pointer for logging messages.
 * If logging is not needed, this can be NULL.
 */
typedef void (*LogFunction)(const char* message);

/**
 * @brief Adds an array of numbers.
 *
 * @param numbers An array of double values to be added.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The sum of the numbers.
 */
double add(double* numbers, int count, LogFunction logger);

/**
 * @brief Subtracts an array of numbers.
 *
 * @param numbers An array of double values where the first number is the base
 *                and the rest are subtracted from it.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The result of subtracting the numbers.
 */
double subtract(double* numbers, int count, LogFunction logger);

/**
 * @brief Multiplies an array of numbers.
 *
 * @param numbers An array of double values to be multiplied.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The product of the numbers.
 */
double multiply(double* numbers, int count, LogFunction logger);

/**
 * @brief Divides an array of numbers.
 *
 * @param numbers An array of double values where the first number is divided
 *                by the rest. Division by zero will terminate the program.
 * @param count The number of elements in the array.
 * @param logger A logging function pointer (can be NULL for no logging)
 * @return The result of dividing the numbers.
 */
double divide(double* numbers, int count, LogFunction logger);

#endif // CALCULATOR_H
