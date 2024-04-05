package StepDefinations;

import java.util.List;

import Pages.Actions.CarGuideHomePageActions;
import Pages.Actions.UsedCarsSearchPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UsedCarSearchSteps {

	CarGuideHomePageActions carGuideHomePageActions = new CarGuideHomePageActions();

	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();

	@And("I click on {string} link from Used Cars search page")
	public void i_click_on_link(String searchCars) {

		carGuideHomePageActions.clickOnUsedCarSearchMenu();

	}

	@And("I select car brand  as {string} from Any Make dropdown from Used Cars search page")
	public void i_select_car_brand_as_from_any_make_dropdown_froms_used_cars_search_page(String carBrand) {
		usedCarsSearchPageActions.selectCarMake(carBrand);

	}

	@And("I select car model of Used Cars search page")
	public void i_select_car_model_of_used_cars_search_page(List<String> list) {

		String Car_Model = list.get(1);
		usedCarsSearchPageActions.selectCarModel(Car_Model);
	}

	@And("I select Location as {string} from Any Location dropdown from Used Cars search page")
	public void i_select_location_as_from_any_location_dropdown_from_used_cars_search_page(String location) {
		usedCarsSearchPageActions.selectLocation(location);
	}

	@And("I select Price as {string} from Price dropdown of Used Cars search page")
	public void i_select_price_as_from_price_dropdown_of_used_cars_search_page(String carPrice) {
		usedCarsSearchPageActions.selectCarPice(carPrice);

	}

	@And("I click on Find_My_Next_Car button from Used Cars search page")
	public void i_click_on_find_my_next_car_button_from_used_cars_search_page() {
		usedCarsSearchPageActions.cilckOnFindMyNextCarButton();

	}

	@Then("I should see the list of Used cars  from Used Cars search page")
	public void i_should_see_the_list_of_used_cars_from_used_cars_search_page() {
		System.out.println("Used Car list found");
	}

}
