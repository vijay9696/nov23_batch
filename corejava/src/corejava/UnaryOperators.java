package corejava;

public class UnaryOperators {

	public static void main(String[] args) {
		int x=2;
		int y=x++;
		System.out.println("x:"+x+" and y:"+y);
		int i=0;
		System.out.println("i:"+(++i));
		System.out.println("i:"+(i++));
		
		int a=50,b=100,c=200;
		int p,q,r;
		p=++a;//p=a=51
		q=b++;//q=100 b=101
		r=a+b++ + ++c;//51+101+201=353
		
		System.out.println("p:"+p);//51
		System.out.println("q:"+q);//100
		System.out.println("r:"+r);//353
		
		int f=10;
		int g=++f * f++;//11*11=121
		System.out.println("g:"+g);
		
		int l=20;
		int m=++l*10/l++ + ++l;//((21*10)/21)+23=33
		System.out.println("m:"+m);
	}

}
