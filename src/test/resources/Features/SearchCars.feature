@Search-Cars
Feature: Validation of car search page 
In order to validate that 
the search car page is working fine
we will do the acceptance testing

@Searc-Cars-Positive
  Scenario: Validate search cars page
  
    Given I am on the Home Page "https://www.carsguide.com.au" of carsguide website
    When I move to the menu
    |    Menu     |
    | buy + sell  |
    | reviews     |
    And I click on "Search Cars" link
    And I select car brand  as "BMW" from Any Make dropdown
    And I select car model as "1 Series" from Any Model dropdown
    And I select Location as "NSW - Sydney" from Any Location dropdown
    And I select Price as "$10,000" from Price dropdown
    And I click on Find_My_Next_Car button 
    Then I should see the list of searched cars 
    And  The page title should be "Bmw 1 Series Under 10000 for Sale Sydney NSW | carsguide"

 
