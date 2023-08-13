package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Helper.Utility;

public class BaseTest {
	WebDriver driver;
	@Before
	public void OpenBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver =new ChromeDriver();
		Properties prop =Utility.readProp("C:\\Users\\Dell\\eclipse-workspace\\bttc\\cinfig.propertice");
		String b=prop.getProperty("browser");
		if(b.equals("ChromeDriver")) {
			driver= new ChromeDriver();
		}else if (b.equals("FirefoxDriver")) {
			driver= new FirefoxDriver();
		}
			 
		//driver.get("express.com"); 
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
