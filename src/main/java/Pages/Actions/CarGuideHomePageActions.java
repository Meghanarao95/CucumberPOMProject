package Pages.Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Pages.Locators.CarGuideHomePageLocators;
import Utils.SeleniumDriver;
import io.reactivex.rxjava3.functions.Action;

public class CarGuideHomePageActions {

	// Create an object of carGuideHomePageLocators so the we can access all the  page factory elements of that class here

	CarGuideHomePageLocators carGuideHomePageLocators = null;

	// create a public constructor of the same name as class name

	public CarGuideHomePageActions() {

		// create an object of CarGuideHopePageActions

		this.carGuideHomePageLocators = new CarGuideHomePageLocators();

		// initiate page factory elements which are defined in the carGuideHomePageLocators from the and get the SeleniumDriver reference from
		// Selenium Driver class

		PageFactory.initElements(SeleniumDriver.getDriver(), carGuideHomePageLocators);
	}

	public void moveTobuyAndSellMenu() {
		// we need to mouse over on buy+sell menu ,and it is down by Actions

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carGuideHomePageLocators.buyandsellLink).perform();

	}

	// we need to moveTobuyAndSellMenu before performing clickOnSearchCarsMenu action 
	public void clickOnSearchCarsMenu() {

		carGuideHomePageLocators.SearchCarsLink.click();

	}

	// we need to moveTobuyAndSellMenu before performing clickOnUsedCarSearchMenu action 
	public void clickOnUsedCarSearchMenu() {

		carGuideHomePageLocators.UsedLink.click();

	}

	// we need to moveTobuyAndSellMenu before performing moveToSellMyCarMenu action 
	public void moveToSellMyCarMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carGuideHomePageLocators.SellMyCarLink).perform();

	}

}
