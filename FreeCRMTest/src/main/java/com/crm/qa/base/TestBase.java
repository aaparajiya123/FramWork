package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.crm.qa.utils.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		prop = new Properties();
		
		try 
		{
			FileInputStream ip = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);		
		} catch (FileNotFoundException e) {
		e.printStackTrace();	
		}
	}

	public static void initialisation() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {	
			System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equals("IE")) {
			System.setProperty("webdriver.edge.driver", "c:\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICTI_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

	}
	
}