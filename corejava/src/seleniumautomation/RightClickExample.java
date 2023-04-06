package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement rightClickDiv= driver.findElement(By.xpath("//div[@id='div-context']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClickDiv);
		WebElement javaMenuItem=driver.findElement(By.xpath("//a[text()='Java']"));
		actions.click(javaMenuItem).perform();
		Alert alert=driver.switchTo().alert();
		System.out.println("Msg:"+alert.getText());
		alert.accept();
		
	}

}
