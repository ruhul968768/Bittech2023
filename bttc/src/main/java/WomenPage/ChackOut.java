package WomenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class ChackOut {
	@FindBy(xpath="//*[@id=\"continue-to-checkout\"]") WebElement CheckOut;
	
	WebDriver driver;
	public ChackOut(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	public void ClickOnCheckOut() {
		Utility.click(CheckOut);
	}

}
