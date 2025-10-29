
Feature: Calculator Operations
  As a user
  I want to perform basic (addition, substraction, multiplication, division) calculator operations
  So that I can calculate single expressions

  Scenario: Add two numbers
    Given I have a Calculator and two numbers
    When I perform addition on 5 and 7
    Then the result should be 12
