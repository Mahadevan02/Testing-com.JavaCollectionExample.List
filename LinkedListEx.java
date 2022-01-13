package com.JavaCollectionExample.List;

import java.util.LinkedList;
import java.util.*;

public class LinkedListEx {
	/**
	 * LinkedList is implemented using Doubly linked list. 
	 * This is best suited for insertion and deletion operations.
	 * Unlike ArrayList, this is not the best for retrieving the data.
	 * All the collections implements Serializable and cloneable Interfaces.
	 * LinkedList also implements those Interfaces but not RandomAccess Interface.
	 * Duplicates value-> yes
	 * Insertion order -> yes
	 */
	public void linkedListExample()
	{
	LinkedList<Integer> linkedList=new LinkedList<Integer>();
	linkedList.add(2);
	linkedList.add(3);
	linkedList.add(4);
	linkedList.add(2);
	linkedList.add(5);
	linkedList.add(4);
	System.out.println(linkedList);
	
	//Add an element to the first and last position
	linkedList.addFirst(1);
	System.out.println("After adding first : "+linkedList);
	linkedList.addLast(5);
	System.out.println("After adding last : "+linkedList);
	
	//get the first and last value and using index position
	// while using index to get the value,
	//linkedList.indexOf(3) -> Since LinkedList has the dataStructure of doubly linked list, 
	//the value of the 3rd index is known to the link present in the 2nd index.
	//internally the prgm will traverse to the index numbr 2 and then only it can get the value of 3. So it is not suitable for searching operation
	System.out.println("First value : "+linkedList.getFirst());
	System.out.println("Last value : "+linkedList.getLast());
	System.out.println("Using index : "+linkedList.indexOf(3)); 
	
	//removeFirst and removeLast
	System.out.println("Remove first : "+linkedList.removeFirst());
	System.out.println("Remove Last : "+linkedList.removeLast());
	System.out.println(linkedList);
	
	//poll() and pollFirst()  deletes the first elements in the list
	System.out.println(linkedList.poll());
	System.out.println(linkedList);
	System.out.println(linkedList.pollFirst());
	System.out.println(linkedList);
	
	//pollLast() deletes the last elements in the list
	System.out.println(linkedList.pollLast());
	System.out.println(linkedList);
	
	//remove() deletes the first element
	System.out.println(linkedList.remove());
	System.out.println(linkedList);
	
	//Adding
	linkedList.add(2);
	linkedList.add(3);
	linkedList.add(4);
	linkedList.add(5);
	linkedList.add(6);
	linkedList.add(7);
	System.out.println(linkedList);
	
	//removeFirstOccurence and removeLastOccurrence
	linkedList.removeFirstOccurrence(2);
	System.out.println("After removing the first occurence of 2: "+linkedList);
	linkedList.removeLastOccurrence(5);
	System.out.println("After removing the first occurence of 5 : "+linkedList);
	System.out.println("---------------------------");		
	}
	
	public void iterateLinkedListWithSimpleFor()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println(linkedList);
		System.out.println("Simple for loop");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println("Elements in Linked list are : "+linkedList.get(i));
		}
		System.out.println("---------------------------");
	}
	
	public void iterationWithAdvancedFor()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println(linkedList);
		System.out.println("For Each");
		for (String string:linkedList) {
			System.out.println("Elements in Linked list are : "+string);
		}
		System.out.println("---------------------------");
	}
	
	public void iterationWithWhile()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number=0;
		System.out.println(linkedList);
		System.out.println("While Loop");
		while (linkedList.size()>number) {
			System.out.println("Elements in Linked list are : "+linkedList.get(number));
			number++;
		}
		System.out.println("---------------------------");
	}
	
	// Iterate using Iterator
	public void iterateUsingIterator()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String> iterator=linkedList.iterator();
		System.out.println(linkedList);
		System.out.println("Using Iterator");
		while (iterator.hasNext()) {
			System.out.println("Elements in Linked list are : "+iterator.next());
		}
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		LinkedListEx example=new LinkedListEx();
		example.linkedListExample();
		example.iterateLinkedListWithSimpleFor();
		example.iterationWithAdvancedFor();
		example.iterationWithWhile();
		example.iterateUsingIterator();
	}

}
