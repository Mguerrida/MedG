@Eboutqiue
Feature:Eboutique-ExpertTest
  Eboutique Page Access 

  @DisplayTest
  Scenario: Check The grid display
    Given I navigates to ExpertTest
    Then I check the home page
    When I click on eboutique button
    Then I check that eboutique Page is displayed "https://www.expertest.tn/boutique/"
    And I click on list view button
    And I click on Grid view button
    Then I check that the list view is displayed
    And check that the grid view is displayed
    When I click on Product Link
   # Then I Check that the Link Product is launched 
    When  i set <keyword> of Reaserch "keyword" 
    And I click on Recherche button 
    Then i check that We redirect to Product Research page "keyword"
    When I add a product to pannel product
    Then I check that a product is added to the pannel
   

Scenario Outline: Check Links Navigation
    Given I check that eboutique Page is displayed "https://www.expertest.tn/boutique/"
    When I click on the  <Link> in step
    Then I check that we redirect to  <URL> in step

    Examples: 
    | Link | URL  |
    |     voucher-de-certification | https://www.expertest.tn/categorie-produit/voucher-de-certification/ |
    |     pack-de-revision | https://www.expertest.tn/categorie-produit/pack-de-revision/   |
    |     non-classe | https://www.expertest.tn/categorie-produit/non-classe/ |
      
  #@DisplayPerList
  #Scenario: Check The display per List
  #Given I navigates to ExpertTest  
  #Then I check the home page 
  #Given I click on Grid view button
  #Then check that the grid view is displayed
  #When I click on Product Link 
  #Then I Check that the Link Product is launched
  
  

