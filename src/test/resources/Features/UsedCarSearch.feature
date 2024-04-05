@Used
Feature: Validation of car search page 
In order to validate that 
the search car page is working fine
we will do the acceptance testing

@Used-Positive
  Scenario: Validate search cars page
  
    Given I am on the Home Page "https://www.carsguide.com.au" of carsguide website
    When I move to the menu
    |    Menu     |
    | buy + sell  |
    | reviews     |
    And I click on "Used" link from Used Cars search page
    And I select car brand  as "Audi" from Any Make dropdown from Used Cars search page
    And I select car model of Used Cars search page
    | Car_Model |
    |   A4      |
    |   A3      |
    And I select Location as "SA - All" from Any Location dropdown from Used Cars search page
    And I select Price as "$10,000" from Price dropdown of Used Cars search page
    And I click on Find_My_Next_Car button from Used Cars search page
    Then I should see the list of Used cars  from Used Cars search page
    And  The page title should be "Used Audi A4 Under 10000 for Sale SA - Second Hand Audi A4 Under $10k in SA | carsguide"

 