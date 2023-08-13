package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class ManPage {
	@FindBy(xpath="//div[@id='root-Men']/ol[1]/li/ol/li[8]/a[text()='T-Shirts']")WebElement Tshirt;
	
	WebDriver driver;
	public ManPage(WebDriver dr) {
		driver=dr;
		PageFactory.initElements(driver, this);
		
	}
	public Tshirt ClickOnTshirt() {
		Utility.click(Tshirt);
		
		return new Tshirt(driver);
	}

}
