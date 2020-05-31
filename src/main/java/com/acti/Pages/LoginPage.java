package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiBase.DriverScript;

public class LoginPage extends DriverScript {
	
	//*****************page elements88*********//
	
	@FindBy(id="logoContainer") WebElement actiLogo;
	@FindBy(id="username") WebElement UsernameTB;
	@FindBy(name="pwd") WebElement PasswordTB;
	@FindBy(id ="loginButton") WebElement loginButton;
	@FindBy(id="KeepLogedInCheckBox") WebElement Loggedincheckbox;
	@FindBy(id="toPasswordRecoveryPageLink") WebElement forgotpasswordlink;
	
	//********** page initialization************//
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
   //****************page action or methods***********//
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	public void ValidateLogin(String username, String password)
	{
		UsernameTB.sendKeys(username);
		PasswordTB.sendKeys(password);
		Loggedincheckbox.click();
		loginButton.click();
	}
	
	public String VerifyPageTitle()
	{
           return driver.getTitle();
	}
	public boolean VerifyLoggedInBox()
	{
	 return Loggedincheckbox.isDisplayed();
	}
	}

