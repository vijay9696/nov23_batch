package collectionframeworkinjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("Maruti");
		arrayList.add("Mahindra");
		arrayList.add("Toyota");
		arrayList.add("Hunadai");
		System.out.println(arrayList);
		
		List<String> arrayList2=new ArrayList<String>();
		arrayList2.add("Audi");
		arrayList2.add("Mercidiz");
		arrayList2.add("Skoda");
		arrayList2.add("Kia");
		arrayList.add("");
		
		arrayList2.add(1, "Ferari");
		System.out.println(arrayList2);
		
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2);
		
		arrayList2.addAll(2, arrayList);
		System.out.println(arrayList2);
		
		System.out.println(arrayList2.get(3));
		
		Iterator<String> itr=arrayList2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
