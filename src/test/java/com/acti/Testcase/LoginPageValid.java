package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Pages.LoginPage;
import com.actiBase.DriverScript;

public class LoginPageValid extends DriverScript {

	public LoginPageValid() {
		super();
	}

	LoginPage lp;

	@BeforeMethod
	public void pretest() {
		initapp();
		lp = new LoginPage();

	}

	@AfterMethod
	public void posttest() {
		driver.quit();
	}

	@Test(priority = 1)
	public void TestVerifyActiLogo() {
		boolean Flag = lp.verifyActiLogo();
		Assert.assertTrue(Flag);
	}

	@Test(priority = 3)
	public void TestValidateLogin() {
		lp.ValidateLogin("admin", "manager");
		String string2 = lp.VerifyPageTitle();
		Assert.assertEquals("actiTIME - Enter Time-Track", string2);

	}

	@Test(priority = 4)
	public void TestVerifyLoggedIn() {
		boolean Flag2 = lp.VerifyLoggedInBox();
		Assert.assertTrue(Flag2);
	}

	@Test(priority = 2)
	public void TestVerifyPageTitle() {
		String string = lp.VerifyPageTitle();
		Assert.assertEquals("actiTIME - Login", string);

	}
}
