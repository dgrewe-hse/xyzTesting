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
#include <gmock/gmock.h>
#include "Calculator.h"
#include "Logger.h"

// Mock Logger class using Google Mock
class MockLogger : public Logger {
public:
    MOCK_METHOD(void, log, (const std::string&), (override));
};

/**
 * @brief Test class for Calculator with MockLogger.
 */
class CalculatorMockTest : public ::testing::Test {
protected:
    std::unique_ptr<MockLogger> mockLogger;    ///< Mock logger for testing log messages
    std::unique_ptr<Calculator> calculator;    ///< Calculator instance with mock logger

    void SetUp() override {
        mockLogger = std::make_unique<MockLogger>();
        calculator = std::make_unique<Calculator>(mockLogger.get());  // Inject mock logger
    }
};

// Test add with logging
TEST_F(CalculatorMockTest, AddLoggingTest) {
    std::vector<double> numbers = {1.0, 2.0, 3.0};
    EXPECT_CALL(*mockLogger, log("Adding numbers"));
    calculator->add(numbers);
}

// Test subtract with logging
TEST_F(CalculatorMockTest, SubtractLoggingTest) {
    std::vector<double> numbers = {10.0, 3.0, 2.0};
    EXPECT_CALL(*mockLogger, log("Subtracting numbers"));
    calculator->subtract(numbers);
}

// Test multiply with logging
TEST_F(CalculatorMockTest, MultiplyLoggingTest) {
    // Arrange
    std::vector<double> numbers = {2.0, 3.0, 4.0};
    EXPECT_CALL(*mockLogger, log("Multiplying numbers")).Times(1);

    // Act
    double result = calculator->multiply(numbers);

    // Assert
    EXPECT_EQ(result, 24.0);
}
