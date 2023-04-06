package stringinjava;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello World");
		System.out.println("Original String:"+sb);
		System.out.println("Length:"+sb.length());
		System.out.println("Capacity:"+sb.capacity());
		sb.ensureCapacity(40);
		System.out.println("New Capacity:"+sb.capacity());
		System.out.println("charAt:"+sb.charAt(4));
		sb.setCharAt(4,'y');
		System.out.println("setCharAt:"+sb);
		
		char c[]=new char[9];
		sb.getChars(0, 5, c, 0);
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}
		sb.insert(6, "Java ");
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		sb.replace(0, 4, "Hello");
		System.out.println(sb);
		System.out.println(sb.indexOf("World"));
		sb.append(" Hi World");
		System.out.println(sb);
		System.out.println(sb.lastIndexOf("World"));
		System.out.println(sb.reverse());
		String str12=sb.toString();
		System.out.println(str12);
	}

}
