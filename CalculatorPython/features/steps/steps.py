# Copyright (c) 2024. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
# nder the terms of the GNU General Public License version 3 only, as
# published by the Free Software Foundation.
#
# This code is distributed for educational purposes only, but WITHOUT
# ANY WARRANTY; See the GNU General Public License version 3 for more
# details (a copy is included in the LICENSE file that
# accompanied this code).

from behave import given, when, then
from calculator import Calculator


@given("I have a calculator")
def step_given_i_have_a_calculator(context):
    context.calculator = Calculator()


@when("I add {num1:d} and {num2:d}")
def step_when_i_add(context, num1, num2):
    context.result = context.calculator.add(num1, num2)


@when("I subtract {num1:d} from {num2:d}")
def step_when_i_subtract(context, num1, num2):
    context.result = context.calculator.subtract(num2, num1)


@when("I multiply {num1:d} and {num2:d}")
def step_when_i_multiply(context, num1, num2):
    context.result = context.calculator.multiply(num1, num2)


@when("I divide {num1:d} by {num2:d}")
def step_when_i_divide(context, num1, num2):
    context.result = context.calculator.divide(num1, num2)


@then("the result should be {expected_result:d}")
def step_then_the_result_should_be(context, expected_result):
    assert context.result == expected_result
