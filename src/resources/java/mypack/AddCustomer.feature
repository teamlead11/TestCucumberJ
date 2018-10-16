#Author: your.email@your.domain.com
@tag
Feature: Add customer

  @tag2
  Scenario Outline: Add customer
    Given The user is in guru login page
    And The user login with the valid credentials
      | username | mngr154050 |
      | password | zamynEs    |
    And navigates to add customer page
    When The user enters customer details "<CustName>","<Gender>","<DOB>","<Address>","<City>","<state>","<PIN>","<Phnum>","<email>" and "<pass>"
    And The user clicks reset button
    Then The user should be in add customer page

    Examples: 
      | CustName | Gender | DOB        | Address   | City    | state | PIN    | Phnum      | email               | pass      |
      | usera    | male   | 11/11/2000 | testuser1 | chennai | TN    | 603103 | 9842512345 | testuser1@gmail.com | user1@123 |
      | userb    | male   | 11/12/2001 | user2     | chennai | tn    | 600119 |  123123987 | user2@gmail.com     | user2@123 |
