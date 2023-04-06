package stringinjava;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		int len=sb.length();
		int cap=sb.capacity();
		System.out.println("Length:"+len);
		System.out.println("Initial Capacity:"+cap);//16
		sb.append("Appended String in existing");
		
		System.out.println("After adding chars more than 16");
		System.out.println("Length:"+sb.length());
		System.out.println("Initial Capacity:"+sb.capacity());//34
		
		sb.append("Appended String in existing String String");
		System.out.println("After adding chars more than 35");
		System.out.println("Length:"+sb.length());
		System.out.println("Initial Capacity:"+sb.capacity());//70
		System.out.println(sb);
		

	}

}
