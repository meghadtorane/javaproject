package com.testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pompackage.Pomclass;
import com.pompackage.Testclass;

public class TC002verifylogoutfunction
{
	@Test
	
	public void logoutfunction()
	{
		System.setProperty("WebDriver.Chrome.driver", "D:\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		
		Pomclass lp=new Pomclass(driver);
		lp.username();
		lp.password();
		lp.login();

		Testclass hp=new Testclass(driver);
		hp.clickSettingBtn();
		hp.clickLogOutBtn();
		

		   
		
		
		
		
		
		
		
		
		
		
		
	}

}
