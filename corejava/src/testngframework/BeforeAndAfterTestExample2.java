package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterTestExample2 
{
	@Test
	  public void test1() 
	  {
		  System.out.println("Test1 executed");
	  }
  @BeforeClass
  public void beforeClassMethod()
  {
	  System.out.println("Before class executed");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before Method executed");
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("Test2 executed");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("After Method executed");
  }
  @AfterClass
  public void afterClassMethod()
  {
	  System.out.println("After class executed");
  }
}
