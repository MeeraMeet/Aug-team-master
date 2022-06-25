package com.collections;
import java.util.*;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		LinkedList<String> ll = new LinkedList<String>();
		//Add behavior
		ll.add("GS");
		ll.add("BOFA");
		ll.add("WellsFargo");
		ll.add("JPMC");
		//Print
		System.out.println(ll);
		//Addlast & Addfirst
		ll.addFirst("StateStreet");
		ll.addLast("DEShaw");
		System.out.println(ll);
		//Insert/modify
		ll.set(1, "Citi");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		ll.remove(0);
		System.out.println(ll);
		ll.addFirst("StateStreet");
		ll.addLast("DEShaw");
		ll.add("GS");
		System.out.println("The final LinkedList at this moment is: " +ll);
		// foreach
		System.out.println("********* FOR EACH **************");
		for (String s : ll)
		{
			System.out.println(s);
		}
		// Iterator
		System.out.println("********* ITERATOR AS BELOW **************");
	
		int a=10;
		
		Iterator<String> it =ll.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	}

}
