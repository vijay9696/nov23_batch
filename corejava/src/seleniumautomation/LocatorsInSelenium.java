package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("userName")).sendKeys("Albert");
		//driver.findElement(By.tagName("input")).sendKeys("albert@gmail.com");
		//driver.findElement(By.name("userName")).clear();
		//driver.findElement(By.linkText("Report this ad")).click();
		//driver.findElement(By.partialLinkText("Report")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("albert@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Pune");
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Mumbai");
		//driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']")).click();

	}

}
