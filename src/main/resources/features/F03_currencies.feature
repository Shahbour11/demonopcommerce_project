@smoke


Feature: Currencies | user could select a currency and find prices in that currency

  Scenario: user could select and view prices in a currency successfully
    When Select Euro currency from the dropdown list
    Then Prices changes with symbol "€"