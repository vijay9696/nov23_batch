package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsInSeleniumPart1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.id("identify_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.linkText("Cancel")).click();
		
		
	}

}
