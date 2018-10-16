#Author: your.email@your.domain.com
@tag
Feature: To check text boxes in demoqa

  @smoke @env2
  Scenario Outline: To Verify fname and lastname
    Given The user is in demoqa registartion page
    When The user enter firstnameam "<fname>" and last name "<lname>"
    Then The user verifies the "<fname>" and "<lname>" in the text box

    Examples: 
      | fname  | lname    |
      | greens | tech     |
      | sam    | asupathy |
