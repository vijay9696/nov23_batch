package collectionframeworkinjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList llist=new LinkedList();
		llist.add("One");
		llist.add(2);
		llist.add(null);
		llist.add(null);
		llist.add("Four");
		llist.add("Four");
		System.out.println(llist);
		llist.add(2, "Three");
		System.out.println(llist);
		llist.addFirst(0);
		System.out.println(llist);
		llist.addLast("Five");
		System.out.println(llist);
		
		ArrayList al=new ArrayList();
		al.add("Six");
		al.add(7);
		al.add("Eight");
		
		llist.addAll(1,al);
		System.out.println(llist);
		
		llist.removeFirst();
		System.out.println(llist);
		llist.removeLast();
		System.out.println(llist);
		llist.remove(6);
		System.out.println(llist);
		
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		System.out.println(llist.get(5));
		llist.push("Five");
		llist.push("Six");
		System.out.println(llist);
		llist.pop();
		System.out.println(llist);
		llist.pop();
		System.out.println(llist);
		
		ListIterator litr=llist.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}

}
