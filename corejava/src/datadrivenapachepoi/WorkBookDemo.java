package datadrivenapachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkBookDemo {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\UDAY\\Desktop\\data.xlsx";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		int index=filePath.indexOf(".");
		System.out.println(index);
		String extType=filePath.substring(index);
		System.out.println("File type:"+extType);
		if(extType.equals(".xlsx"))
		{
			System.out.println("Reading file.....");
			XSSFWorkbook book=new XSSFWorkbook(fis);
			XSSFSheet sheet= book.getSheetAt(0);
			//book.getSheet("Sheet1");
//			XSSFRow row=sheet.getRow(10);
//			XSSFCell cell= row.getCell(1);
//			String cellValue=cell.getStringCellValue();
//			System.out.println("Cell Value:"+cellValue);
//			XSSFCell cell= sheet.getRow(9).getCell(1);
//			System.out.println("Value:"+cell.getStringCellValue());
			//Iteration used for every row of a sheet
			Iterator<Row> rows= sheet.rowIterator();
			rows.next();
			while(rows.hasNext()) {
				XSSFRow row= (XSSFRow) rows.next();
				//Iteration used for every cell of row
				Iterator<Cell> cells=row.cellIterator();
				while(cells.hasNext())
				{
					XSSFCell cell= (XSSFCell) cells.next();
					//System.out.println(cell.getCellType());
					if(cell.getCellType().toString()=="STRING")
					{
						String stringCellData=cell.getStringCellValue();
						System.out.println("Cell value:"+stringCellData);
					}
					if(cell.getCellType().toString()=="NUMERIC")
					{
						double numericCellData=cell.getNumericCellValue();
						System.out.println("Cell value:"+numericCellData);
					}
				}
				
			}
		}
		else
		{
			System.out.println("Wrong file extension");
		}
		try
		{
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}
