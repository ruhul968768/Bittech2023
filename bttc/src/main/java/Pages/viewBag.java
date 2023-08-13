package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class viewBag {
	@FindBy(xpath="//*[@id=\"continue-to-checkout\"]")WebElement viewBag;
	
	WebDriver driver;
	public viewBag(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	public CheckOut clickOnViewBag() {
		Utility.click(viewBag);
		
		return new CheckOut(driver);
	}

}
