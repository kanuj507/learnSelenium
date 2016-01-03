package common;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonClass {

	static File projectDir = new File(System.getProperty("user.dir"));

	
	public static WebDriver getChromeDriver()
	{
		
		System.setProperty("webdriver.chrome.driver",projectDir+ "/Utilities/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
