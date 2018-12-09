#Author: your.email@your.domain.com
@tag
Feature: Edit customer

  @tag1
  Scenario: edit customer phone number
    Given The user logins to guru home page
      | username | mngr161823 |
      | password | yzavunY    |
    And The user navigates to edit customer page
    And The user enters the customer ID
      | custID | 27996 |
    When The user modify the phone number
      | PhoneNumber | 1234567891 |
    Then The customer should see the sucess message "edited successfully"
