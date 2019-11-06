package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

By UserName = By.name("login");
By Password = By.name("passwd");
By LoginButton = By.name("proceed");

public LoginPage(WebDriver driver) {
	this.driver = driver;	
}

public void typeUserName(String Uname) {
	driver.findElement(UserName).sendKeys(Uname);	
}

public void typePassword (String Pwd) {
	driver.findElement(Password).sendKeys(Pwd);
}

public void clickLoginButton () {
	driver.findElement(LoginButton);
}
public void captureUserName() {
	driver.findElement(UserName).getAttribute("value");
}

public void clearUserName() {
	driver.findElement(UserName).clear();
}
public void clearPasswrod() {
	driver.findElement(Password).clear();
}
public void closeDriver() {
	driver.close();
}


}
