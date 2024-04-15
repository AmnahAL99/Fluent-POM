Feature: Register Account
  As a user
  I want to register a new account
  So that I can access the eCommerce website

  Scenario: Registering a new account
    Given I am on the registration page
    When I fill in the registration form with valid details
    And I submit the registration form
    Then I should be registered successfully
