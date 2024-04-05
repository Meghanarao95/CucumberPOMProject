package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features/UsedCarSearch.feature",
		glue = { "StepDefinations" }, 
		monochrome = true,
		
		plugin = { "json:target/Runcuke/Cucumber.json","pretty","html:target/Cucumber_Reports/Cucumber-html-report.html",
				//"com.cucumber.listener.ExtentCucumberFormatter",			 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunCuke extends AbstractTestNGCucumberTests {
	
	

}
