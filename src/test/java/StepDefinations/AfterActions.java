package StepDefinations;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterActions {

    @After
	public static void tearDown(Scenario scenario) {
    	
    	WebDriver driver=SeleniumDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot)SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
             scenario.attach(screenshotBytes, "image/png", scenario.getName());
         }
    SeleniumDriver.tearDown();
    }
}

