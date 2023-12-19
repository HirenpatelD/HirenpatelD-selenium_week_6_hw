Feature: Login Test
  As user I want to login into nop commerce website
  Background: User is on homepage
#    Given I am on homepage
    When I click on login link
  @smoke, @regression
  Scenario: User should navigate to login page successfully
    Then Welcome message is displayed

  @sanity, @regression
  Scenario: Verify the error message with invalid credentials
    And I enter email "Peter@gmail.com"
    And I enter password "Peter122"
    And I click on login button
    Then I should see the error message

  @regression
  Scenario: Verify user should login successfully with valid credentials
    And I enter email "jk@gmail.com"
    And I enter password "pqrs123"
    And  I click on login button
    Then  I should see the logout Button


  Scenario:  Verify user should logout successfully with valid credentials
    And I enter email "jk@gmail.com"
    And I enter password "pqrs123"
    And I click on login button
    And  I should see the logout link
    And I click on logout button
    Then I should see login link


  Scenario Outline: Verify the error message with invalid credentials
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    And I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |