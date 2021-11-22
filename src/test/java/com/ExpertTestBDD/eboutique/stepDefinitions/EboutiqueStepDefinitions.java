package com.ExpertTestBDD.eboutique.stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.ExpertTestBDD.acceuil.pages.AccueilPage;
import com.ExpertTestBDD.eboutique.pages.EboutiquePage;
import com.ExpertTestBDD.utils.CommonMethods;
import com.ExpertTestBDD.utils.Setup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EboutiqueStepDefinitions extends CommonMethods{

	public WebDriver driver;
	private EboutiquePage eboutiquePO  = new EboutiquePage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public EboutiqueStepDefinitions () {
	
		driver = Setup.driver;
		PageFactory.initElements(driver, EboutiquePage.class);
	}
	
	@When("^I click on eboutique button$")
	public void i_click_on_eboutique_button() throws Throwable {
		eboutiquePO.Click_BtMenu();
		
	}
	
	@Then("^I check that eboutique Page is displayed \"([^\"]*)\"$")
	public void i_check_that_eboutique_Page_is_displayed(String url1) throws Throwable {	
	   String url = driver.getCurrentUrl();
	   Assert.assertEquals(url, url1);
	  
	}

	@When("^I click on list view button$")
	public void i_click_on_list_view_button() throws Throwable {
               eboutiquePO.Click_Listview();	
               logger.info("List View is Displayed");
	}

	@When("^I click on Grid view button$")
	public void i_click_on_Grid_view_button() throws Throwable {
             eboutiquePO.Click_Gridview();	
             logger.info("Grid View is Displayed");
	}

	@Then("^I check that the list view is displayed$")
	public boolean i_check_that_the_list_view_is_displayed() throws Throwable {
		i_click_on_list_view_button();
		if (eboutiquePO.listView.isDisplayed())
		{
			 logger.info("Check: List View is Displayed");
		 return true ;	
		
		}
		else 
		{
			logger.info("Check : List View is not Displayed");
			return false ;
		}
			
	}

	@Then("^check that the grid view is displayed$")
	public boolean check_that_the_grid_view_is_displayed() throws Throwable {
		i_click_on_Grid_view_button();
		if (eboutiquePO.grdView.isDisplayed())
		{
			 logger.info("Check: Grid View is Displayed");
		 return true ;	
		
		}
		else 
		{
			logger.info("Check : List View is not Displayed");
			return false ;
		}
	}
	
	@When("^I click on Product Link$")
	public void i_click_on_Product_Link() throws Throwable {
		List<WebElement> allElements = driver.findElements(By.cssSelector("ul.products>li.isotope-item> a")); 
		int i = allElements.size()-1;
		while (i>0)
		{
			
			//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
			//driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
			i--;
		}
	}

	@Then("^I Check that the Link Product is launched$")
	public void i_Check_that_the_Link_Product_is_launched() throws Throwable {
	  
	}

	@When("^i set <keyword> of Reaserch \"([^\"]*)\"$")
	public void i_set_keyword_of_Reaserch(String Keyword) throws Throwable {
		eboutiquePO.ResearchTArea.sendKeys(Keyword);
	}

	@When("^I click on Recherche button$")
	public void i_click_on_Recherche_button() throws Throwable {
           eboutiquePO.Click_Research_Button();	  
	}

	@Then("^i check that We redirect to Product Research page \"([^\"]*)\"$")
	public void iCheckThatWeRedirectToProductResearchPage(String Keyword) throws Throwable {
		String url = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.expertest.tn/?s="+Keyword+"&post_type=product";
		//System.out.println(url);
		//System.out.println(ExpectedUrl);
		if ( ExpectedUrl.equals(url))
		{
		logger.info("Correct Behavior");	
		}
		else
			{logger.info("Wrong Beahvior");}
	}
	
	@When("^I add a product to pannel product$")
	public void i_add_a_product_to_pannel_product() throws Throwable {
	  eboutiquePO.Click_LinkAddToPannel();
	  driver.navigate().back();
	}

	@Then("^I check that a product is added to the pannel$")
	public void i_check_that_a_product_is_added_to_the_pannel() throws Throwable {
		List<WebElement> pannelElements = driver.findElements(By.cssSelector("ul.cart_list>li.mini_cart_item> a")); 
		int Cmpt=pannelElements.size();
        System.out.println("nbr d'elements ajoutés au panier est "+Cmpt);
	}

	@When("^I click on the  voucher-de-certification in step$")
	public void i_click_on_the_voucher_de_certification_in_step() throws Throwable {
	    
	}

	@Then("^I check that we redirect to  https://www\\.expertest\\.tn/categorie-produit/voucher-de-certification/ in step$")
	public void i_check_that_we_redirect_to_https_www_expertest_tn_categorie_produit_voucher_de_certification_in_step() throws Throwable {
	  
	}

	@When("^I click on the  pack-de-revision in step$")
	public void i_click_on_the_pack_de_revision_in_step() throws Throwable {
	  
	}

	@Then("^I check that we redirect to  https://www\\.expertest\\.tn/categorie-produit/pack-de-revision/ in step$")
	public void i_check_that_we_redirect_to_https_www_expertest_tn_categorie_produit_pack_de_revision_in_step() throws Throwable {
	
	}

	@When("^I click on the  non-classe in step$")
	public void i_click_on_the_non_classe_in_step() throws Throwable {
	
	}

	@Then("^I check that we redirect to  https://www\\.expertest\\.tn/categorie-produit/non-classe/ in step$")
	public void i_check_that_we_redirect_to_https_www_expertest_tn_categorie_produit_non_classe_in_step() throws Throwable {
	
	}

}
