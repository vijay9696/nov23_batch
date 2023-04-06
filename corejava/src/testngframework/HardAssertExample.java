package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertExample 
{
  WebDriver driver;
  @BeforeClass
  public void setUpDriver()
  {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  
  @Test
  public void assertSameMethod()
  {
	  String str1="Hello";
	  String str2="Hello";
	  Assert.assertSame(str1, str2);
  }
  @Test
  public void assertNotSameMethod()
  {
	  String str1="Hello";
	  String str2=new String("Hello1");
	  Assert.assertNotSame(str1, str2);
  }
  @Test
  public void nullAssertMethod()
  {
	  Assert.assertNull(driver,"Driver is null");
  }
  @Test
  public void notNullAssertMethod()
  {
	  Assert.assertNotNull(driver,"Driver is not null");
  }
  @Test
  public void verifyTitle()
  {
	  String actualTitle=driver.getTitle();
	  System.out.println("Actual Title:"+actualTitle);
	  Assert.assertEquals(actualTitle, "Google","Titles are matched");
  }
  
  @Test
  public void compareNumeric()
  {
	  Assert.assertTrue(5>2);
	  System.out.println("5 is greater than 2");
  }
  
  @Test
  public void compareString()
  {
	  String str="Java";
	  Assert.assertTrue("Java".equals(str),"Matched");
	  System.out.println("Strings are matched");
  }
  @Test
  public void compareNumeric1()
  {
	  Assert.assertFalse(5<2);
	  System.out.println("5 is not greater than 2");
  }
  
  @Test
  public void compareString1()
  {
	  String str="Java123";
	  Assert.assertFalse("Java".equals(str),"Not Matched");
	  System.out.println("Strings are not matched");
  }
  
  @Test
  public void failTest()
  {
	  Assert.fail("failed for testing");
  }
  
  @AfterClass
  public void closeDriver()
  {
	  driver.close();
  }
}
