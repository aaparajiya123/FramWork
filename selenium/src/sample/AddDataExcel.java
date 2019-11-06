package sample;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AddDataExcel {

public static void main(String[] args) throws BiffException, IOException {

//@Test
//public void add(String n1,String n2,String n3) {
//	int a = Integer.parseInt(n1);
//	int b = Integer.parseInt(n2);
//	int c = Integer.parseInt(n3);
//	int result = a+b+c; 
//}

	File f = new File("C:\\Users\\user\\IdeaProjects\\TestData.xls");
	Workbook wb = Workbook.getWorkbook(f);
	Sheet s = wb.getSheet(1);
	int rows = s.getRows();
	int columns = s.getColumns();
//	System.out.println(rows+" "+columns);
	
	String input[][]= new String [rows][columns];
	for (int i=0; i<rows;i++) {
		for (int j=0;j<columns;j++) {
			Cell c = s.getCell(j,i);
			input[i][j]=c.getContents();
			System.out.print(input[i][j]+", ");
		}
		System.out.println(" ");
	}
}

}
