#Author: your.email@your.domain.com
@regression @newCustomer
Feature: To test new Customer functionality

  @AddNewCustomer
  Scenario Outline: To add new customers
    Given The user is in guru home page
    And The user logged in as manager with credentials
      | mangerUserID | mngr154050 |
      | password     | zamynEs    |
    And The user navigate to new customer page
    When The user enters the customer details "<CustName>","<Gender>","<DOB>","<Address>","<City>","<state>","<PIN>","<Phnum>","<email>" and "<pass>"
    And The user clicks the reset button
    Then The user should be in add customer page

    Examples: 
      | CustName | Gender | DOB        | Address   | City    | state | PIN    | Phnum      | email               | pass      |
      | user1    | male   | 11/11/2000 | testuser1 | chennai | TN    | 603103 | 9842512345 | testuser1@gmail.com | user1@123 |
      | user2    | male   | 11/12/2001 | user2     | chennai | tn    | 600119 |  123123987 | user2@gmail.com     | user2@123 |

    