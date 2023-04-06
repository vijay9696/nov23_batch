package corejava;

public class AreaOfCircle 
{
	float pi=3.14f;
	int radius=10;
	int x=100;
	
	public void findAreaOfCircle()
	{
		float result=pi*radius*radius;
		System.out.println("Area of circle is:"+result);
	}

	public static void main(String[] args) 
	{
		AreaOfCircle obj=new AreaOfCircle();
		obj.findAreaOfCircle();
	}

}
