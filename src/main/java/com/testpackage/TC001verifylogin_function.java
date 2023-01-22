package com.testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pompackage.Pomclass;

public class TC001verifylogin_function
{ 
	//
	@Test
	public void loginfunctionalityverify()
	{
		System.setProperty("WebDriver.Chrome.driver", "D:\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Pomclass lp=new Pomclass(driver);
		lp.username();
		lp.password();
		lp.login();
		
		
		String givenltitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		
		if (givenltitle.equals(ActualTitle))
		{
			System.out.println("test is pass");
		}
		else 
		{
			System.out.println("test is fail");
		}
		
		
		
		
		
		
	}

}
