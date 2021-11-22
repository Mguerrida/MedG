package com.ExpertTestBDD.eboutique.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ExpertTestBDD.utils.Setup;
 
public class EboutiquePage {

	WebDriver driver ;
	
	public  EboutiquePage ()
	{
		driver = Setup.driver;
	}
	
	// Inspect Web Elements 
	final static String BoutiqueMenu ="menu-item-2946" ; 
	final static String Button_gridview = " //span[@class='dashicons dashicons-grid-view'] ";  
	final static String Button_listview = "//span[@class='dashicons dashicons-exerpt-view'] ";
	final static String gridview_Display ="//span[@class='dashicons dashicons-grid-view']";
	final static String listview_Display ="//span[@class='dashicons dashicons-exerpt-view']";
	final static String GridlistElements = "products grid";
	final static String ResearchTextArea ="//input[@id='woocommerce-product-search-field-0']" ; 
	final static String ResearchButton ="//button[@value='Recherche']";
	final static String LinkAddToPannel ="button" ;
	final static String PannelProduct = "cart_list" ;
	final static String Vocher_Certification_Link = "cat-item-136";
	final static String Pack_Revision_Link = "cat-item-138";
	final static String Non_Classe_Link = "cat-item-104";
	/* @FindBy */
	@FindBy(how = How.XPATH, using = Button_gridview)
	public static WebElement btnGridView;
	@FindBy(how = How.XPATH , using = Button_listview )
	public static WebElement bntListView ; 
	@FindBy (how = How.XPATH , using = gridview_Display )
	public static WebElement grdView ;
	@FindBy (how = How.XPATH , using = listview_Display )
	public static WebElement listView ;
	@FindBy (how = How.ID , using = BoutiqueMenu )
	public static WebElement BtMenu ;
	@FindBy (how = How.CLASS_NAME , using = GridlistElements )
	public static WebElement GridElements ;
	@FindBy ( how = How.XPATH , using = ResearchTextArea)
	public static WebElement ResearchTArea ;
	@FindBy ( how= How.XPATH , using =  ResearchButton)
	public static WebElement Researchbtn ;
	@FindBy (how= How.CLASS_NAME , using = LinkAddToPannel )
	public static WebElement LinkAddPnl ;
	@FindBy ( how=How.CLASS_NAME , using = PannelProduct )
	public static WebElement PnlProduct ;
	@FindBy ( how=How.CLASS_NAME , using = Vocher_Certification_Link )
	public static WebElement Link_Cert_Vocher ;
	@FindBy ( how=How.CLASS_NAME , using = Pack_Revision_Link )
	public static WebElement Link_Pack_Revision ;
	@FindBy ( how=How.CLASS_NAME , using = Non_Classe_Link )
	public static WebElement Link_Non_Classe ;
	
	
	/* Method */
	public void Click_Listview() {
		bntListView.click();	;
	}

	public void Click_Gridview() {

		btnGridView.click();

	}

	public void Click_BtMenu() {

		BtMenu.click();

	}

	public static WebElement getGridElements() {
		return GridElements;
	}

	public static void setGridElements(WebElement gridElements) {
		GridElements = gridElements;
	}

	public void Click_Research_TextArea () {
		ResearchTArea.click();
	}
	
	public void Click_Research_Button () {
		Researchbtn.click();
	}
	
	public void Click_LinkAddToPannel() {
		LinkAddPnl.click();
	}
	
	public void Click_Link_Cert_Vocher()
	{
		
	}
}

