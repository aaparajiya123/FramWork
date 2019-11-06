package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestClass {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","C:/MicrosoftWebDriver.exe");
WebDriver abc = new EdgeDriver();

LoginPage login = new LoginPage(abc);

abc.get("https:/rediff.com");
abc.findElement(By.linkText("Sign in")).click();

Thread.sleep(3000);
login.typeUserName("aaparjiya");
login.typePassword("abc123");


Thread.sleep(3000);
//login.clickLoginButton();

login.closeDriver();

}

}
