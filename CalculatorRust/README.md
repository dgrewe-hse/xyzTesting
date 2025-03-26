# CalculatorRust

This project implements a simple **Calculator** class that supports basic arithmetic operations like addition, subtraction, multiplication, and division. The operations are designed to handle multiple input values by using array references (`&[f64]`). Unit tests are provided using the `cargo test` command

## Features

- **Addition**: Add any number of positive, negative, or mixed numbers.
- **Subtraction**: Subtract multiple numbers in sequence.
- **Multiplication**: Multiply a series of numbers.
- **Division**: Divide numbers in sequence, with a check for division by zero.
- **Edge cases**: Handle cases with no input, single input, and division by zero.

## Installation and Setup

### Prerequisites

- **Rust**: Ensure that Rust and Cargo are installed on your machine. You can download it from [rust-lang.org](https://www.rust-lang.org/learn/get-started).


## Run the tests


```bash
$ cargo test # in the root directory of the project
```

## Directory Structure

    CalculatorRust/
    ├── src/
    │   └── lib.rs
    ├── cargo.toml    
    ├── cargo.lock    
    ├── README.md

## Further Reading

Useful information regarding writing automated tests in Rust can be found in the [Rust book chapter 11](https://doc.rust-lang.org/book/ch11-00-testing.html)