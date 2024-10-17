# xyzTesting 

This repository contains implementations of a simple **Calculator** applications in different programming languages as part of the Software Testing module (SWB 105 6043) at Esslingen University of Applied Sciences. It provides examples of different kinds of test implementations including unit testing, integration testing and more in different programming languages. Dependent of the programming languages you want to 
investigate, you might need to install and setup dependencies in your system.
More information in each of the actual code examples within the subdirectories.

    Disclaimer: All content is for educational purposes only. I do not intend for the content to be a substitute for professional usage.

    Ausschlussklausel: Alle Inhalte dienen ausschließlich Bildungszwecken. Der Inhalt ist nicht für die professionelle Nutzung gedacht.

## Use Case: Calculator with Logger

In this project, we implement a Calculator that supports basic arithmetic operations—addition, subtraction, multiplication, and division—with an integrated logging feature. The key use case revolves around providing accurate and efficient calculations while optionally logging each operation in a flexible, language-independent manner.

The Calculator class (or module, depending on the language) is designed to handle a series of numeric inputs and perform the requested arithmetic operation. Alongside this functionality, the Logger interface (or function pointer in C) allows external components to log each calculation step. This is particularly useful for auditing, debugging, or monitoring the calculator’s behavior in real-world applications.

### Key Components:

1.	`Calculator`:
  * The Calculator provides four core methods: add, subtract, multiply, and divide. Each of these methods operates on an array or list of numbers, applying the appropriate arithmetic operation.
  * The divide operation is designed to handle special cases like division by zero. In such cases, the function either logs an error or returns a default value (such as 0.0), depending on the implementation.
  * Each arithmetic operation can optionally log its behavior, making the Calculator versatile in environments where tracking the calculations is crucial (e.g., financial applications or data analysis)
  2.	`Logger`:
  * The Logger acts as a flexible logging mechanism. In object-oriented languages like Java and Python, this can be an interface or protocol. In procedural languages like C, this is handled via function pointers.
  * By passing a Logger implementation or function, each operation in the Calculator can output log messages describing the operation performed, including the operands and the result. This promotes separation of concerns, as the Calculator handles computation while the Logger handles output or tracking.

## Project Overview

The following table provides an overview of the implementations in each language, the operations supported, and the unit testing libraries used.

| Language  | Source Directory     | Supported Tests               | Unit Testing Library                                                         |
|-----------|----------------------|-------------------------------|------------------------------------------------------------------------------|
| Java      | `/CalculatorJava/`   | Unit tests (incl. Mock Tests) | [JUnit 5](https://junit.org/junit5/) | [Mockito](https://site.mockito.org/)  |
| Python    | `/CalculatorPython/` | Unit tests (excl. Mock Tests) | [unittest](https://docs.python.org/3/library/unittest.html)                  |
| C         | `/CalculatorC/`      | Unit tests (incl. Mock Tests) | [CUnit](http://cunit.sourceforge.net/)                                       |

## Abstract: Calculator with Logger - Highlighting the Use Case

In this project, we implement a Calculator that supports basic arithmetic operations—addition, subtraction, multiplication, and division—with an integrated logging feature. The key use case revolves around providing accurate and efficient calculations while optionally logging each operation in a flexible, language-independent manner.

The Calculator class (or module, depending on the language) is designed to handle a series of numeric inputs and perform the requested arithmetic operation. Alongside this functionality, the Logger interface (or function pointer in C) allows external components to log each calculation step. This is particularly useful for auditing, debugging, or monitoring the calculator’s behavior in real-world applications.

### Key Components:

1.	`Calculator`:
  * The Calculator provides four core methods: add, subtract, multiply, and divide. Each of these methods operates on an array or list of numbers, applying the appropriate arithmetic operation.
  * The divide operation is designed to handle special cases like division by zero. In such cases, the function either logs an error or returns a default value (such as 0.0), depending on the implementation.
  * Each arithmetic operation can optionally log its behavior, making the Calculator versatile in environments where tracking the calculations is crucial (e.g., financial applications or data analysis)
  2.	`Logger`:
  * The Logger acts as a flexible logging mechanism. In object-oriented languages like Java and Python, this can be an interface or protocol. In procedural languages like C, this is handled via function pointers.
  * By passing a Logger implementation or function, each operation in the Calculator can output log messages describing the operation performed, including the operands and the result. This promotes separation of concerns, as the Calculator handles computation while the Logger handles output or tracking.

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