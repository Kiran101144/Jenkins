
Feature: Title of your feature

  Scenario: Title of your scenario
    Given verify "https://rahulshettyacademy.com"
    When Add place
    Then Verify Status Code 200
    Then Status Response Body "OK"
