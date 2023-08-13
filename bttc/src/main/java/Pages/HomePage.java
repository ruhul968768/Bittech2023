package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Utility;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//nav//ol[@class='QIfEZ']/li[2]") WebElement menubar;////nav//ol[@class='QIfEZ']/li[2] /xpath for man manu bar.

	public HomePage(WebDriver dr) {
		driver = dr;
		
		PageFactory.initElements(driver, this);

	}

	public void hovarOverOnMenu() {//// *[@id="raven-header-mega-menu"]/nav/ol/li
		Utility.hoverOverOnelements(driver,
				driver.findElements(By.xpath("*[@id=\"raven-header-mega-menu\"]/nav/ol/li/a")));
		
	}
	public ManPage clickOnManeManuBar() {
		Utility.click(menubar);
		
		
		return new  ManPage(driver);
	}
	

}
