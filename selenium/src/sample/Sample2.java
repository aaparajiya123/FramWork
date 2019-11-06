package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample2 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.drivre","c://MicrosoftEdgeDriver.exe");
WebDriver driver = new EdgeDriver();

driver.get("https://www.google.co.uk");
driver.findElement(By.name("q")).sendKeys("Jai Swaminarayan");

Thread.sleep(2000);
driver.findElement(By.name("q")).clear();

driver.navigate().refresh();
Thread.sleep(2000);

driver.close();

}

}
