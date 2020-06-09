Feature: Register a new user 

  Scenario Outline: Test registration with some credentials
    Given User access to shopit application
    When User click register button
    And User acess to register window
    And User tapes <email> and <username> and <password> and <repassword>
    Then user account is succeffuly created  
   
    
    Examples: 
    | username | email   | password| repassword|
    | tounes    | tounes | tounes| tounes |