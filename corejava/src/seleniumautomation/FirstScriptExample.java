package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstScriptExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String currentURL=driver.getCurrentUrl();
		System.out.println("Current Url:"+currentURL);
		String title=driver.getTitle();
		System.out.println("Page Title:"+title);
		String pageSource=driver.getPageSource();
		System.out.println("Page Source:"+pageSource);
		WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		String loginButtonText=loginButton.getText();
		System.out.println("Login Button Text:"+loginButtonText);
		String tagName=loginButton.getTagName();
		System.out.println("Tag Name:"+tagName);
		String cssValue=loginButton.getCssValue("background-color");
		System.out.println("CSS value:"+cssValue);
		String attribute=loginButton.getAttribute("name");
		System.out.println("Attribute :"+attribute);
		Dimension elmSize=loginButton.getSize();
		System.out.println("Width :"+elmSize.width);
		System.out.println("Height :"+elmSize.height);
		//driver.close();
		//driver.quit();
	}

}
