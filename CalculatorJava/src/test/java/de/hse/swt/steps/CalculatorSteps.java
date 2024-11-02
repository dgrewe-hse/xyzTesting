/** Copyright (c) 2024. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed for educational purposes only, but WITHOUT
 * ANY WARRANTY; See the GNU General Public License version 3 for more
 * details (a copy is included in the LICENSE file that
 * accompanied this code).
 */
package de.hse.swt.steps;

import static org.junit.Assert.assertEquals;

import de.hse.swt.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Step definitions for Calculator feature scenarios, defining behavior-driven steps for addition and multiplication.
 */
public class CalculatorSteps {
    private Calculator calculator;
    private double result;

    /**
     * Initializes a new Calculator instance.
     *
     * This step definition corresponds to the "Given I have a Calculator" step
     * in the Cucumber feature file, setting up the precondition for testing.
     */
    @Given("I have a Calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    /**
     * Adds two double values using the Calculator.
     *
     * This step definition corresponds to the "When I add {double} and {double}" step
     * in the Cucumber feature file, where num1 and num2 are the operands to be added.
     *
     * @param num1 The first operand in the addition operation.
     * @param num2 The second operand in the addition operation.
     */
    @When("I add {double} and {double}")
    public void i_add_and(double num1, double num2) {
        result = calculator.add(num1, num2);
    }

    /**
     * Multiplies two double values using the Calculator.
     *
     * This step definition corresponds to the "When I multiply {double} and {double}" step
     * in the Cucumber feature file, where num1 and num2 are the operands to be multiplied.
     *
     * @param num1 The first operand in the multiplication operation.
     * @param num2 The second operand in the multiplication operation.
     */
    @When("I multiply {double} and {double}")
    public void i_multiply_and(double num1, double num2) {
        result = calculator.multiply(num1, num2);
    }

    /**
     * Subtracts two double values using the Calculator.
     *
     * This step definition corresponds to the "When I subtract {double} and {double}" step
     * in the Cucumber feature file, where num1 and num2 are the operands to be multiplied.
     *
     * @param num1 The first operand in the multiplication operation.
     * @param num2 The second operand in the multiplication operation.
     */
    @When("I subtract {double} and {double}")
    public void i_subtract_and(double num1, double num2) {
        result = calculator.subtract(num1, num2);
    }

    /**
     * Divides two double values using the Calculator.
     *
     * This step definition corresponds to the "When I divide {double} and {double}" step
     * in the Cucumber feature file, where num1 and num2 are the operands to be multiplied.
     *
     * @param num1 The first operand in the multiplication operation.
     * @param num2 The second operand in the multiplication operation.
     */
    @When("I divide {double} and {double}")
    public void i_divide_and(double num1, double num2) {
        result = calculator.divide(num1, num2);
    }

    /**
     * Verifies that the result from the Calculator matches the expected value.
     *
     * This step definition corresponds to the "Then the result should be {double}" step
     * in the Cucumber feature file, where expected is the expected result of the operation.
     *
     * @param expected The expected result of the operation, to be compared with the actual result.
     */
    @Then("the result should be {double}")
    public void the_result_should_be(double expected) {
        assertEquals(expected, result, 0.0001); // Uses a small delta to allow for floating-point precision tolerance.
    }
}
