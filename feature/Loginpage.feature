
#This Login feature testcase

Feature: This Login pagae
 I want to login successfully.
 
@login, @regrssion
   Scenario Outline: Title of your scenario
    Given User is on login page
    When user enters Right usernam"<username>"
    And user enters Right password"<password>"
    And clicks on submit
    Then browse close
    
 Examples: 
 
 | username  | password  | 
| manoj@gmail.com | Test2322 | 
| man@yaoo.com | TTesting2 | 

  
  