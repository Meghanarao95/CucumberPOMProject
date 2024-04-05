package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	public static SeleniumDriver seleniumDriver;
	private static WebDriver driver;                                // init WebDriver
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {                                       // creating a constructor
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));

	}

	public static void openPage(String url) {

		driver.get(url);
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static void setUpDriver() {

		if (seleniumDriver == null) {                            // Whenever we call setup method, it will call the constructor private
										                         // SeleniumDriver() and create a object of the chrome driver
			seleniumDriver = new SeleniumDriver();
		}

	}

	public static void tearDown() {
		
	if(driver!=null) {	
		driver.close();
		driver.quit();
		
	}
	seleniumDriver = null;
			
 
	}
}
