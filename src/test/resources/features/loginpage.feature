Feature: Login functionality for the open cart E-commerce Website

  Background:
    Given I am on the open cart login page

  @smoke
  Scenario Outline: Successfully login with the valid credential
    Given I have entered valid <username> and <password>
    When I click on the login button
    Then I should be logged in successfully

    Examples:
      | username            | password |
      | mytestu52@gmail.com |Cxnew12@  |


  Scenario Outline: Successfully login with the valid credential
    Given I have entered valid <username> and <password>
    When I click on the login button
    Then I should be logged in successfully

    Examples:
      | username            | password |
      | mytestu52@gmail.com |Cxnew12@  |