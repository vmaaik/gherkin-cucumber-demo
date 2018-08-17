Feature: Login into account
  Existing github user should be able to log into account using correct credentials

  Scenario: Login into account with correct credentials
    Given User navigates to stackoverflow website
    And Click on the login button on the homepage
    And User enters a valid username
    And User enters a valid password
    When User click on login button
    Then User should be taken to the successful login page
