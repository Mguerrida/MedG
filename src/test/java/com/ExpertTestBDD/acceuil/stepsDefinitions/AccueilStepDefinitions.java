package com.ExpertTestBDD.acceuil.stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ExpertTestBDD.acceuil.pages.AccueilPage;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class AccueilStepDefinitions extends CommonMethods {
	
	public WebDriver driver;
	private AccueilPage accueilPage = new AccueilPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public  AccueilStepDefinitions() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, AccueilPage.class);
		
        }
	
	@Given("^I navigates to ExpertTest$")
	public void i_navigates_to_ExpertTest() throws Throwable {
	
		logger.info("^I navigates to ExpertTest$");
		commonMethods.openURLWithConfigFile("url1");
	}
	@Then("^I check the home page$")
	public void i_check_the_home_page() throws Throwable {
		logger.info("I check the home page$");
		String url1 = commonMethods.readUrl();
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.equals(url1));
		System.out.println(url1);
	}
	@When("^I click on the button Commencez$")
	public void i_click_on_the_button_Commencez() throws Throwable {
	
	}
	@Then("^I check  Page Mon Compte is opening$")
	public void i_check_Page_Mon_Compte_is_opening() throws Throwable {
	 
	}
	@Then("^I click on the button J achète$")
	public void i_click_on_the_button_J_achète() throws Throwable {
	
	}
	@Then("^I check  Page Boutique is opening$")
	public void i_check_Page_Boutique_is_opening() throws Throwable {
	
	}
	@Then("^I click on the button passez le quizz$")
	public void i_click_on_the_button_passez_le_quizz() throws Throwable {
	}
	@Then("^I check  Page Quiz is opening$")
	public void i_check_Page_Quiz_is_opening() throws Throwable {
	
	}
}