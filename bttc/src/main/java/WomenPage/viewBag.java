package WomenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class viewBag {
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/div/div[2]/span[2]/button")WebElement viewBag;
	
	WebDriver driver;
	public viewBag(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	public ChackOut clickOnViewBag() {
		Utility.click(viewBag);
		
		return new ChackOut(driver);
	}

}
