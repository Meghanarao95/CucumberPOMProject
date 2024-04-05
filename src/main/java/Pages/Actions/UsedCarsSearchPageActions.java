package Pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.Locators.UsedCarsSearchPageLocators;
import Utils.SeleniumDriver;

public class UsedCarsSearchPageActions {

	// Create an object of CarsSearchPageLocators so the we can access all the page
	// factory elements of that class here

	UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;

	public UsedCarsSearchPageActions() {

		// create an object of CarGuideHopePageActions

		this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		// initiate page factory elements which are defined in the
		// carsSearchPageLocators from the and get the SeleniumDriver reference from
		// Selenium Driver class

		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}
	
	// As it is a dropdown and has select tag for all the elements, we are going to use "Select" class to perform these actions on dropdown 
		public void selectCarMake(String carBrand) {

			Select selectCarMake = new Select(usedCarsSearchPageLocators.carMakeDropdown);
			selectCarMake.selectByVisibleText(carBrand);
		}

		public void selectCarModel(String carModel) {
			Select selectModel = new Select(usedCarsSearchPageLocators.selectModelDropdown);
			selectModel.selectByVisibleText(carModel);

		}

		public void selectLocation(String location) {

			Select selectLocation = new Select(usedCarsSearchPageLocators.selectionLocationDropdown);
			selectLocation.selectByVisibleText(location);

		}

		public void selectCarPice(String carPrice) {
			Select selectPrice = new Select(usedCarsSearchPageLocators.priceDropdown);
			selectPrice.selectByVisibleText(carPrice);

		}
		
		public void cilckOnFindMyNextCarButton() {
			usedCarsSearchPageLocators.findMyNextCarBtn.click();
			
		}


}
