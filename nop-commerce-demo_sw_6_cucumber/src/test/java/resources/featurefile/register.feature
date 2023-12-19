Feature: Register Test
Background: User is on homepage
  Given I am on homepage
  When I click on register link

  Scenario: Verify User Should Navigate To Register Page Successfully
    Then  I should see the Registered Link

  Scenario: Verify That FirstName, LastName, Email, Password And Confirm Password Fields Are Mandatory
    And I should navigate to register page successfully
    And I click on Register Button
    Then I should see the error message that "First Name is required."
    Then I should see the error message that is "Last name is required."
    Then I should see the error message thatE "Email is required."
    Then I should see the error message thatpw  "Password is required."
    Then I should see the error message thatpwr "Password is required."

  Scenario: Verify That User Should Create Account Successfully
    And I Select gender
    And I Enter firstname
    And I Enter lastname
    And I Select Date of birth day
    And I Select Date of birth month
    And I Select Date of birth year
    And I enter the email address
    And I enter the password
    And I enter the confirm password
    And I click on register button
    Then I should register successfully
    Then I should see the message "Your registration completed"



