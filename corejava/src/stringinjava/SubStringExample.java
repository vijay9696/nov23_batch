package stringinjava;

public class SubStringExample {

	public static void main(String[] args) {
		String str="Hello, World";
		
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(7));
		System.out.println(str.substring(3, 9));
		
		String str1=new String("JavaPrograming");
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(9,14));
		System.out.println(str1.substring(0,4));
		
		String str2=new String();
		System.out.println(str2.length());
		System.out.println(str2.isEmpty());//true
		String str3="";
		System.out.println(str3.length());
		System.out.println(str3.isEmpty());//true

		String str4="Kava";
		System.out.println(str4.replace('K', 'J'));
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());
		System.out.println(str4.charAt(0));
		
		String str5=" java programing ";
		System.out.println(str5.trim());
		System.out.println(str5.contains("java"));
		System.out.println(str5.startsWith(" java"));
		System.out.println(str5.endsWith("programing "));
		System.out.println(str5.indexOf("graming ")); 
		
		String s6="I love my India";
		String[] strarray=s6.split(" ");
		int len=strarray.length;
		System.out.println("len:"+len);
		for(int i=0;i<len;i++)
		{
			System.out.println(strarray[i]);
		}
		
	}

}
