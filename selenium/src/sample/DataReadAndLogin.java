package sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataReadAndLogin {
WebDriver driver;

@Test(dataProvider="testdata")
public void login(String UName, String Pwd) throws IOException, InterruptedException{
	System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	driver.findElement(By.id("pt-login")).click();
	driver.findElement(By.id("wpName1")).sendKeys(UName);
	driver.findElement(By.id("wpPassword1")).sendKeys(Pwd);
	driver.findElement(By.id("wpLoginAttempt")).click();
	Thread.sleep(3000);
	driver.close();
}

@DataProvider(name="testdata")
public Object[][] readExcel() throws BiffException, IOException {
	File f = new File("C:\\Users\\user\\IdeaProjects\\TestData.xls");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet(0);
	int columns = s.getColumns();
	int rows = s.getRows();	
	System.out.println(columns +" "+ rows);

	String inputData [][]=new String [rows][columns];
	
	for (int i=0; i<rows;i++) {
		for(int j=0; j<columns; j++) {
			Cell c=s.getCell(j,i);
			inputData[i][j]=c.getContents();
//			System.out.println(inputData[i][j]);	
		}
	}
	return inputData;
}

}
