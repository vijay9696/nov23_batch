package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowsersNavigationMethodExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement gmaillink=driver.findElement(By.linkText("Gmail"));
		gmaillink.click();
		System.out.println("Page Title:"+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("Page Title of back page:"+driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("Page Title of forward page:"+driver.getTitle());
		driver.navigate().refresh();
		
	}

}
