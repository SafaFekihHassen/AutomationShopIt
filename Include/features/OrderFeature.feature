Feature: Cart feature

  Scenario Outline: Test order functionnality
    Given User acess into login window 
    When User enters <email> , <password>
    And User click the login button 
    And User access his account 
    And User click order button
    And User acess list of orders
    And User click detail button of one order
    Then User access detail of order 
    
     Examples: 
    | email | password|
    | tunis | tunis   | 
   
    