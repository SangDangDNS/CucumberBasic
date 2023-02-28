Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home Page
    Given I launch the Chrome Browser
    When I open orange hrm homepage
    Then I verify that the logo present on Page
    And I close the Browser

