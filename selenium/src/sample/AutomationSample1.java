package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationSample1 {

public static void main(String[] args) throws InterruptedException {
	
/*	System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	*/
/*	System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	*/
	System.setProperty("webdriver.edge.driver", "c:/MicrosoftWebDriver.exe");
	WebDriver driver = new EdgeDriver();
	
	driver.get("http:\\www.google.co.uk");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String title = driver.getTitle();
	System.out.println(title);
	if (title.contains("Google"))
	{System.out.println("Test Passed");
	}else
	{System.out.println("Test Failed");
	}
	driver.close();
	}
}

