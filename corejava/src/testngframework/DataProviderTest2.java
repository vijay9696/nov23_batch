package testngframework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 
{
  @Test(dataProvider = "getData")
  public void setData(String name,String age)
  {
	  System.out.println("Name:"+name);
	  System.out.println("Age:"+age);
  }
  
//  @DataProvider(name="getData")
//  public Object[][] dataProviderMethod()
//  {
//	  Object[][] data=new Object[3][2];
//	  data[0][0]="abc";
//	  data[0][1]="23";
//	  data[1][0]="pqr";
//	  data[1][1]="40";
//	  data[2][0]="xyz";
//	  data[2][1]="50";
//	  return data;
//  }
  
  @DataProvider public Object[][] getData()
  {
	  return new Object[][] {
		  {"aaa","33"},
		  {"bbb","44"},
		  {"ccc","55"},
	  };
  }
}
