package StepDefinations;

import java.util.List;

import org.testng.Assert;

import Pages.Actions.CarGuideHomePageActions;
import Pages.Actions.CarSearchPageActions;
import Utils.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCarsSteps {

	CarGuideHomePageActions carGuideHomePageActions = new CarGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();

	@Given("I am on the Home Page {string} of carsguide website")
	public void i_am_on_the_home_page_https_www_carsguide_com_au_of_carsguide_website(String websitrURL) {

		SeleniumDriver.openPage(websitrURL);

	}

	@When("I move to the menu")
	public void i_move_to_the_menu(List<String> list) {

		String menu = list.get(1);
		System.out.println("Selected Menu is :" + menu);
		carGuideHomePageActions.moveTobuyAndSellMenu();

	}

	@And("I click on {string} link")
	public void i_click_on_link(String searchCars) {

		carGuideHomePageActions.clickOnSearchCarsMenu();

	}

	@And("I select car brand  as {string} from Any Make dropdown")
	public void i_select_car_brand_as_from_any_make_dropdown(String carBrand) {

		carSearchPageActions.selectCarMake(carBrand);

	}

	@And("I select car model as {string} from Any Model dropdown")
	public void i_select_car_model_as_from_any_model_dropdown(String carModel) {
		carSearchPageActions.selectCarModel(carModel);
	}

	@And("I select Location as {string} from Any Location dropdown")
	public void i_select_location_as_from_any_location_dropdown(String location) {
		carSearchPageActions.selectLocation(location);

	}

	@And("I select Price as {string} from Price dropdown")
	public void i_select_price_as_from_price_dropdown(String carPrice) {
		carSearchPageActions.selectCarPice(carPrice);
	}

	@And("I click on Find_My_Next_Car button")
	public void i_click_on_find_my_next_car_button() {
		carSearchPageActions.cilckOnFindMyNextCarButton();

	}

	@Then("I should see the list of searched cars")
	public void i_should_see_the_list_of_searched_cars() {
		System.out.println("Car list found");

	}

	@And("The page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		
		String actualTitle = SeleniumDriver.getDriver().getTitle();
     Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}

}
