#Author: your.email@your.domain.com
@tariff
Feature: Title of your feature
  I want to use this template for my feature file
 
  @addTarif
  Scenario Outline: Title of your scenario outline
    Given The user is in demo guru page
    And The user navigates to add tarif plan page
    When The user enters the valid plan details "<Monthly Rental>","<Local Minutes>","<International Minutes>","<SMS Pack>","<Local Charges>","<International Charges>" and "<SMS>"
    And The user clicks the submit button
    Then The user should see the success message

    Examples: 
      | Monthly Rental | Local Minutes | International Minutes | SMS Pack | Local Charges | International Charges | SMS |
      |            500 |             1 |                     1 |       50 |             2 |                     2 |   5 |
      |            400 |             1 |                     1 |       50 |             2 |                     2 |   5 |
      |            300 |             1 |                     1 |       50 |             2 |                     2 |   5 |
