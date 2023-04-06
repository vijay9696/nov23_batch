package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsInSeleniumPart2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr26593");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Atharv@12");
		driver.findElement(By.xpath("//input[@name='btnLogin' and @type='submit']")).click();
		String url=driver.getCurrentUrl();
		System.out.println("Current URL:"+url);
		if(url.equals("https://demo.guru99.com/V1/html/Managerhomepage.php"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Error");
		}

	}

}
