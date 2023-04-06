package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeAndAfterTestExample {
	WebDriver driver;

	@BeforeSuite
	public void setupDriver() {
		System.out.println("Before suit");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	@BeforeTest
	public void launchURL() {
		System.out.println("Before Test");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void getTitle() {
		System.out.println("In test");
		System.out.println("Title:"+driver.getTitle());
	}
	
	@AfterTest
	public void anotherTest()
	{
		System.out.println("After test");
	}
	
	@AfterSuite
	public void closeDriver()
	{
		System.out.println("After suit");
		driver.close();
	}
}
