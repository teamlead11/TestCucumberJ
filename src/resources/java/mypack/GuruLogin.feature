#Author: your.email@your.domain.com
@login
Feature: To Test login Functinality

  Background: 
    Given The user is in guru login page

  @login1 @us123
  Scenario: Login with valid credential1
    When The user login with valid username and password
      | username   | password |
      | mngr154050 | zamynEs  |
      | mngr153618 | hevujEp  |
      | mngr156940 | myjujEr  |
    Then The user should be logged in

  @login2 @124
  Scenario: Login with valid credential2
    When The user login with valid username and password
      | username   | password |
      | mngr154050 | zamynEs  |
      | mngr153618 | hevujEp  |
      | mngr156940 | myjujEr  |
    Then The user should be logged in

  @login3 @125
  Scenario: Login with valid credential3
    When The user login with valid username and password
      | username   | password |
      | mngr154050 | zamynEs  |
      | mngr153618 | hevujEp  |
      | mngr156940 | myjujEr  |
    Then The user should be logged in
