# Calculator Application in C

## Overview

This project implements a simple **Calculator** in C that performs basic arithmetic operations like addition, subtraction, multiplication, and division. It also includes unit tests using **CUnit** for verifying the functionality of the calculator.

## Features

- **Addition**: Add an array of numbers.
- **Subtraction**: Subtract an array of numbers from the first number.
- **Multiplication**: Multiply an array of numbers.
- **Division**: Divide an array of numbers, with safety checks to prevent division by zero.

## Project Structure

    CalculatorProject/
    ├── Makefile               # Automates compilation and testing
    ├── README.md              # Project documentation
    ├── src/                   # Source files
    │   ├── calculator.c       # Calculator implementation
    │   └── calculator.h       # Calculator header file
    ├── tests/                 # Test files
    │   └── test_calculator.c  # Unit tests for the calculator
    └── build/                 # Directory for compiled binaries

## Prerequisites

- **C Compiler**: Ensure you have a C compiler installed. You can use GCC, Clang, or any compatible C compiler.
  
  To verify the installation of GCC, run:

  ```bash
  gcc --version
  ```
- **CUnit**: The project uses CUnit for unit testing. You can install CUnit with the following commands:

On Ubuntu/Debian:

  ```bash
  sudo apt-get install libcunit1-dev
  ```

On macOS (with Homebrew):

  ```bash
  brew install cunit
  ```

## Building the Project

This project uses a Makefile to automate the build process. You can build the project using the following command:

  ```bash
  make
  ```

## Running tests

After building the project, you can run the unit tests using:

  ```bash
  make test
  ./build/calculator_test


      CUnit - A unit testing framework for C - Version 2.1-3
      http://cunit.sourceforge.net/


  Suite: CalculatorTestSuite
    Test: test_add ...passed
    Test: test_subtract ...passed
    Test: test_multiply ...passed
    Test: test_divide ...passed

  Run Summary:    Type  Total    Ran Passed Failed Inactive
                suites      1      1    n/a      0        0
                tests      4      4      4      0        0
              asserts     12     12     12      0      n/a

  Elapsed time =    0.000 seconds
  ```

This will run the unit tests for addition, subtraction, multiplication, and division using the CUnit framework. The results will be printed in verbose mode, showing which tests passed or failed.

If you want to clean the compiled binaries and object files, use:

  ```bash
  make clean
  ```

## License

This project is licensed under the Apache License, Version 2.0. See the [LICENSE](../LICENSE) file for more details.
