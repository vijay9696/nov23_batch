package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test1");
  }
  
  @Test
  public void homePage()
  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\UDAY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  System.out.println("Title:"+driver.getTitle());
	  driver.close();
  }
}
