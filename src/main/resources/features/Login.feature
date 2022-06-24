@testALL
@Feature2
Feature: Login with valid data
  Background: User open browser and go to login page
    Given user opens browser
    And user navigates to ecommerce website

  Scenario: user login with a valid username and password
    When user opens login page
    And user enter email "sffg@gmail.com" and password "123456789@"
    Then press login button
