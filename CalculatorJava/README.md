# Calculator Application

## Overview

This project implements a simple **Calculator** class that supports basic arithmetic operations like addition, subtraction, multiplication, and division. The operations are designed to handle multiple input values (using varargs) and utilize the Java **Stream API** for more efficient processing. Additionally, unit tests are provided to verify the correctness of the implementation using JUnit 5.

## Features

- **Addition**: Add any number of positive, negative, or mixed numbers.
- **Subtraction**: Subtract multiple numbers in sequence.
- **Multiplication**: Multiply a series of numbers.
- **Division**: Divide numbers in sequence, with a check for division by zero.
- **Edge cases**: Handle cases with no input, single input, and division by zero.

## Use Case

This calculator is designed for basic arithmetic operations where you might want to:
- Perform multiple calculations in one call.
- Process a series of numbers for addition, subtraction, multiplication, or division.
- Handle scenarios with both positive and negative numbers efficiently.

The calculator uses floating-point arithmetic to accommodate a wide range of numeric values.

## Installation and Setup

### Prerequisites

To run the examples, you need to install the following components:

* Java Developer Kit 11 (or higher) - to run and develop Java applications. You can download and install the JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html) or use the package manager for your operating system.
* Maven - tool to build Java applications and run tests. You can install it by following the instructions [here](https://maven.apache.org/install.html).
* JUnit 5 (via Maven) - library to develop and execute JUnit tests
* Git (optional) - to clone this repository.

## Project Structure

    CalculatorProject/
    ├── src/
    │   ├── main/
    │   │   └── java/
    │   │       └── de/hse/swt/
    │   │           └── Calculator.java
    │   └── test/
    │       └── java/
    │           └── de/hse/swt/
    │               └── CalculatorTest.java
    ├── pom.xml
    └── README.md

## Dependencies

* JUnit 5: This is used for unit testing. The dependency is managed via Maven in the pom.xml file.

## How to Build and Run the Tests

### Linux

For Linux, you can run the following commands to install the pre-requisits:

```sh
$ sudo apt install openjdk-11-jdk maven git # to install (change version number for other Java versions), maven and git all in one
$ java -version # check if java installation was correct
$ maven -version # check if maven installation was correct
$ # (optional)
$ git --version # check if git installation was correct
```

### MacOS

For macOS, we assume you have already installed [Homebrew](https://brew.sh/). If not please do it before executing the followng commands.

```sh
$ brew -v   # check if homebrew is installed
$ brew install java maven git # to install latest java jdk, maven and git all in one
$ java -version # check if java installation was correct
$ maven -version # check if maven installation was correct
# (optional)
$ git --version # check if git installation was correct
```

## Build and Run the project

Just head into one of the projects and execute the following commands, e.g., to build the project and run test cases using Apache Maven:

```sh
$ mvn clean compile # to build / compile the source code
$ mvn test # to execute the defined test cases
```
