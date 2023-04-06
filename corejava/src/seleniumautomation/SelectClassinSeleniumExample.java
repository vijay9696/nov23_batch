package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassinSeleniumExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dropDown= driver.findElement(By.xpath("//select[@name='country']"));
		System.out.println("Is dropdown Displayed:"+dropDown.isDisplayed());
		System.out.println("Is dropdown Enabled:"+dropDown.isEnabled());
		Select select=new Select(dropDown);
		System.out.println("Is dropdown Multiselected:"+select.isMultiple());
		int listSize=select.getOptions().size();
		System.out.println("List Size:"+listSize);
		//select.selectByValue("IN");
		//select.selectByIndex(1);
		select.selectByVisibleText("France");
		System.out.println("Selected option:"+select.getFirstSelectedOption().getText());
		

	}

}
