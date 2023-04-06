package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseBasedActionsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement GmailLink=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions actions=new Actions(driver);
//		int xlocation=GmailLink.getLocation().getX();
//		int ylocation=GmailLink.getLocation().getY();
//		System.out.println("X:"+xlocation+" and Y:"+ylocation);
//		actions.moveByOffset(xlocation, ylocation).click();
		actions.click(GmailLink);
		actions.build().perform();
	}

}
