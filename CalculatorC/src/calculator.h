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
 * @brief Adds an array of numbers.
 *
 * @param numbers An array of double values to be added.
 * @param count The number of elements in the array.
 * @return The sum of the numbers.
 */
double add(double* numbers, int count);

/**
 * @brief Subtracts an array of numbers.
 *
 * @param numbers An array of double values where the first number is the base
 *                and the rest are subtracted from it.
 * @param count The number of elements in the array.
 * @return The result of subtracting the numbers.
 */
double subtract(double* numbers, int count);

/**
 * @brief Multiplies an array of numbers.
 *
 * @param numbers An array of double values to be multiplied.
 * @param count The number of elements in the array.
 * @return The product of the numbers.
 */
double multiply(double* numbers, int count);

/**
 * @brief Divides an array of numbers.
 *
 * @param numbers An array of double values where the first number is divided
 *                by the rest. Division by zero will terminate the program.
 * @param count The number of elements in the array.
 * @return The result of dividing the numbers.
 */
double divide(double* numbers, int count);

#endif // CALCULATOR_H