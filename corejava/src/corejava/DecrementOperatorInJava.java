package corejava;

public class DecrementOperatorInJava {

	public static void main(String[] args) {
		int x=10;
		System.out.println("x:"+x);
		int y=--x;//x=x-1
		System.out.println("x:"+x);//9
		System.out.println("y:"+y);//9
		
		int a=1;
		System.out.println("a:"+a);//1
		System.out.println("a:"+(--a));//a=a-1=0
		System.out.println("a:"+a);//0
		System.out.println("a:"+(a--));//0
		System.out.println("a:"+a);//-1
		
		int b=1;
		++b;//b=b+1=2
		int c=b++;//b=2  b=b+1=3
		b--;//b=2
		int d=--b;//1
		int z=b*10/(c-d);
		System.out.println("b:"+b);//1
		System.out.println("z:"+z);//10

	}

}
