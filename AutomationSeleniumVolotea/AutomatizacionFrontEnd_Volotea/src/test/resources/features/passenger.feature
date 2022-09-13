Feature: Enter Passengers
  As AQ Automation
  I want to enter passenger
  To validate that all passenger have been entered

  Scenario Outline: Enter Passenger Successfully

    Given enter the volotea page
    And accept cookies and select the button passengers
    When the user click the plus button to select more passenger '<adult>', '<child>', '<baby>'
    Then validate that the number of passenger is selected

    Examples:
    | adult  |   child    |   baby     |
    |   1    |     1      |      1     |
    |   3    |     2      |      3     |
    |   5    |     5      |      5     |