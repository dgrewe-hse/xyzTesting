package de.hse.swt.steps;

import static org.junit.Assert.assertEquals;

import de.hse.swt.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Step definitions for Calculator BDD feature tests.
 * 
 * This class contains all the Cucumber step definitions that map Gherkin
 * feature file steps to actual test code implementation.
 */
public class CalculatorSteps {

    private Calculator calculator;
    private double result;

    /**
     * Initializes a new Calculator instance.
     * Step: "Given I have a Calculator"
     */
    @Given("I have a Calculator")
    public void i_have_a_calculator() {
        this.calculator = new Calculator();
    }

    /**
     * Performs addition operation on two numbers.
     * Step: "When I add {double} and {double}"
     * 
     * @param number1 the first number
     * @param number2 the second number
     */
    @When("I add {double} and {double}")
    public void i_add_two_numbers(double number1, double number2) {
        this.result = this.calculator.add(number1, number2);
    }

    /**
     * Performs subtraction operation on two numbers.
     * Step: "When I subtract {double} and {double}"
     * 
     * @param number1 the first number (minuend)
     * @param number2 the second number (subtrahend)
     */
    @When("I subtract {double} and {double}")
    public void i_subtract_two_numbers(double number1, double number2) {
        this.result = this.calculator.subtract(number1, number2);
    }

    /**
     * Performs multiplication operation on two numbers.
     * Step: "When I multiply {double} and {double}"
     * 
     * @param number1 the first number
     * @param number2 the second number
     */
    @When("I multiply {double} and {double}")
    public void i_multiply_two_numbers(double number1, double number2) {
        this.result = this.calculator.multiply(number1, number2);
    }

    /**
     * Performs division operation on two numbers.
     * Step: "When I divide {double} and {double}"
     * 
     * @param number1 the dividend
     * @param number2 the divisor
     */
    @When("I divide {double} and {double}")
    public void i_divide_two_numbers(double number1, double number2) {
        this.result = this.calculator.divide(number1, number2);
    }

    /**
     * Verifies that the calculated result matches the expected value.
     * Step: "Then the result should be {double}"
     * 
     * @param expected the expected result value
     */
    @Then("the result should be {double}")
    public void the_result_should_be(double expected) {
        assertEquals(expected, this.result, 0.0001);
    }
}
