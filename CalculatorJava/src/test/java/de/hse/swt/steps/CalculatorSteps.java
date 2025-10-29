package de.hse.swt.steps;

import static org.junit.Assert.assertEquals;

import de.hse.swt.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

    private Calculator calculator;
    private double result;

    @Given("I have a Calculator and two numbers")
    public void i_do_hava_a_calculator_and_two_numbers() {
        this.calculator = new Calculator();
    }

    @When("I perform addition on {double} and {double}")
    public void i_perform_addition_on_two_numbers(double number1, double number2) {
        this.result = this.calculator.add(number1, number2);
    }

    @When("I perform substraction on {double} and {double}")
    public void i_perform_substraction_on_two_numbers(double number1, double number2) {
        this.result = this.calculator.subtract(number1, number2);
    }

    @Then("the result should be {double}")
    public void i_receive_the_result(double expected) {
        assertEquals(expected, this.result, 0.0001);
    }
}
