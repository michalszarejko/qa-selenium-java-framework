Feature: Homepage
  As random user I want to go to homepage and see all available information

  Scenario: Go to homepage
    Given User opens browser
    When User navigates to homepage
    Then User sees logo

  # Scenario: Spider scan
    # Given User opens browser
    # When User navigates to homepage
    # And User is login into staging
    # Then Spider scan is launched with Max Depth set to 1
