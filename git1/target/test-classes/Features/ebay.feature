@tag
Feature: Ebay Assignment
  
  @ebay1
  Scenario: Ebay login registration
    Given User is on Ebay login page
    When user clicks on register link and user fills the required fields for registration process
    And clicks on submit button
    Then User will see new account created
    
   