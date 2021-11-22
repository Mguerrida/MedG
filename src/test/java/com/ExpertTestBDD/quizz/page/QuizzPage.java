package com.ExpertTestBDD.quizz.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuizzPage {
	 
public final static String titleQuizzPage = "Quizz - ExperTest Quizz ISTQB";
public final static String title_Lean_Siw_Sigma_Page ="lean Exam - ExperTest Quizz ISTQB";
final static String QUIZZ_PAGE_BUTTON ="//a[@href='https://www.expertest.tn/quizz/']" ;
final static String LEAN_EXAM_LINK  ="//a[@href='https://www.expertest.tn/lean-exam/']" ;
final static String LEAN_SIX_SEGMA_ORANGE_TAB = "ui-id-2" ;
final static String LEAN_SIX_SEGMA_GREEN_TAB = "ui-id-3" ;
final static String YELLOW_BELT_TEXT = "//p[contains(text(),'Yellow')]" ;
final static String ORANGE_BELT_TEXT = "//p[contains(text(),'Orange')]" ;
final static String GREEN_BELT_TEXT =  "//p[contains(text(),'Green')]" ;
final static String DEVELOPPEMENT_EXAM_LINK ="//a[@href='https://www.expertest.tn/developpement/']" ;
final static String ANDROIS_BUTTON = "ui-id-1" ;
final static String ISTQB_QUIZZ_EXAM_LINK ="//a[@href='https://www.expertest.tn/istqb']";
final static String AGILE_SCRUM_QUIZZ_EXAM_LINK = "//a[@href='https://www.expertest.tn/agil-scrum']";
final static String AGIL_SCRUM_BUTTON ="ui-id-1";
final static String AGILE_BELT_TEXT = "//p[contains(text(),'Tester vos connaissances en Scrum Agile')]" ;
final static String A4Q_FOUNDATIONA_SCRUM_QUIZZ_EXAM_LINK = "//a[@href='https://www.expertest.tn/a4q-foundation/']";
final static String A4Q_DESIGN_THINKING ="ui-id-1" ;
final static String A4Q_AI_and_Software ="ui-id-2" ;
/*@FindBy */ 

@FindBy(how=How.XPATH , using = QUIZZ_PAGE_BUTTON)
public static WebElement quizz_pg_btn ;

@FindBy(how=How.XPATH , using = LEAN_EXAM_LINK)
public static WebElement lean_exam_link ;

@FindBy(how=How.ID , using = LEAN_SIX_SEGMA_ORANGE_TAB )
private static WebElement orange_tab_btn ; 

@FindBy(how=How.ID , using = LEAN_SIX_SEGMA_GREEN_TAB)
private static WebElement green_tab_btn ;

@FindBy(how=How.XPATH, using = YELLOW_BELT_TEXT )
private static  WebElement Text_in_yellow_belt ;

@FindBy(how=How.XPATH , using =ORANGE_BELT_TEXT)
public static WebElement Text_in_orange_belt ;

@FindBy(how=How.XPATH , using =GREEN_BELT_TEXT)
public static WebElement Text_in_green_belt ;

@FindBy(how=How.XPATH , using =DEVELOPPEMENT_EXAM_LINK)
public static WebElement dev_exam_link ;

@FindBy(how=How.ID , using = ANDROIS_BUTTON )
public static WebElement android_btn ;

@FindBy(how=How.XPATH , using = ISTQB_QUIZZ_EXAM_LINK )
public static WebElement istqb_quizz_exam_link ;

@FindBy(how =How.XPATH , using = AGILE_SCRUM_QUIZZ_EXAM_LINK)
public static WebElement  agile_scrum_quizz_exam_link ;

@FindBy(how = How.ID , using =AGIL_SCRUM_BUTTON)
public static WebElement agile_button ;
 
@FindBy(how = How.XPATH , using = AGILE_BELT_TEXT)
public static WebElement agile_text ; 

@FindBy(how = How.XPATH , using = A4Q_FOUNDATIONA_SCRUM_QUIZZ_EXAM_LINK)
public static WebElement  a4q_quizz_exam_link ;

@FindBy(how = How.ID , using = A4Q_DESIGN_THINKING)
public static WebElement a4q_design_thinking_btn; 

@FindBy(how = How.ID , using = A4Q_AI_and_Software)
public static WebElement a4q_ai_Software_btn; 
/*Method*/
 
public void goToQuizzPg () {
	quizz_pg_btn.click();	 
		 
	 }

public void goToLeanSixSegmaPg () {
	 lean_exam_link.click();	 
		 
	  }

public String getPgTitle (WebDriver driver) {
	String Titre = driver.getTitle() ;
	 return Titre ;
	 
}

public void gotoorangebelt() {
	 orange_tab_btn.click();
	 
}

public void gotogreenbelt () {
	green_tab_btn.click();
}

public String yellowBeltTextcontenu() {
	String  yellowText = Text_in_yellow_belt.getText()	; 
	 return yellowText ;
 }

 
 public String orangeBetTextcontenu () {
	 
	 String orangeText = Text_in_orange_belt.getText();
	 return orangeText ;
 }
 
 public String greenBeltTextcontenu() {
	 
	 String greenText = Text_in_green_belt.getText();
	 return greenText ;
 }
 

public static WebElement getTextinyellowbelt() {
	return Text_in_yellow_belt;
}

public void goToDeveloppementPg() {
dev_exam_link.click();
	
}
public WebElement Android_button () {
return android_btn ;	
}

public void goToIstqbPg() {
	istqb_quizz_exam_link.click();
}
public void goToAgileScrumPg() {
	agile_scrum_quizz_exam_link.click();
}
public void clickOnAgilTab () {
	agile_button.click();
}

public String AgileScrumTabTextcontenu () {
	 
	 String AgilTabText = agile_text.getText();
	
	 return AgilTabText ;
}

public void goToA4qPG() {
	a4q_quizz_exam_link.click();
	
}
public void clickOnA4qDesign() {
	a4q_design_thinking_btn.click();
	
}

public void clickOnA4qAisoft() {
a4q_ai_Software_btn.click();	
	
}
}
