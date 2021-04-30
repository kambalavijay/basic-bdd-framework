Feature: Amazon Login feature

  Scenario: Login to Amazon.in
    Given A user opens Amazon.in
    When User clicks on SignIn
    Then Verify login text appears on the screen
    Then User enters email address