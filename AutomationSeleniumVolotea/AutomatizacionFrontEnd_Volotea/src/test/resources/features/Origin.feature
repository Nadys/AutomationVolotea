Feature: Select origin
  As AQ Automation
  I want to automate the origin section of the web page
  To validate the functionality origin

  Background: Select Selector Origin
    Given The user in the search section

  Scenario: Select Selector Origin
    When The user selects the country of origin
    Then it will show available country


