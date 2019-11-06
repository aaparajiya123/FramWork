package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BatchTesting {

public static WebDriver driver;

public void launchBroswer() {
	System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.rediff.com");
}
public void message() {
	System.out.println("Test Passed");
}
public void closeBroswer() {
	driver.close();
}
public static void main(String[] args) throws InterruptedException {
BatchTesting obj = new BatchTesting();

obj.launchBroswer();
Thread.sleep(3000);
obj.message();
obj.closeBroswer();

	}

}
