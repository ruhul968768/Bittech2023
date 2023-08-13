package Pagesss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilityy.Helperr;

public class LandingPage {
	@FindBy(xpath="")WebElement manMenu;
	
	WebDriver driver;
	public LandingPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	public void HovarOverOnManMenu() {
		
		Helperr.HovarOvar(manMenu);
		
	}

}
