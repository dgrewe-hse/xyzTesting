#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# Documentation:
# The CMakeLists.txt file defines the build configuration for the CalculatorProject.
# It builds two test executables: one for unit tests and another for mock tests.
# Google Test and Google Mock are required to run the tests.

# CMake minimum required version
cmake_minimum_required(VERSION 3.14)

# Project name and language settings
project(CalculatorCpp)

# Set C++ standard to C++14
set(CMAKE_CXX_STANDARD 14)

# fetch content for google test and google mock
include(FetchContent)
FetchContent_Declare(
    googletest
    URL https://github.com/google/googletest/archive/release-1.10.0.zip
)
FetchContent_MakeAvailable(googletest)

# Enable testing
enable_testing()

# Include directories for the project
include_directories(include)

# Find and link Google Test (GTest) libraries
# Google Test and Google Mock are required to run both test suites
find_package(GTest REQUIRED)
find_package(GMock REQUIRED)

# Add executables:
# 1. CalculatorUnitTests: for running unit tests in tests/test_calculator.cpp
# 2. CalculatorMockTests: for running mock tests in tests/test_calculator_mock.cpp
add_executable(CalculatorUnitTests
    src/Calculator.cpp
    tests/test_calculator.cpp
)

add_executable(CalculatorMockTests
    src/Calculator.cpp
    tests/test_calculator_mock.cpp
)

# Link Google Test and Google Mock
target_link_libraries(CalculatorUnitTests GTest::GTest GTest::Main)
target_link_libraries(CalculatorMockTests GTest::GTest GTest::Main GTest::gmock GTest::gmock_main)

# Add include directories for Google Test and Google Mock
target_include_directories(CalculatorUnitTests PRIVATE ${GTEST_INCLUDE_DIRS})
target_include_directories(CalculatorMockTests PRIVATE ${GTEST_INCLUDE_DIRS})

# Add tests to CTest
add_test(NAME CalculatorUnitTests COMMAND CalculatorUnitTests)
add_test(NAME CalculatorMockTests COMMAND CalculatorMockTests)
