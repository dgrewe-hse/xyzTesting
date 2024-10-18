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

#include <vector>
#include "Logger.h"

/**
 * @class Calculator
 * @brief A class that provides basic arithmetic operations (addition, subtraction,
 *        multiplication, division) and supports logging during operations.
 */
class Calculator {
public:
    /**
     * @brief Constructor for the Calculator class.
     * @param logger An optional logger to log operations (can be nullptr for no logging).
     */
    Calculator(Logger* logger = nullptr);

    /**
     * @brief Adds a list of numbers.
     * @param numbers A vector of double values.
     * @return The sum of all numbers in the vector.
     */
    double add(const std::vector<double>& numbers);

    /**
     * @brief Subtracts a list of numbers from the first number.
     * @param numbers A vector of double values.
     * @return The result of subtracting all numbers from the first.
     */
    double subtract(const std::vector<double>& numbers);

    /**
     * @brief Multiplies a list of numbers.
     * @param numbers A vector of double values.
     * @return The product of all numbers.
     */
    double multiply(const std::vector<double>& numbers);

    /**
     * @brief Divides a list of numbers.
     * @param numbers A vector of double values.
     * @return The result of dividing the first number by the rest.
     * @throws std::runtime_error if division by zero is attempted.
     */
    double divide(const std::vector<double>& numbers);

private:
    Logger* logger;  ///< Logger for logging operations

    /**
     * @brief Logs a message if a logger is present.
     * @param message The message to be logged.
     */
    void log(const std::string& message) const;
};

#endif // CALCULATOR_H