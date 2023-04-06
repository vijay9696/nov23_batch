package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class DataProviderLoginExample 
{
	WebDriver driver;
	@BeforeTest
	public void setupDriver()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Test(dataProvider = "myLoginData")
	public void loginTest(String userName,String password)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		WebElement success_msg=driver.findElement(By.xpath("//h1"));
		String msg=success_msg.getText();
		if(msg.equals("Logged In Successfully"))
		{
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("Login unsuccessful");
		}
		driver.findElement(By.xpath("//a[.='Log out']")).click();
	}
	
	@DataProvider(name="myLoginData")
	public Object[][] loginData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="student";
		data[0][1]="Password123";
		data[1][0]="student1";
		data[1][1]="Password1231";
		return data;
	}
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}
}
