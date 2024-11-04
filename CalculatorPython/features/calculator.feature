
Feature: Calculator operations

  Scenario: Addition of two numbers
    Given I have a calculator
    When I add 5 and 3
    Then the result should be 8

  Scenario: Subtraction of two numbers
    Given I have a calculator
    When I subtract 5 from 10
    Then the result should be 5

  Scenario: Multiplication of two numbers
    Given I have a calculator
    When I multiply 4 and 2
    Then the result should be 8

  Scenario: Division of two numbers
    Given I have a calculator
    When I divide 10 by 2
    Then the result should be 5
