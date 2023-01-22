package com.testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pompackage.Pomclass;
import com.pompackage.Testclass;

public class TC003addtocart 
{

	@Test
	public void addtocart()
	{
		System.setProperty("WebDriver.Chrome.driver", "D:\\\\chromedriver_win32\\\\Chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Pomclass lp= new Pomclass(driver);
	lp.username();
	lp.password();
	lp.login();
	
	
	Testclass at=new Testclass(driver);
    at.clickBagProductAddTOCart();
	at.getTextFromAddToCartBtn();
	
	
	
	
	
		
		
		
		
	}
	
	
	
	
	
	
}
