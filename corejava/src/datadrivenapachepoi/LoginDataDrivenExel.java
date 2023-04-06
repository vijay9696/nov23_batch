package datadrivenapachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataDrivenExel {
	WebDriver driver;
	public void loginData() throws IOException, InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://pixabay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		ArrayList username=readExcelData(0);
		ArrayList password=readExcelData(1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Log in']")).click();
		for(int i=0;i<username.size();i++)
		{
			
			driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys(username.get(i).toString());
			driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys(password.get(i).toString());
			if(i==0)
			{
				driver.findElement(By.xpath("//span[.='Log in']/parent::button//parent::div[contains(@class,'submitContainer')]")).click();
			}
			else
			{
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
			}
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//img[(contains(@src,'profile_images'))]")).click();
			if(i==1)
			{
				driver.findElement(By.xpath("//a[.='Log out']")).click();
			}
			driver.findElement(By.xpath("//label[contains(.,'Logout')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[.='Log in']")).click();
			
		}
		System.out.println("Success");
		driver.close();
	}
	
	public ArrayList readExcelData(int colNo) throws IOException{
		String filePath="C:\\Users\\UDAY\\Desktop\\login_data.xlsx";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheetAt(0);
		Iterator<Row> rows=sheet.rowIterator();
		rows.next();
		ArrayList<String> al=new ArrayList<String>();
		while(rows.hasNext())
		{
			Row row=rows.next();
			Cell cell=row.getCell(colNo);
			String data=cell.getStringCellValue();
			al.add(data);
		}
		
		return al;
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		LoginDataDrivenExel login=new LoginDataDrivenExel();
		login.loginData();

	}

}
