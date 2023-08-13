package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class Tshirt {
	@FindBy(xpath="//section[@id='app']/div/div/div/div/div/div[5]") WebElement SelectProd;
	WebDriver driver;
	public Tshirt(WebDriver dr) {
		driver =dr;
		PageFactory.initElements(driver, this);
		    
	}
	
	public SelectProd ChoiceTshirt() {
		Utility.click(SelectProd);
		
		return new SelectProd(driver);
	}
	

}
