package com.ExpertTestBDD.acceuil.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ExpertTestBDD.utils.Setup;

public class AccueilPage {
	WebDriver driver;

	public AccueilPage() {
		driver = Setup.driver;
	}

	final static String BUTTON_ACCUEIL = "menu-item-142";


	
	
	/* @FindBy */
	
	@FindBy(how = How.XPATH, using = BUTTON_ACCUEIL)
	public static WebElement txtNosFormations;
	
	
	
	/* Method */
	public void goToAccueil() {
		txtNosFormations.click();
	}

}
