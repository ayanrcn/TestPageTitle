Feature: Verify site titles

Scenario: Verify Google site title
    Given I launch the browser
    When I open "https://www.google.com"
    Then the page title should contain "Google"

Scenario: Verify Cricbuzz site title
    Given I launch the browser
    When I open "https://www.cricbuzz.com"
    Then the page title should contain "Cricbuzz"
