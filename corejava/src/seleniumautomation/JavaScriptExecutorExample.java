package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Object title=js.executeScript("return document.title");
		System.out.println(title.toString());
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('enter correct login credentials to continue');");
		Thread.sleep(2000);
	}

}
