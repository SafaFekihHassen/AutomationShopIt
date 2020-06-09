Feature: Login feature

  Scenario Outline: Test login with valid credentials
    Given User access to login window
    When User should enters valid <email> and <password>
    Then User is navigated into homepage
    
    Examples: 
    | email | password|
    | tunis    | tunis   |
