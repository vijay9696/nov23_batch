package collectionframeworkinjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set set1=new HashSet();
		set1.add("Red");
		set1.add("Green");
		set1.add("Blue");
		set1.add("Orange");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(set1);
		lhs.add("Red");
		lhs.add("Green");
		lhs.add("Blue");
		lhs.add("Blue");
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs.size());
		System.out.println(lhs);
		lhs.remove(null);
		System.out.println(lhs);
		
		for(String elements:lhs)
		{
			System.out.println(elements);
		}
		
		Iterator<String> it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	

	}

}
