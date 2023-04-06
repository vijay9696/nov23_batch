package collectionframeworkinjava;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		set.add("D");
		set.add("B");
		set.add("C");
		set.add("Z");
		set.add("S");
		set.add("T");
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(33);
		set1.add(12);
		set1.add(9);
		set1.add(34);
		set1.add(67);
		

	}

}
