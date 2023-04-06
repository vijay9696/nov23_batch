package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollBarExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement elm=driver.findElement(By.xpath("//h3[contains(text(),'EDITOR')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", elm);
	}

}
