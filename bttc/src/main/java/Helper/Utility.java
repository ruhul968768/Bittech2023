package Helper;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {
	
	public static void hoverOverOnelements(WebDriver driver ,List<WebElement> ele) {
		Actions a = new Actions(driver);
		for(int i =0; i<ele.size();i++) {
			WebElement el=ele.get(i);
			a.moveToElement((WebElement) el).build().perform();      
		}
		
		
	}
	public static Properties readProp(String path) throws IOException {
		FileInputStream f = new FileInputStream(new File(path));
		
		Properties x = new Properties();
		x.load(f);
	 return x;	
	}
	public static void click(WebElement ele) {
		ele.click();
		
	}
	
 
}
