package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int iframeSize=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Iframes:"+iframeSize);
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//input[@itemprop='query-input']")).sendKeys("Selenium tutoral");
		driver.findElement(By.xpath("//button[@id='td-header-search-top']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Main Page title:"+driver.getTitle());
		System.out.println("Main Page URL:"+driver.getCurrentUrl());
		driver.switchTo().frame("iframe_b");
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("Selenium");
		

	}

}
