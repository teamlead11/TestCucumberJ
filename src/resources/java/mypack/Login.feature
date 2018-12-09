#Author: your.email@your.domain.com
@login @smoke
Feature: To test login functionality

  Background: 
    Given The user is in demo guru page
    And some precondition

  @us1235 @validLogin
  Scenario: verify Login with valid credential1
    When The user enters valid username,password
      | username   | password |
      | mngr161823 | yzavunY  |
      | user2      | pass2    |
      | user3      | pass3    |
      | user4      | pass4    |
    And The user clicks the login button
    Then The user should be in managers home page

  @us1235 @validLogin
  Scenario: verify Login with valid credential2
    When The user enters valid username,password
      | username   | password |
      | mngr161823 | yzavunY  |
      | user2      | pass2    |
      | user3      | pass3    |
      | user4      | pass4    |
    And The user clicks the login button
    Then The user should be in managers home page
