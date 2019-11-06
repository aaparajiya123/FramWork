package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyTitle {
WebDriver driver;
@Test
public void verifyTitle() {
	
System.setProperty("webdriver.chrome.drier","C:/ChromeDriver.exe");
driver = new ChromeDriver();
driver.get("https://www.google.co.uk");

String pageTitle = driver.getTitle();

Assert.assertEquals("Google",pageTitle);
}

@AfterMethod
public void closeBrowser() {
driver.close();
}

}
