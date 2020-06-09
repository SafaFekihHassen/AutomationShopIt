Feature: shopping feature

  Scenario Outline: Test shopping senario
    Given User acess to application  
    When User login into app enters <email> and <password>
    And User click login button 
    And login successful
    And User click shop button
    And User acess product window and choose category
    And user click detail button
    And User ckick add to cart button
    Then product is aded to list of orders
    
     Examples: 
    | email | password|
    | tunis    | tunis   |
   
    
    