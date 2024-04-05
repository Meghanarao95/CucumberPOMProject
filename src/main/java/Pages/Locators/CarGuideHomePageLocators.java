package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarGuideHomePageLocators {

	@FindBy(how=How.LINK_TEXT ,using ="buy + sell")
	public WebElement  buyandsellLink;
	
	@FindBy(how=How.LINK_TEXT ,using ="reviews")
	public WebElement  reviewsLink;


	@FindBy(how=How.LINK_TEXT ,using ="Sell my car")
	public WebElement SellMyCarLink;
	
	@FindBy(how=How.LINK_TEXT ,using ="Search Cars")
	public WebElement  SearchCarsLink;
	
	@FindBy(how=How.LINK_TEXT ,using ="Used")
	public WebElement  UsedLink;
	
	
	
}
