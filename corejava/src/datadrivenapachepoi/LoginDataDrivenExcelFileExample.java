package datadrivenapachepoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataDrivenExcelFileExample {
	WebDriver driver;
	@BeforeTest
	public void setupDriver()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://pixabay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest()
	{
		
	}
	
	@Test
	
	
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}
}
