package corejava;

public class DefaultDataType {
	
	byte x;//1byte=8bit
	short y;//2byte = 16 bit
	int m;//4byte = 32bit
	long l;//8byte=64 bit
	float f=45.435324532453244345f;//4byte=32 bit----6-7 fractional values
	double d=33.87785587687678687642342134d;//8byte =64bit---upto 14 fractional values
	char c;//2bytes=16bit---'u0000'
	char c1='A';
	int a=10;
	int a1=5;
	boolean b;//1 bit---only two possible values--true / false

	public static void main(String[] args) {
		  
		DefaultDataType obj=new DefaultDataType();
		System.out.println("byte default value:"+obj.x);
		System.out.println("Short default value:"+obj.y);
		System.out.println("int default value:"+obj.m);
		System.out.println("long default value:"+obj.l);
		System.out.println("float default value:"+obj.f);
		System.out.println("double default value:"+obj.d);
		System.out.println("char default value:"+obj.c);
		System.out.println("boolean default value:"+obj.b);
	}

}
