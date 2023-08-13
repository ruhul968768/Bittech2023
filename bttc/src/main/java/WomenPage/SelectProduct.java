package WomenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class SelectProduct {
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div/div[1]/div/a/img")WebElement Jeans;
	
	WebDriver driver;
public SelectProduct(WebDriver dr) {
	driver = dr;
		
	}
	 

public SelectSize clickOnProduct() {
	Utility.click(Jeans);
	
	return new SelectSize(driver);
  }
 


} 