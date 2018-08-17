Feature: Login into account
  Existing github user should not be able to log into account using incorrect credentials

  Scenario Outline: Login into account with correct credentials
    Given web browser is at the github home page
    And Click on the login button on the homepage
    And User enters a valid <username> and <password>
    When User click on login button
    Then User should be taken to the successful login page

    Examples:
      | username | password |
      | vmaaik   | xxxxxxxx |
      | vmaaik   | xxxxxxxx |