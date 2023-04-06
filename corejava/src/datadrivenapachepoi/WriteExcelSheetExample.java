package datadrivenapachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheetExample {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\UDAY\\Desktop\\login_data.xlsx";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell= row.createCell(2);
		cell.setCellValue("Pass");
		sheet.getRow(2).createCell(2).setCellValue("FAIL");
		FileOutputStream fos=new FileOutputStream(filePath);
		wb.write(fos);
		
		fos.close();
		System.out.println("File written successfully");

	}

}
