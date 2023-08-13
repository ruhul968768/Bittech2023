package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class AddToBag {
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div[4]/button")
	WebElement addToBag;
	WebDriver driver;
	public AddToBag(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	public viewBag addToBag() {
		Utility.click(addToBag);
		
		return new viewBag(driver);
	}

}
