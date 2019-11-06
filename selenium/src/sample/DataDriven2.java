package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven2 {

public static void main(String[] args) throws BiffException, IOException {

File f = new File ("C:\\Users\\user\\Documents\\aswin_dev\\TestData.xls");
//FileInputStream f = new FileInputStream ("C:\\Users\\user\\Documents\\aswin_dev\\TestData.xls");
Workbook w = Workbook.getWorkbook(f);
Sheet s = w.getSheet(0);

int columns = s.getColumns();
int rows = s.getRows();

String inputData[][] = new String [rows][columns];

System.out.println("Columns :"+columns);
System.out.println("Rows :"+rows);

for (int i=0;i<rows;i++) {
	for (int j=0;j<columns;j++) {
		Cell c = s.getCell(j,i);
		inputData[i][j]=c.getContents();
		System.out.print("Row:"+i+" Col:"+j+" = "+inputData[i][j]+" ");
		}
	System.out.println("");
	}
}

}
