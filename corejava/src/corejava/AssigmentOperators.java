package corejava;

public class AssigmentOperators 
{
	public static void main(String[] args) 
	{
//		int x=20,y=30,z=50; //simple assignment
//		x+=y;  //x=x+y=20+30=50
//		y-=x+z; //y=y-x+z=-70
//		z*=x*y;//z=z*(z*y)
//		y/=x*z;
		
		int a=19,b=31,c=50;
		a+=1;//20
		b-=1;
		c*=2;
		int x=(10+a);
		int y=x+100;
		int z=x+y+c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("x:"+x);
		System.out.println("z:"+z);
		System.out.println("y:"+y);

	}

}
