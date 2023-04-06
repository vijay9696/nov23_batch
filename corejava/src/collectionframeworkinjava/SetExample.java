package collectionframeworkinjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.add("A");
		set.add("B");
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.add("C");
		set.add("D");
		System.out.println(set.size());
		set.add("D");
		System.out.println(set.size());
		set.add(null);
		System.out.println(set.size());
		set.add(null);
		System.out.println(set.size());
		
		Set set1=new HashSet();
		set1.add("Red");
		set1.add("Green");
		set1.add("Blue");
		set1.add("Orange");
		
		set1.addAll(set);
		//set1.clear();
		System.out.println("set1"+set1);
		System.out.println(set1.contains("Orange"));
		System.out.println(set1.containsAll(set));
		set1.remove("Blue");
		System.out.println(set1);
		System.out.println(set1.hashCode());
		
		Iterator<String> itr=set1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
