# Calculator Application in C++

## Overview

This project implements a **Calculator** class that supports basic arithmetic operations—**addition**, **subtraction**, **multiplication**, and **division**—along with optional logging functionality. It includes both **unit tests** and **mock tests** using the **Google Test** and **Google Mock** frameworks.

## Project Structure

    CalculatorProject/
    ├── include/
    │   ├── Calculator.h               # Calculator header
    │   └── Logger.h                   # Logger interface header
    ├── src/
    │   └── Calculator.cpp             # Calculator implementation
    ├── tests/
    │   ├── test_calculator.cpp        # Unit tests
    │   ├── test_calculator_mock.cpp   # Mock tests using Google Mock
    ├── CMakeLists.txt                 # CMake configuration
    └── README.md                      # Project explanation (this file)

## Prerequisites

Before building and running the tests, make sure you have the following installed:

- **CMake**: Version 3.10 or later.
- **Google Test and Google Mock**: These are required to run the unit and mock tests.

### Installing Google Test and Google Mock

#### On Ubuntu:

```bash
sudo apt-get install libgtest-dev
sudo apt-get install cmake
````

You may need to build Google Mock from source, as it is not always packaged with Google Test:

```bash
cd /usr/src/gtest
sudo cmake CMakeLists.txt
sudo make
sudo cp *.a /usr/lib
```

#### On MacOS (via Homebrew):

```bash
brew install cmake googletest
```

## Building the Project

You can build the project using CMake:

```bash
mkdir build
cd build
cmake ..
make
```

This will build two test executables in the `build` directory:

* CalculatorUnitTests: Runs the unit tests for the Calculator.
* CalculatorMockTests: Runs the mock tests to verify logging functionality.

## Running the Tests

To run the tests, use the following command:

```bash
cd build
ctest

Test project .../xyzTesting/CalculatorCpp/build
    Start 1: CalculatorUnitTests
1/2 Test #1: CalculatorUnitTests ..............   Passed    0.20 sec
    Start 2: CalculatorMockTests
2/2 Test #2: CalculatorMockTests ..............   Passed    0.21 sec

100% tests passed, 0 tests failed out of 2

Total Test time (real) =   0.41 sec
```
