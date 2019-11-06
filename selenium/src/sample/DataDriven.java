package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DataDriven {
public static WebDriver driver;

public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.edge.driver", "c:/MicroSoftWebDriver.exe");
FileReader file = new FileReader ("C:/Users/user/Documents/aswin_dev/DataFile.txt");
BufferedReader br = new BufferedReader(file);

int count =0;
int iteration =0;
String line;

while ((line = br.readLine())!=null)
	{count = count +1;
	if (count>1) {
		iteration = iteration+1;
		String [] inputData = line.split(", ",2);
		System.out.println(inputData[0] +" "+ inputData[1]);
		driver = new EdgeDriver();
		driver.get("www.rediff.com");
		Thread.sleep(3000);
		driver.close();
		}
	}
br.close();
file.close();
}
}
