package collectionframeworkinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("List Items:"+list);
		ListIterator<String> li=list.listIterator();
//		System.out.println(li.hasNext());
//		System.out.println(li.next());
//		System.out.println(li.nextIndex());
//		System.out.println(li.hasPrevious());
		//System.out.println(li.previous());
//		System.out.println(li.previousIndex());
		System.out.println("Forward Direction");
		while(li.hasNext())
		{
			if(li.next().equals("A"))
			{
				li.remove();
			}
		}
		li.add("D");
		//li.remove();
		System.out.println("Backward Direction");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
