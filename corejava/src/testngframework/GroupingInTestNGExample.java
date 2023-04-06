package testngframework;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.testng.annotations.Test;

public class GroupingInTestNGExample {
  @Test(groups= {"car"},priority = 2)
  public void suzukiCar() 
  {
	  System.out.println("Suzuki car");
  }
  @Test(groups= {"bike"},enabled = false)
  public void hyundaiBike() 
  {
	  System.out.println("Hyundai Bike");
  }
  @Test(groups= {"car","bike"},priority = 1)
  public void tataCar() 
  {
	  System.out.println("Tata car");
  }
  @Test(groups= {"car"},priority = 3)
  public void audiCar() 
  {
	  System.out.println("Audi car");
  }
  @Test(groups= {"bike"},priority = 0)
  public void mercedizBike() 
  {
	  System.out.println("Mercediz Bike");
  }
  
  @Test(description = "This method is related to the honda bike",invocationCount = 5,timeOut = 5000)
  public void hondaBike() 
  {
	  System.out.println("Honda Bike");
  }
  @Test(dependsOnMethods = {"hondaBike"},enabled = false)
  public void tvsBike() 
  {
	  System.out.println("tvs Bike");
  }
}
