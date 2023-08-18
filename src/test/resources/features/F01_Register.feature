Feature: User Registration

  Scenario: Verify that user can register using valid data successfully
    Given user is in home page
    When user clicks on register button
    And select gender
    And enter first name
    And enter last name
    And enter date of birth
    And enter email
    And enter company
    And enter password
    And enter confirmed password
    And clicks on register button
    Then user registration success message is displayed
