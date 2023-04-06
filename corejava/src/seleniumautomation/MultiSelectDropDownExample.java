package seleniumautomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement multiSelect= driver.findElement(By.xpath("//select[@name='Month']"));
		Select select=new Select(multiSelect);
		System.out.println("Is MultiSelected:"+select.isMultiple());
		select.selectByIndex(1);
		select.selectByValue("Feb");
		select.selectByVisibleText("March");
		System.out.println("Size:"+select.getAllSelectedOptions().size());
		List<String> list=new ArrayList<String>();
		List<WebElement> options=select.getOptions();
		for(WebElement element:options)
		{
			list.add(element.getText());
		}
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		select.deselectByIndex(1);
//		select.deselectByValue("Feb");
//		select.deselectByVisibleText("March");
		
		select.deselectAll();
		

	}

}
