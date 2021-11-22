@accueil
Feature: Accueil - Expertest
  ETQ utilisateur je souhaite de acceder a la page Accueil
  Background:
     Given I navigates to ExpertTest
    Then I check the home page
  @accueil-slider
  Scenario: Accueil-Slider
    When I click on the button Commencez
    Then I check  Page Mon Compte is opening
    And I click on the button J achète
    Then I check  Page Boutique is opening
    And I click on the button passez le quizz
     Then I check  Page Quiz is opening