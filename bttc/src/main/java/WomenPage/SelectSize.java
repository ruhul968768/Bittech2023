package WomenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class SelectSize {
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[4]/div/div[2]/button")WebElement Size;
	
	WebDriver driver;
	public SelectSize(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	public AddToBag ClickOnSize() {
		Utility.click(Size);
		
		return new AddToBag(driver);
	}

}
