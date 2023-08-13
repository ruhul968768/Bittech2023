package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class SelectProd {
	@FindBy(xpath="\"//section[@id='app']/div/div/div/div/div/div[5]\"") WebElement product;
	WebDriver driver;
	public SelectProd(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	public selectSize clickOnProduct() {
		Utility.click(product);
		
	return new selectSize(driver);	
	}

}
