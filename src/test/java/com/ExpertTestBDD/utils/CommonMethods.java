package com.ExpertTestBDD.utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;

	public CommonMethods() {
		driver = Setup.driver;
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public void openURLWithConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/ressources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));

	}

	public String readUrl() throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("src/test/ressources/configs/config.properties");
		p.load(reader);
		String url = p.getProperty("url1");
		return url;
	}

	public void scrollerBottomdown(int i) {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0," + i + ")", "");
	}

	public void scrollerBottomup() {
		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)", "");
		}
	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}

	public void switchHandles() {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(0));
		driver.navigate().forward();
	}

	public void explicitWait(int i , WebElement element ) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	
	public void explicitWaitVisibility(int i , WebElement element ) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOf(element));
		

	}
	public void scrollInToPage (WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
	
	public void scrollToElement (WebDriver driver , WebElement element) {
		
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
}
