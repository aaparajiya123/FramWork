package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1TestNG {
WebDriver driver;

@Test (priority =1)
public void launchBroswer() {
	System.setProperty("webdriver.edge.driver", "C:/MicrosoftWebDriver.exe");
	driver = new EdgeDriver();
}
@Test (priority =2)
public void verifyTitle() {
	driver.get("https:/www.google.co.uk");
	Assert.assertEquals("Google", driver.getTitle());
}
@Test (priority =3)
public void closeBrowser() {
	driver.close();
}

}
