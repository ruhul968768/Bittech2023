package BrowserConfigaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagesss.LandingPage;

public class BaseTest {
	WebDriver driver;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
    public LandingPage GoToUrl() {
    	driver.get("www.express.com");
	
    	return new LandingPage(driver);
    }

}
