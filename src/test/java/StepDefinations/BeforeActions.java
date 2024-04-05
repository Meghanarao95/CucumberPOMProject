package StepDefinations;

import Utils.SeleniumDriver;
import io.cucumber.java.Before;

public class BeforeActions {

	@Before
	public static void setUp() {

		SeleniumDriver.setUpDriver();
	}

}
