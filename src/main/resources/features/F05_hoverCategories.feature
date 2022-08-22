@smoke

Feature: hoverCategories Feature

  Scenario:   hover on one of main categories then click on sub category
    Given  hover on random main category
    When   user click on a sub category of product
    Then   verify that the category title is match