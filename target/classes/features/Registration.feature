@testALL
@Feature1
Feature: Register a new user
  Background: User open browser and go to registration page
    Given user opens browser
    And user navigates to ecommerce website
  #Create User1
Scenario: user register with a valid username and password
  When user opens register page
  And user select gender "male"
  And user enter firstname "sherif" and lastname "alaa" and email "sffg@gmail.com" and password "123456789@"
  Then press register button