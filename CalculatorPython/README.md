# CalculatorPython

This project implements a simple **Calculator** class that supports basic arithmetic operations like addition, subtraction, multiplication, and division. The operations are designed to handle multiple input values (using `*args`). Unit tests are provided using Python's `unittest` framework.

## Features

- **Addition**: Add any number of positive, negative, or mixed numbers.
- **Subtraction**: Subtract multiple numbers in sequence.
- **Multiplication**: Multiply a series of numbers.
- **Division**: Divide numbers in sequence, with a check for division by zero.
- **Edge cases**: Handle cases with no input, single input, and division by zero.

## Installation and Setup

### Prerequisites

- **Python 3.x**: Ensure that Python 3.x is installed on your machine. You can download it from [python.org](https://www.python.org/downloads/).
- **pip**: Ensure that pip, Python’s package installer, is available. You can install it using:

```bash
python3 -m ensurepip --upgrade
```

## Installation

After cloning the project, you need to setup a virtual python environment and install the project dependencies. Please make sure you have installed either [Python venv](https://docs.python.org/3/library/venv.html) or [Python pipenv](https://pipenv.pypa.io/en/latest/) for installing the dependencies.
We will continue the example using Python *vevn*.

```bash
$ source venv/bin/activate  # activate your virtual environment
$ pip3 install -r requirements.txt
```

## Run the tests

You can  run the test using the [pytest](https://docs.pytest.org/en/stable/) framework.

```bash
$ pytest # in the root directory of the project
```

## Directory Structure

    CalculatorProject/
    ├── calculator/
    │   └── __init__.py
    │   └── calculator.py
    ├── tests/
    │   └── __init__.py
    │   └── test_calculator.py
    ├── setup.py
    ├── README.md


