package com.pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass
{ WebDriver driver;

//find element 


@FindBy(xpath="//input[@id='user-name']")
WebElement username;

@FindBy(xpath="//input[@id='password']")
WebElement password;

@FindBy(xpath="//input[@id='login-button']")
WebElement loginbtn;


//action perform

public void username()
{
	username.sendKeys("standard_user");
}

public void password()
{
	password.sendKeys("secret_sauce");
}

public void login()
{
	loginbtn.click();
}

//create cunstructor

public Pomclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}


}




