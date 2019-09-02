package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() throws IOException  {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialisation();
		loginPage = new LoginPage();	
	}
	@Test (priority=1)
		public void loginPageTitleTest() {
		String title = loginPage.validateLoginTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Rediffmail");
	}
	@Test (priority=2)
		public void logoImageTest() {
		boolean logo = loginPage.validateLogoImage();
		Assert.assertTrue(logo);
	}
	@Test(priority=3)
		public void loginTest() throws IOException {
			homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		driver.quit();
	}

}
