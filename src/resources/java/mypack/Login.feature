#Author: Greens
@alluser @regression
Feature: To test login functionality

  Background: 
    Given The user is in guru home page

  @user1 @US12345
  Scenario: To test resset button
    When The user enters userID and password
      | username | password |
      | user1    | pass1    |
    And The user click reset button
    Then The user should see the fields empty

  @user2 @us12346
  Scenario: To test resset button
    When The user enters userID and password
      | username | password |
      | user2    | pass2    |
    And The user click reset button
    Then The user should see the fields empty

  @user3 @US12347
  Scenario: To test resset button
    When The user enters userID and password
      | username | password |
      | user3    | pass3    |
    And The user click reset button
    Then The user should see the fields empty

  @user4 @US12347
  Scenario: To test resset button
    When The user enters userID and password
      | username | password |
      | user4    | pass4    |
    And The user click reset button
    Then The user should see the fields empty
