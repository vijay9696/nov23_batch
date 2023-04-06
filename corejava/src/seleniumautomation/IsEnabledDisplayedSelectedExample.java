package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabledDisplayedSelectedExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
//		System.out.println("isEnabled:"+searchBox.isEnabled());
//		System.out.println("isDisplayed:"+searchBox.isDisplayed());
		
		WebElement redCheckbox= driver.findElement(By.xpath("//input[@name='color' and @value='red']"));
		redCheckbox.click();
		System.out.println("isSelected:"+redCheckbox.isSelected());
	}

}
