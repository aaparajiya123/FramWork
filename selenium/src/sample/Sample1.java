package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.uk");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().to("https://www.yahoo.com");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	
	
	driver.close();
	
	
	
}
}
