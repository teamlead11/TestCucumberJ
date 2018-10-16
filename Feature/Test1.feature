#Author: your.email@your.domain.com
@Regression @us12345
Feature: To test demoqa registration page

  Background: Given The user is in demoqa page

  @Smoke @tag1 @Sprint1
  Scenario: To test firstname and lastname text box
    When The user enters firstname and lastname
      | fname    | lname    |
      | greens   | tech     |
      | selenium | java     |
      | selenium | cucumber |
    Then The user verifies entered firstname and lastname
      | fname  | lname |
      | greens | tech  |

  @tag2 @Sprint2
  Scenario Outline: to test fname and lastname test1
    And The user logs in
    When The user enters firstname "<fname>" and lastname "<lname>"
    And The user selects the dropdown
    Then The user verifies entered firstname "<fname>" and lastname "<lname>"
    And The user verifies the title

    Examples: 
      | fname    | lname    |
      | greens   | tech     |
      | selenium | java     |
      | selenium | cucumber |
