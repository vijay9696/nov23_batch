package seleniumautomation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class ClickAndHoldExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement blockC=driver.findElement(By.xpath("//li[@name='C']"));
		WebElement blockA=driver.findElement(By.xpath("//li[@name='A']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(blockC);
		actions.clickAndHold().perform();
		actions.moveToElement(blockA);
		actions.release().perform();
	}

}
