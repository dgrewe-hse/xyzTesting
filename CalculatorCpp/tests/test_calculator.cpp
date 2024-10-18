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

#include <gtest/gtest.h>
#include <memory>
#include "Calculator.h"
#include "Logger.h"
#include <iostream>

// Concrete implementation of Logger for testing
class TestLogger : public Logger {
public:
    void log(const std::string& message) override {
        std::cout << "Test Log: " << message << std::endl;
    }
};

/**
 * @brief Test class for Calculator, containing unit tests for arithmetic operations.
 */
class CalculatorTest : public ::testing::Test {
protected:
    std::unique_ptr<Logger> logger;
    std::unique_ptr<Calculator> calculator;

    void SetUp() override {
        logger = std::make_unique<TestLogger>();
        calculator = std::make_unique<Calculator>(logger.get());
    }
    void TearDown() override {}
};

// Unit test for add operation
TEST_F(CalculatorTest, AddTest) {
    std::vector<double> numbers = {1.0, 2.0, 3.0};
    EXPECT_EQ(calculator->add(numbers), 6.0);
}

// Unit test for subtract operation
TEST_F(CalculatorTest, SubtractTest) {
    std::vector<double> numbers = {10.0, 3.0, 2.0};
    EXPECT_EQ(calculator->subtract(numbers), 5.0);
}

// Unit test for multiply operation
TEST_F(CalculatorTest, MultiplyTest) {
    std::vector<double> numbers = {2.0, 3.0, 4.0};
    EXPECT_EQ(calculator->multiply(numbers), 24.0);
}

// Unit test for divide operation
TEST_F(CalculatorTest, DivideTest) {
    std::vector<double> numbers = {100.0, 5.0, 2.0};
    EXPECT_EQ(calculator->divide(numbers), 10.0);
}

// Unit test for division by zero
TEST_F(CalculatorTest, DivideByZeroTest) {
    std::vector<double> numbers = {10.0, 0.0};
    EXPECT_THROW(calculator->divide(numbers), std::runtime_error);
}
