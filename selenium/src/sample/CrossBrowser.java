package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

public static WebDriver driver;
public static int browser;
public static String browserName;
	
public static void main(String[] args) throws InterruptedException {
	
for (browser = 1; browser<=3; browser++)
{
	if (browser ==1)
	{	System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver.exe");
		driver = new ChromeDriver();
		browserName = "Google Chrome";
	}else if (browser ==2)
	{	System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
		browserName = "Mozila Firefox";
	} else if (browser ==3)
	{	System.setProperty("webdriver.edge.driver", "C:/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		browserName = "Microsoft Edge";
	}

	driver.get("https://www.google.co.uk");
	Thread.sleep(3000);
	String pageTitle = driver.getTitle();

	if (pageTitle.equals("Google")) {
		System.out.println(browserName+"Google application launched - Passed");
	}else
		
	{System.out.println(browserName+"Google application not launched - Failed");
	}

	driver.close();
}
}
}
