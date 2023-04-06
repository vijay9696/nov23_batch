package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DriverSetup {
	WebDriver driver;
	@BeforeSuite
	public void setupDriver()
	{
		System.out.println("Before suit");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		
	}
	
	  @Test
	  public void launch() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void t1()
	  {
		  System.out.println("Test1");
	  }
	  @Test
	  public void t2()
	  {
		  System.out.println("Test2");
	  }
	  @Test
	  public void t3()
	  {
		  System.out.println("Test3");
	  }
	  
	  @AfterSuite
	  public void closeDriver()
	  {
		  System.out.println("After suit");
		  driver.close();
	  }
}
