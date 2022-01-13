package com.JavaCollectionExample.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {
	/** List(I) is a Child of Collection(I).
	 * ArrayList (C) is one of the classes provides implementation for the List(I).
	 * The underlying DS is resizeable Array or Growable Array. We can insert Heterogeneous objects as well.
	 * NOTE: All the collections can store Heterogeneous objects can be stored except TREE SET and TREE MAP.
	 * ArraList and vector implements RandomAccess, Serializable and Cloneable Interfaces
	 * best suited for Search operations because of RandomAccess Interface 
	 * Duplicates value-> yes
	 * Insertion order -> yes
	 * Synchronized -> no
	 * Thread Safe -> no
	 * Default capacity -> 10
	 * Fill Ratio/ Load factor : 1 or 100%
	 * Growth Rate : current_size + current_size/2
	 * */

	public void arrayListExample()
	{
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("Bugatti");
		arrayList.add("Bentley");
		arrayList.add("Bugatti");
		arrayList.add("Bugatti");
		arrayList.add("BMW");
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(3)); //to get the value in the particular index
		System.out.println(arrayList.indexOf("Bugatti"));
		System.out.println(arrayList.indexOf("Maruti"));
		System.out.println(arrayList.lastIndexOf("Bugatti"));
		
		//adding all the datas of one collection to other collection
		List<String> anotherList=new ArrayList<String>();
		anotherList.addAll(arrayList);   
		System.out.println(anotherList);
		anotherList.clear();
		System.out.println(anotherList);
		
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("Bugatti");
		System.out.println(arrayList);
		
		//Null Insertion is possible
		arrayList.add(null);
		System.out.println(arrayList);
		
		//replacing in the particular position by using index value 
		arrayList.set(0, "Chevrolet");
		System.out.println(arrayList);
		
		//isEmpty()
		System.out.println(arrayList.isEmpty());
		System.out.println(anotherList.isEmpty());
		
		//Iterate using for each loop and for loop
		System.out.println("--------------------------------");
		for (String string : arrayList) {
			System.out.println("Using for each : "+string);
		}
		System.out.println("--------------------------------");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println("Using for loop : "+arrayList.get(i));
		}
		
		//Only in ListIterator both forward and reverse is possible not in Iterator
		//forward traversing using ListIterator
		System.out.println("--------------------------------");
		ListIterator<String> list_iterator=arrayList.listIterator();
		while(list_iterator.hasNext()) //hasNext() -> until the next element present
		{							   // next() -> print that element 
			System.out.println("Using ListIterator Forward: "+list_iterator.next());
		}
		//reverse traversing using ListIterator
		System.out.println("--------------------------------");
		while(list_iterator.hasPrevious())
		{
			System.out.println("Using ListIterator Reverse: "+list_iterator.previous());
		}
		
		//Iterator
		//Iterator has only forward traverse
		System.out.println("--------------------------------");
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Using Iterator: "+iterator.next());
		}
		System.out.println("--------------------------------");
/*		for(String string : arrayList)
		{
			System.out.println("Using for loop : "+string);
			arrayList.add("Benz");
		}*/
		List al=new ArrayList();
		al.add(1);
		al.add("String");
		System.out.println(al);
	}
	public static void main(String[] args) {
		ArrayListEx example=new ArrayListEx();
		example.arrayListExample();
	}

}
