Feature: Cart feature

  Scenario Outline: Test cart functionnality
    Given User acess to application shopit 
    When User enters his  <email> and his <password>
    And User click login into application 
    And User access home successfuly
    And User click cart button
    And User click remove button of one product
    And User click order now button
    And User acess to facutre window
    And User click place order button
    And User entrer <adresse> , <contactNo> and check payment method
    And User click checkout button
    Then transaction should be saved 
    
     Examples: 
    | email | password| adresse| contactNo |
    | tunis | tunis   | sqyqdq | tunis     |  
   
    