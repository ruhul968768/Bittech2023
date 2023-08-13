package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.Utility;

public class CheckOut {
	@FindBy(xpath="//*[@id=\"continue-to-checkout\"]")WebElement checkOut;
	 
	WebDriver driver;
	public CheckOut(WebDriver dr) {
		driver = dr;
		
	}
	public void checkOut() {
		Utility.click(checkOut);
	}

}
