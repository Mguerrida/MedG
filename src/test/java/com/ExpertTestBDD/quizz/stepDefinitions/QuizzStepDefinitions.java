package com.ExpertTestBDD.quizz.stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.ExpertTestBDD.quizz.page.QuizzPage;
import com.ExpertTestBDD.quizz.stepDefinitions.UserAccountDTO;
import com.ExpertTestBDD.quizz.stepDefinitions.readFiles;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class QuizzStepDefinitions extends CommonMethods {
	private StringBuffer verificationErrors = new StringBuffer();
private QuizzPage quizzpage = new QuizzPage();
@SuppressWarnings("unused")
private CommonMethods commonmethods = new CommonMethods();	
public QuizzStepDefinitions () {
	driver = Setup.driver;
	PageFactory.initElements(driver, QuizzPage.class);
	
    }
/*
 * The aim of this method is to test The opening of Quizz Page and Verif the title of page  
 */
@When("^i click on Quizz menu$")
public void i_click_on_Quizz_menu() throws Throwable {
logger.info("Quizz Page opening");
quizzpage.goToQuizzPg();
logger.info("Quizz Page is correctly opned");
}

@Then("^i verify Quizz page Title$")
public void i_verify_Quizz_page_Title() throws Throwable {
logger.info("Verification of Quizz page Title ");	
quizzpage.getPgTitle(driver);
assertEquals(quizzpage.getPgTitle(driver),QuizzPage.titleQuizzPage);
System.out.println(quizzpage.getPgTitle(driver));
logger.info("The title is correct");
}

/*
 * The aim of this method is to test The opening of Lean Six Segma Quizz Page ,
 * Verify the title of page and to check all tabulation into the page 
 */

@When("^I click on LeanExam link$")
public void i_click_on_LeanExam_link() throws Throwable {
  logger.info("Access to Lean Six Segma Exam Page ");
 quizzpage.goToLeanSixSegmaPg();
 logger.info("Lean Six Segma Exam Page is opened ");
}

@Then("^I verify the Title of Lean sig Sigma Exam Page$")
public void i_verify_the_Title_of_Lean_sig_Sigma_Exam_Page() throws Throwable {
  logger.info("Verification of the title");
  quizzpage.getPgTitle(driver);
  assertEquals(quizzpage.getPgTitle(driver), "lean Exam - ExperTest Quizz ISTQB" );
  logger.info("The title is correct");
}

@Then("^Iscroll down to until the Yellow Belt Text Tab$")
public void iscroll_down_to_until_the_Yellow_Belt_Text_Tab() throws Throwable {
	explicitWait(5, QuizzPage.getTextinyellowbelt());
	scrollToElement(driver, QuizzPage.getTextinyellowbelt() );
	logger.info("Scrolling down the page to find Tabulation");
	}
@Then("^I verify the Display of Yellow Belt Text$")
public void i_verify_the_Display_of_Yellow_Belt_Text() throws Throwable {
	logger.info("click on yellow Belt Tab ");
	assertEquals("The Lean Six Sigma Yellow Belt Examination Mock Exam V1.1",quizzpage.yellowBeltTextcontenu() );
    logger.info("Yellow tabulation text  is checked  ");
}

@Then("^I click on Orange Belt tab$")
public void i_click_on_Orange_Belt_tab() throws Throwable {
	logger.info("click on Orange Belt Tab ");
	quizzpage.gotoorangebelt();
	logger.info("Orange Belt Tab is Selected ");
}

@Then("^I verify the Display of Orange Belt Text$")
public void i_verify_the_Display_of_Orange_Belt_Text() throws Throwable {
	assertEquals("The Lean Six Sigma Orange Belt Examination Mock Exam V1.1",quizzpage.orangeBetTextcontenu());
	logger.info("Orange Tabulation Text is Correctly Dispalyed");
}

@Then("^I Click on Green Belt Tab$")
public void i_Click_on_Green_Belt_Tab() throws Throwable {
   logger.info("click on Green Belt Tab ");
   quizzpage.gotogreenbelt();
   logger.info("Green Belt Tab is Selected ");
	
}

@Then("^i Verify the Display of Green Belt Text$")
public void i_Verify_the_Display_of_Green_Belt_Text() throws Throwable {
 assertEquals("The Lean Six Sigma Green Belt Examination Mock Exam V1.1", quizzpage.greenBeltTextcontenu()); 
 logger.info("Green Tabulation Text is Correctly Dispalyed");	
}


/*
* The aim of this method is to test The opening of Developpement a Quizz Page ,
* Verify the title of page and to check all tabulation into the page 
*/

@When("^I click on Devoloppent link$")
public void i_click_on_Devoloppent_link() throws Throwable {

	logger.info("Navigate to Developpment Exam page" );
	quizzpage.goToDeveloppementPg();
	logger.info("Devolppement Exam page is correctly opened ");
}

@Then("^I verify the Title of Developpement Page$")
public void i_verify_the_Title_of_Developpement_Page() throws Throwable {
   logger.info("Verify the Title of Developpement Exam page ");
   assertEquals("Développement - ExperTest Quizz ISTQB", quizzpage.getPgTitle(driver)); 
   logger.info("The title of Page is correct ");
   
}

@Then("^i Scroll down Devoloppement page until the Tab$")
public void i_Scroll_down_Devoloppement_page_until_the_Tab() throws Throwable {
    logger.info("Scrooling The dev Page Down ");
     scrollerBottomdown(400);
	logger.info("Page is scrolled down");
 	
}

@Then("^I verify the display of all Devoloppement page Quizz Tab$")
public void i_verify_the_display_of_all_Devoloppement_page_Quizz_Tab() throws Throwable {
 explicitWaitVisibility(5,quizzpage.Android_button());
 logger.info("Android button is displayed"); 	
}

@Then("^I click on all element to verify them$")
public void i_click_on_all_element_to_verify_them() throws NullPointerException, IOException {
	List<UserAccountDTO> list=readFiles.readThemeData("C:\\Users\\Yassine\\git\\experttestbdd\\DATA.xlsx",1);
	 int i = list.size() ;
	System.out.println(i);
	
	for (UserAccountDTO tabDevPO : list)
	    {
		
	driver.findElement(By.partialLinkText(tabDevPO.getTabDevloppment())).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	logger.info(tabDevPO.getTabDevloppment());
			 
		 }
	} 

/*
* The aim of this method is to test The opening of ISTQB  a Quizz Page ,
* Verify the title of page and to check all tabulation into the page 
*/

@When("^I click on ISTQB link$")
public void i_click_on_ISTQB_link() throws Throwable {

	logger.info("Navigate to ISTQB Quizz Exam page" );
	quizzpage.goToIstqbPg();
	logger.info("ISTQB Quizz Exam page is correctly opened ");
}

@Then("^I verify The Title of ISTQB Quizz Page$")
public void i_verify_The_Title_of_ISTQB_Quizz_Page() throws Throwable {
	logger.info("Verify the Title of ISTQB QUIZZ Exam page ");
	   assertEquals("ISTQB - ExperTest Quizz ISTQB", quizzpage.getPgTitle(driver)); 
	   logger.info("The title of Page is correct ");
}

@Then("^I scroll down until the Tab of Quizz$")
public void i_scroll_down_until_the_Tab_of_Quizz() throws Throwable {
	logger.info("Scrooling The dev Page Down ");
    scrollerBottomdown(400);
	logger.info("Page is scrolled down");
}

@Then("^I click on each element of the  Tab$")
public void i_click_on_each_element_of_the_Tab() throws Throwable {

	List<UserAccountDTO> list=readFiles.readThemeData("C:\\Users\\Yassine\\git\\experttestbdd\\DATA.xlsx",0);
	 int i = list.size() ;
	System.out.println(i);
	
	for (UserAccountDTO tabIstqb : list)
	    {
		
	driver.findElement(By.partialLinkText(tabIstqb.gettabIstqb())).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	logger.info(tabIstqb.gettabIstqb());
			 
		 }
}

/*
* The aim of this method is to test The opening of Agile Scrum Quizz Page ,
* Verify the title of page and to check all tabulation into the page 
*/

@When("^I Click on Agile Scrum link$")
public void i_Click_on_Agile_Scrum_link() throws Throwable {
	logger.info("Navigate to AGILE SCRUM Quizz Exam page" );
	quizzpage.goToAgileScrumPg();
	logger.info("AGILE SCRUM Quizz Exam page is correctly opened ");
}

@Then("^I Verify The Title of Agile Scrum Quizz Page$")
public void i_Verify_The_Title_of_Agile_Scrum_Quizz_Page() throws Throwable {
	logger.info("Verify the Title of AGILE SCRUM QUIZZ Exam page ");
	   assertEquals("Agil SCRUM - ExperTest Quizz ISTQB", quizzpage.getPgTitle(driver)); 
	   logger.info("The title of Page is correct ");
}

@Then("^I Scroll down the page until the Tab of Quizz$")
public void i_Scroll_down_the_page_until_the_Tab_of_Quizz() throws Throwable {
	logger.info("Scrooling The dev Page Down ");
    scrollerBottomdown(400);
	logger.info("Page is scrolled down");
}

@Then("^I click on the element of tab$")
public void i_click_on_the_element_of_tab() throws Throwable {
	 logger.info("click on Agile Tab button ");
	   quizzpage.clickOnAgilTab();
	   logger.info("Agile Tab is Selected "); 
	   assertEquals(quizzpage.AgileScrumTabTextcontenu(), "Tester vos connaissances en Scrum Agile");
}

/*
* The aim of this method is to test The opening of A4Q Foundation Quizz Page ,
* Verify the title of page and to check all tabulation into the page 
*/

@When("^I Click on  A(\\d+)Q Foundation  link$")
public void i_Click_on_A_Q_Foundation_link(int arg1) throws Throwable {
	logger.info("Navigate to A4Q Foundation Quizz Exam page" ); 
	quizzpage.goToA4qPG();  
	logger.info("Navigate to A4Q Foundation Quizz Exam page is correctly opened ");
}

@Then("^I Verify The Title of  A(\\d+)Q Foundation Quizz Page$")
public void i_Verify_The_Title_of_A_Q_Foundation_Quizz_Page(int arg1) throws Throwable {
	logger.info("Verify the Title of A4Q Foundation QUIZZ Exam page ");
	   assertEquals("A4Q FOUNDATION - ExperTest Quizz ISTQB", quizzpage.getPgTitle(driver)); 
	   logger.info("The title of Page is correct ");
}
@Then("^I Scroll down the page until the Tab of A(\\d+)Q Quizz$")
public void i_Scroll_down_the_page_until_the_Tab_of_A_Q_Quizz(int arg1) throws Throwable {
	logger.info("Scrooling The dev Page Down ");
    scrollerBottomdown(400);
	logger.info("Page is scrolled down"); 
}

@Then("^I click on the elements of A(\\d+)Q Foundation Quizz tab$")
public void i_click_on_the_elements_of_A_Q_Foundation_Quizz_tab(int arg1) throws Throwable {
	 logger.info("click on A4Q Design Thinking Foundational Level V 2018  Tab button ");  
	 quizzpage.clickOnA4qDesign();
	logger.info(" A4Q Design Thinking Foundational button is Selected ");
	logger.info("click on A4Q AI and Software Testing Foundation ");
	quizzpage.clickOnA4qAisoft();
	logger.info(" A4Q AI and Software Testing Foundation is Selected ");

}


}


	

