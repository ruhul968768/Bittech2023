package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class selectSize {
	@FindBy(xpath="//div[@aria-label='Size selection button group']/div/div[3]/button/span[@class='_2mnVI']") 
	WebElement SelectSize;
	WebDriver driver;
	public selectSize(WebDriver dr) {
		driver =dr;
		PageFactory.initElements(driver, this);
		
	}
	public AddToBag clickOnMsize() {
		Utility.click(SelectSize);
		
		return new AddToBag(driver);
	}

}
