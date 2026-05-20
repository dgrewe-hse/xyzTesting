//! # Calculator Rust
//!
//! A basic calculator for showing off rust testing

/// Adds the values of a given array of floats
pub fn add(nums: &[f64]) -> f64 {
    nums.iter().sum()
}

/// Subtracts the values of a given array of floats
pub fn subtract(nums: &[f64]) -> f64 {
    if nums.is_empty() {
        return 0.0;
    }

    nums.iter().skip(1).fold(nums[0], |acc, &x| acc - x)
}

/// Multiplies the values of a given array of floats
pub fn multiply(nums: &[f64]) -> f64 {
    nums.iter().product()
}

/// divides the values of a given array of floats
pub fn divide(nums: &[f64]) -> f64 {
    if nums.is_empty() {
        return 1.0;
    }
    if nums.contains(&0.0) {
        panic!("Cannot divide a number by 0")
    }

    nums.iter().skip(1).fold(nums[0], |acc, &x| acc / x)
}


#[cfg(test)]
mod tests {
    use super::*;

    // Addition
    #[test]
    fn add_no_values() {
        // test adding with no values. Returns 0.0
        let result = add(&[]);
        assert_eq!(result, 0.0)
    }

    #[test]
    fn add_single_value() {
        // test adding a single number. Should return the number
        let result = add(&[5.0]);
        assert_eq!(result, 5.0)
    }

    #[test]
    fn add_positive_numbers() {
        // test adding multiple positive numbers
        let result = add(&[1.0, 2.0, 3.0]);
        assert_eq!(result, 6.0)
    }

    #[test]
    fn add_negative_numbers() {
        // test adding multiple negative numbers
        let result = add(&[-1.0, -2.0, -3.0]);
        assert_eq!(result, -6.0)
    }

    #[test]
    fn add_mixed_numbers() {
        let result = add(&[1.0, -2.0, 3.0]);
        assert_eq!(result, 2.0)
    }

    // Subtraction
    #[test]
    fn subtraction_no_values() {
        // test subtracting with no numbers. Returns 0.0
        let result = subtract(&[]);
        assert_eq!(result, 0.0)
    }

    #[test]
    fn subtract_single_value() {
        // test subtracting a single number. Should return the number
        let result = subtract(&[5.0]);
        assert_eq!(result, 5.0)
    }

    #[test]
    fn subtract_positive_numbers() {
        // test subtracting multiple positive numbers
        let result = subtract(&[10.0, 3.0, 2.0]);
        assert_eq!(result, 5.0)
    }

    #[test]
    fn subtract_negative_numbers() {
        // test subtracting multiple negative numbers
        let result = subtract(&[-10.0, -3.0, -2.0]);
        assert_eq!(result, -5.0)
    }

    #[test]
    fn subtract_mixed_numbers() {
        let result = subtract(&[10.0, -3.0, 2.0]);
        assert_eq!(result, 11.0)
    }

    // Multiplication
    #[test]
    fn multiply_no_values() {
        // test multiply with no values. Returns 1.0
        let result = multiply(&[]);
        assert_eq!(result, 1.0)
    }

    #[test]
    fn multiply_single_value() {
        // test multiply a single number. Should return the number
        let result = multiply(&[5.0]);
        assert_eq!(result, 5.0)
    }

    #[test]
    fn multiply_positive_numbers() {
        // test multiply multiple positive numbers
        let result = multiply(&[2.0, 3.0, 4.0]);
        assert_eq!(result, 24.0)
    }

    #[test]
    fn multiply_negative_numbers() {
        // test multiply multiple negative numbers
        let result = multiply(&[-2.0, -3.0, -4.0]);
        assert_eq!(result, -24.0)
    }

    #[test]
    fn multiply_mixed_numbers() {
        let result = multiply(&[2.0, -3.0, 4.0]);
        assert_eq!(result, -24.0)
    }

    // Division
    #[test]
    fn divide_no_values() {
        // test divide with no values. Returns 1.0
        let result = divide(&[]);
        assert_eq!(result, 1.0)
    }

    #[test]
    fn divide_single_value() {
        // test divide a single number. Should return the number
        let result = multiply(&[5.0]);
        assert_eq!(result, 5.0)
    }

    #[test]
    fn divide_positive_numbers() {
        // test divide multiple positive numbers
        let result = divide(&[100.0, 5.0, 2.0]);
        assert_eq!(result, 10.0)
    }

    #[test]
    fn divide_negative_numbers() {
        // test multiply multiple negative numbers
        let result = divide(&[-100.0, -5.0, -2.0]);
        assert_eq!(result, -10.0)
    }

    #[test]
    fn divide_mixed_numbers() {
        let result = divide(&[100.0, -5.0, 2.0]);
        assert_eq!(result, -10.0)
    }

    #[test]
    #[should_panic(expected = "Cannot divide a number by 0")]
    fn divide_by_zero() {
        let _result = divide(&[100.0, 0.0]);
    }

}
