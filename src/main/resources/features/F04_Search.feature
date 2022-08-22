@smoke

Feature: F04_Search | users could use search functionality to use find products

  Scenario Outline: user could search using product name
    When User enter product name or SKU <termOfSearch>
    Then Verify URL contains "https://demo.nopcommerce.com/search?q="
    And  Count number of search results
    And  Verify each result contains the search term <termOfSearch>

    Examples:
      | termOfSearch |
      | book       |
      | laptop     |
      | nike       |


  Scenario Outline: User could search for product using sku
    When User enter product name or SKU <termOfSearch>
    Then Go to the product page
    And  Verify the product page contains the SKU <termOfSearch>
    Examples:
      | termOfSearch |
      | SCI_FAITH   |
      | APPLE_CAM   |
      | SF_PRO_11   |
