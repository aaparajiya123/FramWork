package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Popup {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.drivre","‪C:\\ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.rediff.com");
	
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.name("proceed")).click();
	
	Alert popup = driver.switchTo().alert();
	String errMessage= popup.getText();
	System.out.println(errMessage);
	popup.accept();
	
	driver.findElement(By.id("login1")).sendKeys("aaparajiya");
	driver.findElement(By.id("password")).sendKeys("123456");
	
	boolean remember = driver.findElement(By.id("remember")).isSelected();
	System.out.println(remember);
	if (remember = true)
	{
		System.out.println("Remember is selected");
	}else
	{
		System.out.println("Remember is not selected");
	
	}	
}
}
