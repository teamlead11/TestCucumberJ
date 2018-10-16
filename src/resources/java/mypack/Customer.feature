#Author: your.email@your.domain.com
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The user is in guru login page
    When The user enters username "<username>" and password "<password>"
    And The user click reset button
    Then The fields should be empty

    Examples: 
      | username | password |
      | abc      | abc      |
      |      123 |      123 |
      | @#$%     | @#$%^    |
