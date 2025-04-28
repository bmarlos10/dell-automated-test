Feature: Fill out sample application form

  Scenario: Successfully fill and submit the application form
    Given I open the application page
    When I fill out all forms and submit
    Then I should see the success message
