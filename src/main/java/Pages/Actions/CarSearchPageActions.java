package Pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.Locators.CarsSearchPageLocators;
import Utils.SeleniumDriver;

public class CarSearchPageActions {

	// Create an object of CarsSearchPageLocators so the we can access all the page
	// factory elements of that class here

	CarsSearchPageLocators carsSearchPageLocators = null;

	public CarSearchPageActions() {

		// create an object of CarGuideHopePageActions

		this.carsSearchPageLocators = new CarsSearchPageLocators();
		// initiate page factory elements which are defined in the
		// carsSearchPageLocators from the and get the SeleniumDriver reference from
		// Selenium Driver class

		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);
	}

	
	// As it is a dropdown and has select tag for all the elements, we are going to use "Select" class to perform these actions on dropdown 
	public void selectCarMake(String carBrand) {

		Select selectCarMake = new Select(carsSearchPageLocators.carMakeDropdown);
		selectCarMake.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carModel) {
		Select selectModel = new Select(carsSearchPageLocators.selectModelDropdown);
		selectModel.selectByVisibleText(carModel);

	}

	public void selectLocation(String location) {

		Select selectLocation = new Select(carsSearchPageLocators.selectionLocationDropdown);
		selectLocation.selectByVisibleText(location);

	}

	public void selectCarPice(String carPrice) {
		Select selectPrice = new Select(carsSearchPageLocators.priceDropdown);
		selectPrice.selectByVisibleText(carPrice);

	}
	
	public void cilckOnFindMyNextCarButton() {
		carsSearchPageLocators.findMyNextCarBtn.click();
		
	}

}
