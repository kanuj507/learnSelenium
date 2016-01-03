package exercise;

import org.openqa.selenium.WebDriver;

import common.CommonClass;
import common.ConstantClass;
import junit.framework.Assert;

public class Exercise1 {
	
	public void Test1(WebDriver driver)
	{
		try{
		driver.get(ConstantClass.URL);
		String title=driver.getTitle();
		System.out.println("title ->"+title+ " / title length"+title.length());
		String pageTitle=driver.getCurrentUrl();
	//	Assert.assertEquals(ConstantClass.URL, pageTitle);
		System.out.println("Page title  ->"+pageTitle);
		String pageSRC=driver.getPageSource();
		System.out.println("Page Source Length ->"+pageSRC.length());
		//System.out.println("Page Source Code ->"+pageSRC);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			driver.close();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 e1=new Exercise1();
		WebDriver driver=CommonClass.getChromeDriver();
		e1.Test1(driver);

	}

}
