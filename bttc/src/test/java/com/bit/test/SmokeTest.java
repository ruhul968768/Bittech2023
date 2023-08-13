package com.bit.test;



import org.junit.jupiter.api.Test;
import Pages.HomePage;
import Pages.ManPage;

public class SmokeTest extends BaseTest {
@Test
public void verifyMenuBar() {
		HomePage h = new HomePage(driver);
		h.hovarOverOnMenu();
		h.clickOnManeManuBar();
		ManPage h1 = new ManPage(driver);
		h1.ClickOnTshirt();
		
	}


}
