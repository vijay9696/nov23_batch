package testngframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestThroughXML {
  @Parameters("Name")
  @Test
  public void setName(String n) 
  {
	  System.out.println("Name is:"+n);
  }
  @Parameters("School")
  @Test
  public void setSchoolName(String s) 
  {
	  System.out.println("School Name is:"+s);
  }
  @Parameters("RollNo")
  @Test
  public void setRollNo(String r) 
  {
	  System.out.println("RollNo is:"+r);
  }
}
