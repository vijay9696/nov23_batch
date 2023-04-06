package stringinjava;

public class CreateStringExample {

	public static void main(String[] args) {
		String s="Hello";//immutable
		s.concat("World");
		System.out.println(s.equals("Hello"));
		System.out.println(s.equalsIgnoreCase("hellO"));
		
		String s1=new String("Football");
		String s2=new String("Football");
		
		String s3="Football";
		String s4="Football";
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//false
		System.out.println(s3==s4);//true
		
		//s1==s2---0,s1>s2--+ve.s1<s2----ve
		String s5="Mumbai";
		String s6="Pune";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s5.compareTo(s6));
		System.out.println(s6.compareTo(s5));
		
		System.out.println(s5+s6);
		String s7=s5.concat(s6);
		System.out.println(s7);
	}

}
