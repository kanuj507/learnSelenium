package learn.learnSelenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	File projectDir = new File(System.getProperty("user.dir"));
    	System.setProperty("webdriver.chrome.driver",projectDir+ "/Utilities/drivers/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.get("http://www.DemoQA.com");
		driver.navigate().to("https://google.com");
		WebElement ele= driver.findElement(By.xpath(".//*[@id=’menu-item-374′]/a"));
		
		driver.navigate().back();
		driver.navigate().forward();
		//driver.navigate().to("");
		
	//driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
	//driver = new ChromeDriver();

	driver.navigate().refresh();
	
	driver.close();
		/*
        System.out.println( "Hello World!" );
        String exePath = "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe";
    //    String exePath = "C:\\Users\\abc\\Documents\\IEDriverServer\\IEDriverServer.exe";
		InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		serviceBuilder.usingAnyFreePort(); // This specifies that sever can pick any available free port to start
		serviceBuilder.usingDriverExecutable(new File(exePath)); //Tell it where you server exe is
		serviceBuilder.withLogLevel(InternetExplorerDriverLogLevel.TRACE); //Specifies the log level of the server
		serviceBuilder.withLogFile(new File("C:\\XYZ\\logFile.txt")); //Specify the log file. Change it based on your system
		InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
		InternetExplorerDriver driver = new InternetExplorerDriver(service);
		driver.get("http://GOOGLE.com");*/
    }
}
