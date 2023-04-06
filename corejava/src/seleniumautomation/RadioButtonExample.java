package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement redioButton=driver.findElement(By.xpath("//input[@name='browser' and @value='Mozilla']"));
		System.out.println("Radio button before selection:"+redioButton.isSelected());
		redioButton.click();
		System.out.println("Radio button after selection:"+redioButton.isSelected());
		driver.close();
	}

}
