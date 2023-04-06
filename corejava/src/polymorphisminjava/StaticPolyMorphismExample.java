package polymorphisminjava;

public class StaticPolyMorphismExample {

	public void sum(int x)
	{
		int sum=x+x;
		System.out.println("Sum:"+sum);
	}
	public void sum(int x,int y)
	{
		int sum=x+y;
		System.out.println("Sum:"+sum);
	}
	public float sum(int y,float x)
	{
		float sum=y+x;
		return sum;
	}
	public double sum(int x,double y,float z)
	{
		double sum=x+y+z;
		return sum;
	}
	public static void main(String[] args) {
		StaticPolyMorphismExample obj=new StaticPolyMorphismExample();
		double res=obj.sum(10, 20d, 30f);
		System.out.println(res);
		obj.sum(20);

	}

}
