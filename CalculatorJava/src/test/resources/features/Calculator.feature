Feature: Calculator Operations

  Scenario: Add two numbers
    Given I have a Calculator
    When I add 5 and 3
    Then the result should be 8

  Scenario: Subtract two numbers
    Given I have a Calculator
    When I subtract 4 and 2
    Then the result should be 2

  Scenario: Multiply two numbers
    Given I have a Calculator
    When I multiply 4 and 2
    Then the result should be 8

  Scenario: Divide two numbers
    Given I have a Calculator
    When I divide 4 and 2
    Then the result should be 2
