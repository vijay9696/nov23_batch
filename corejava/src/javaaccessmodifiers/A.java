package javaaccessmodifiers;

import corejava.AreaOfCircle;
 class AA 
{
	public int data1=30;
	public int data2=40;
	public void showData()
	{
		System.out.println("Hello Java"+data1);
	}
}
public class A
{
	public int data1=30;
	public int data2=40;
	public void showData()
	{
		System.out.println("Hello Java"+data1);
	}
	public static void main(String rags[])
	{
		AA aa=new AA();
		//aa.data1=30; will not accessible bcz its private
		aa.data2=34;
		aa.showData();
		AreaOfCircle ac=new AreaOfCircle();
	}
}
