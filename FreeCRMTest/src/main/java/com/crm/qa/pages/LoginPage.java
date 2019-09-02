package com.crm.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//initialising page object:
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	//Page Factory-OR:
	@FindBy (name="login")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath=".//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[1]/a/img")
	WebElement logoImage;
	
	// Actions:
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	public boolean validateLogoImage() {
		return logoImage.isDisplayed();
	}
	public HomePage login(String un, String pdw) throws IOException {
		userName.sendKeys(un);
		password.sendKeys(pdw);
		loginButton.click();
		return new HomePage();
	}
}
