
@quizzpage
Feature: Quizz _ Expertest
  I want to access to Quizz page
Background:

   Given I navigates to ExpertTest
   Then I check the home page
   When i click on Quizz menu 

 @access_to_quizz_page
  Scenario: Access to Quizz Page 
  Then i verify Quizz page Title 
 
 @access_to_lean_six_segma_Exam_page
 Scenario: Access to Lean Six segma Page
 When I click on LeanExam link 
 Then I verify the Title of Lean sig Sigma Exam Page 
 Then Iscroll down to until the Yellow Belt Text Tab 
 Then I verify the Display of Yellow Belt Text 
 Then I click on Orange Belt tab 
 And I verify the Display of Orange Belt Text 
 Then I Click on Green Belt Tab 
 And i Verify the Display of Green Belt Text 
 
 @access_to_Developpement 
 Scenario: Access to Develoopemet Page 
 When I click on Devoloppent link 
 Then I verify the Title of Developpement Page 
 Then i Scroll down Devoloppement page until the Tab 
 And I verify the display of all Devoloppement page Quizz Tab   
 And I click on all element to verify them 
 
 @access_to_ISTQB_Page
 Scenario: Access to ISTQB Exam Page
 When I click on ISTQB link 
 Then I verify The Title of ISTQB Quizz Page 
 Then I scroll down until the Tab of Quizz
  And I click on each element of the  Tab  
 
 @access_to_Agile_Scrum_Quizz_Page
 Scenario: Access to Agile Exam Page 
 When I Click on Agile Scrum link 
 Then I Verify The Title of Agile Scrum Quizz Page 
 Then I Scroll down the page until the Tab of Quizz
 And I click on the element of tab 
 
 @access_to_A_4Q_Foundation_Quizz_Page
 Scenario: Access to A4Q Foundation QuizzPage
 When I Click on  A4Q Foundation  link 
 Then I Verify The Title of  A4Q Foundation Quizz Page 
 Then I Scroll down the page until the Tab of A4Q Quizz
 And I click on the elements of A4Q Foundation Quizz tab 
 
 
  