package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertsInSeleniumExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement simpleAlert=driver.findElement(By.xpath("//input[@id='simple']"));
//		simpleAlert.click();
//		Alert alert=driver.switchTo().alert();
//		String simpleAlertText=driver.switchTo().alert().getText();
//		System.out.println("Text available on simple Alert:"+simpleAlertText);
//		alert.accept();
		
//		WebElement confirmAlert=driver.findElement(By.xpath("//button[@id='confirm']"));
//		confirmAlert.click();
//		Alert alert=driver.switchTo().alert();
//		String confirmAlertText=driver.switchTo().alert().getText();
//		System.out.println("Confrimation Alert Text:"+confirmAlertText);
//		alert.accept();
		
		WebElement promptAlert=driver.findElement(By.xpath("//button[@id='prompt']"));
		promptAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Selenium");
		alert.accept();
		String promptAlertText=driver.findElement(By.xpath("//div[@id='prompt_demo']")).getText();
		System.out.println("Confrimation Alert Text:"+promptAlertText);
		
	}

}
