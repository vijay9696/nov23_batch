package collectionframeworkinjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationUsingDiiferentLoopsExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		//System.out.println("ArrayList:"+al);
		//Iteration using for loop
		System.out.println("Iteration using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		al.set(5,"G");
		al.set(4, null);
		System.out.println("ArrayList:"+al);
		//Iteration using enhanced for loop
		System.out.println("Iteration using advanced for loop");
		for(String element:al)
		{
			System.out.println(element);
		}
		//Iteration using while loop
		System.out.println("Iteration using while loop");
		int j=0;
		while(al.size()>j)
		{
			String element=al.get(j);
			System.out.println(element);
			j++;
		}
		System.out.println("Iteration using Iterator");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Iteration using ListIterator");
		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}

}
