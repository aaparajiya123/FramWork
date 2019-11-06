package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyElement {

public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\MicrosoftWebDriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
	try {
		if (driver.findElement(By.linkText("xmail")).isDisplayed())
		{
		System.out.println("Gmail link is exist - Passed");
		}
	}catch (NoSuchElementException e)
		{
		System.out.println("Gmail link is not exist - Failed");
		}
	driver.close();
}
}
