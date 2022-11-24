@smoke
Feature: F05_hoverCategories | user can hover on the main categories and click on sub categories

  Scenario: user can hover on Apparel menu and go to Cell phones sub category
    Given user hovers on "Apparel" main category
    When user clicks on "Clothing" sub category
    Then "Clothing" page is opened