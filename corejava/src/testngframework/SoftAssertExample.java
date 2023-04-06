package testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample 
{
	@Test(priority = 0)
	public void softAssertTest()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("Soft Assertion started....");
		sa.assertTrue(false);
		System.out.println("Soft Assertion ended.....");
		sa.assertAll();
	}
	
	@Test(priority = 1)
	public void hardAssertTest()
	{
		System.out.println("Hard Assertion started....");
		Assert.assertTrue(true);
		System.out.println("Soft Assertion ended.....");
	}
}
