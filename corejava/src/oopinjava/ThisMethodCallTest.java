package oopinjava;

public class ThisMethodCallTest 
{
	int num;
	public ThisMethodCallTest(int num)
	{
		this.num=num;//refer current object
	}
	public void show()
	{
		System.out.println("number:"+this.num);
	}
	
	ThisMethodCallTest incrNum()
	{
		num++;
		return this;
	}
	public static void m1()
	{
		System.out.println("Method1");
	}
	public void m2()
	{
		this.m1();//this.m1()
		System.out.println("Method2");
	}
	public static void main(String[] args) {
		
		ThisMethodCallTest tmct=new ThisMethodCallTest(20);
		tmct.incrNum().incrNum().incrNum();
		tmct.show();
	}

}
