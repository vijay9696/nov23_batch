package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-me.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement sourceElement=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetElement=driver.findElement(By.xpath("//div[@class='post-title-container' and @xpath='1']"));
		Actions actions=new Actions(driver);
		//actions.dragAndDropBy(sourceElement, 400, 400);
		//actions.build().perform();
		actions.dragAndDrop(sourceElement, targetElement);
		actions.build().perform();
	}

}
