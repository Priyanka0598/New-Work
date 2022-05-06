package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getTestData() throws IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Documents\\LOGIN.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Credentials").getRow(2).getCell(1).getStringCellValue();
		System.out.println(value);
		return value;
		

	}
}
