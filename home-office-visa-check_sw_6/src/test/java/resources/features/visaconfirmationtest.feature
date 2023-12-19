@regression
Feature: Visitors from different country are coming to UK for different purpose
  In Order to perform successful login
  As a User
  I have to select correct details

  Background: User should click on start button on home page
    Given I am on Home page
    When I click on start button

  @sanity @smoke
  Scenario: Australian user should coming to UK for tourism
    And I select nationality "Australia"
    And I click on continue button
    And I select reason is Tourism
    And I click on a continue button
    Then I get a result "You will not need a visa to come to the UK"

  Scenario: Chilean user coming to the UK for work and plans on staying for longer than six months
    And I select a nationality "Chile"
    And I click continue button
    And I select work and academic visit reason is Work, academic visit or business
    And I click the continue button
    And I select intended to stay for longer than six months
    And I click on the continue button
    And I select have planning to work for Health and care professional
    And I click a continue button
    Then I get result "You need a visa to work in health and care"

  @sanity
  Scenario: Columbian national user coming to the UK to join a partner for a long stay they do have an article 10 or 20 card
    And I select The nationality "Cambodia"
    And I clicks on continue button
    And I select join partner reason is Join partner or family for a long stay
    And I clicks on the continue button
    And I select state My partner of family member have uk immigration status is yes
    And I clicks the continue button
    Then I get the result "You’ll need a visa to join your family or partner in the UK"