package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsSearchPageLocators {
	
	@FindBy(how=How.XPATH ,using ="//*[@id=\"makes\"]")
	public WebElement  carMakeDropdown;
	
	
	@FindBy(how=How.XPATH ,using ="//*[@id=\"models\"]")
	public WebElement  selectModelDropdown;
	
	@FindBy(how=How.XPATH ,using ="//*[@id=\"locations\"]")
	public WebElement  selectionLocationDropdown;
	
	@FindBy(how=How.XPATH,using ="//*[@id=\"priceTo\"]")
	public WebElement  priceDropdown;
	
	@FindBy(how=How.XPATH,using ="//*[@id=\"search-submit\"]")
	public WebElement  findMyNextCarBtn;
	
	

}
