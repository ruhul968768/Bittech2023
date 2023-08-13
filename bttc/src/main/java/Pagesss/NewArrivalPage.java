package Pagesss;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilityy.Helperr;

public class NewArrivalPage {
	@FindBy(xpath="")WebElement newArrival;
	
	WebDriver driver;
	public NewArrivalPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	public Tshirt ClickOnNewArrival() {
		Helperr.clickOnElement(newArrival);
		
		return new Tshirt( );
	}
	public static void secondHightNum(int a[]) {
		for(int x=0; x<a.length;x++) {
			
			
		}
		
	}
	public static void backWordString() {
		String s[] = {"How", "are", "you"}  ;
		
		
		
	}
	@Test
	public void swapTowNumbers() {
		int a=7;
		int b=9;
		if(a<=b) {
			
		}
		
	}
	
	public static void main(String []args) {
		factorialValue(6);
		System.out.println("hi");
	}
	public static void factorialValue(int a) {
		for(int x=0;x<a;x++) {
			if(2<8) {
				System.out.println(a);
			}
		}
	}
	

}
