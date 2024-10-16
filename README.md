# xyzTesting 

This repository contains implementations of a simple **Calculator** applications in different programming languages as part of the Software Testing module (SWB 105 6043) at Esslingen University of Applied Sciences. Each implementation supports basic arithmetic operations such as addition, subtraction, multiplication, and division, and includes unit tests to ensure correctness.

    Disclaimer: All content is for educational purposes only. I do not intend for the content to be a substitute for professional usage.

    Ausschlussklausel: Alle Inhalte dienen ausschließlich Bildungszwecken. Der Inhalt ist nicht für die professionelle Nutzung gedacht.

# Purpose

This code repository is for education purposes only. It provides examples of different kinds of test implementations including unit testing, integration testing and more in different programming languages. Dependent of the programming languages you want to 
investigate, you might need to install and setup dependencies in your system.
More information in each of the actual code examples within the subdirectories.

## Project Overview

The following table provides an overview of the implementations in each language, the operations supported, and the unit testing libraries used.

| Language  | Source Directory     | Supported Operations                            | Unit Testing Library                                          |
|-----------|----------------------|-------------------------------------------------|---------------------------------------------------------------|
| Java      | `/CalculatorJava/`   | Addition, Subtraction, Multiplication, Division | [JUnit 5](https://junit.org/junit5/)                          |
| Python    | `/CalculatorPython/` | Addition, Subtraction, Multiplication, Division | [unittest](https://docs.python.org/3/library/unittest.html)   |
| C         | `/CalculatorC/`      | Addition, Subtraction, Multiplication, Division | [CUnit](http://cunit.sourceforge.net/)                        |

### Java (JUnit 5)

The Java implementation is located in the `/CalculatorJava/` directory. It uses **JUnit 5** for unit testing. The calculator supports basic arithmetic operations and uses streams to process numbers.

- **Source Files**: `Calculator.java`, `CalculatorTest.java`
- **Unit Tests**: Implemented using [JUnit 5](https://junit.org/junit5/).

### Python (unittest)

The Python implementation is located in the `/CalculatorPython/` directory. It uses the built-in **unittest** framework for unit testing. The calculator supports the same arithmetic operations as in the Java version.

- **Source Files**: `calculator.py`, `test_calculator.py`
- **Unit Tests**: Implemented using Python's built-in [unittest](https://docs.python.org/3/library/unittest.html).

### C (CUnit)

The C implementation is located in the `/CalculatorC/` directory. It uses **CUnit** for unit testing. The calculator operates on arrays of numbers and provides the same basic arithmetic operations.

- **Source Files**: `calculator.c`, `calculator.h`, `test_calculator.c`
- **Unit Tests**: Implemented using [CUnit](http://cunit.sourceforge.net/).

# Contact

You found any problem, issue in this repository or you do have an idea or proposal how to improve the content? Be my guest and create an issue in this repository.

# License

This repository is licensed under the Apache License, Version 2.0. See the [LICENSE](./LICENSE) file for more information.