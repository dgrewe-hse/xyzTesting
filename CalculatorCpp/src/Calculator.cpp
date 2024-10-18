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

#include "Calculator.h"
#include <stdexcept>
#include <numeric>
#include <sstream>

// Add this constructor implementation at the beginning of the file
Calculator::Calculator(Logger* logger) : logger(logger) {}

/**
 * @brief Logs a message if a logger is provided.
 * @param message The message to be logged.
 */
void Calculator::log(const std::string& message) const {
    if (logger) {
        logger->log(message);
    }
}

/**
 * @brief Adds a list of numbers.
 * @param numbers A vector of double values.
 * @return The sum of all numbers.
 */
double Calculator::add(const std::vector<double>& numbers) {
    double result = std::accumulate(numbers.begin(), numbers.end(), 0.0);
    log("Adding numbers");
    return result;
}

/**
 * @brief Subtracts a list of numbers from the first number.
 * @param numbers A vector of double values.
 * @return The result of the subtraction.
 */
double Calculator::subtract(const std::vector<double>& numbers) {
    if (numbers.empty()) return 0.0;
    double result = numbers[0];
    for (size_t i = 1; i < numbers.size(); ++i) {
        result -= numbers[i];
    }
    log("Subtracting numbers");
    return result;
}

/**
 * @brief Multiplies a list of numbers.
 * @param numbers A vector of double values.
 * @return The product of all numbers.
 */
double Calculator::multiply(const std::vector<double>& numbers) {
    if (numbers.empty()) return 1.0;
    double result = std::accumulate(numbers.begin(), numbers.end(), 1.0, std::multiplies<>());
    log("Multiplying numbers");
    return result;
}

/**
 * @brief Divides a list of numbers.
 * @param numbers A vector of double values.
 * @return The result of the division.
 * @throws std::runtime_error if division by zero is attempted.
 */
double Calculator::divide(const std::vector<double>& numbers) {
    if (numbers.empty()) return 1.0;
    double result = numbers[0];
    for (size_t i = 1; i < numbers.size(); ++i) {
        if (numbers[i] == 0) {
            log("Division by zero error");
            throw std::runtime_error("Division by zero");
        }
        result /= numbers[i];
    }
    log("Dividing numbers");
    return result;
}
