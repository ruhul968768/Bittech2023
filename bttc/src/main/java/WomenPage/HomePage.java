package WomenPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class HomePage {
	@FindBy(xpath="//*[@id=\"root-Women\"]/ol[1]/li/ol/li[5]/a") WebElement Jeans;
	
	WebDriver driver;
	public HomePage(WebDriver dr) {
		driver =dr;
		PageFactory.initElements(driver, this);
		
	}
	public void HoverOverOnWomenMenu() {
		Utility.hoverOverOnelements(driver,driver
				.findElements(By.xpath("//*[@id=\"raven-header-mega-menu\"]/nav/ol/li[1]/a")));
		
	}
	public SelectProduct clickOnJeans() {
		Utility.click(Jeans);
		
		return new SelectProduct(driver);
	}

} 
