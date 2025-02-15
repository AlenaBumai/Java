Feature: Main page

  Scenario Outline to navigate to Support center page from Main page
    Given Main page is loaded
    When The user clicks button Support center
    Then Support center page is loaded
    Examples:
