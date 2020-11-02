Feature: feature to test login functionality

  @E2E
  Scenario Outline: 
    : Check login is successful with valid credentials

    Given user is on login page
    When user enters  <username> and <password>
    And clicks on button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | user1    | 1234    |
      | user2    | 5678    |
