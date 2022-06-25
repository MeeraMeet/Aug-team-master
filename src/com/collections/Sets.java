package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
//Union, Intersection and Difference. ms
	public static void main(String[] args)
	{
	

		//UNION, INTERSECTION & DIFFERENCE
		
		Set<Integer> s1 = new HashSet<Integer>();
		Integer[] ia = new Integer[] {0,1,2,3,4,7,8}; //Boxed array
		s1.addAll(Arrays.asList(ia));
		System.out.println("Set s now is: " +s1);
		
		Set<Integer> s2 = new HashSet<Integer>();
		Integer[] ia2 = new Integer[] {0,2,2,3,5,7,9}; //Boxed array
		s2.addAll(Arrays.asList(ia2));
		System.out.println("Set s now is: " +s2);
		
		Set<Integer> us = new HashSet<Integer>(s1);
		us.addAll(s2);
		System.out.println("Union now is: " +us);
		
		Set<Integer> is = new HashSet<Integer>(s1);
		is.retainAll(s2);
		System.out.println("Intersection now is: " +is);
		
		Set<Integer> sd = new HashSet<Integer>(s2);//sd stands for symmetric diff
		sd.removeAll(s1);
		System.out.println("Symmetric Diff is: " +sd);
		
		
		
		Set<String> h = new LinkedHashSet<String>();
		Set<String> h1 = new HashSet<String>();
		Set<String> h2 = new LinkedHashSet<String>();

		// Z, A, X, F -> LHS will print the same order but Hashset will change order.

		h.add("Dog");h.add("Cat");h.add("Zeebra"); h.add("Dog");
		System.out.println("Our set is: " +h);
		h1.add("Giraffe");h1.add("monkey");h1.add("human");
		h2.add("Giraffe");h2.add("monkey");
		System.out.println("Contains functionality check: " +h2.containsAll(h1));
		System.out.println("Add all func: " +h.addAll(h1));
		System.out.println("Our latest set after allAll is: " +h);
		System.out.println("Is h set containing Zeebra: " +h.contains("Zeebra"));
		System.out.println("is h and h1 equal? " + h.equals(h1));
		System.out.println("is h an empty set? " +h.isEmpty());
		System.out.println("Hashcode is: " +h.hashCode());
		System.out.println("Removing the element Zeebra: " +h.remove("Zeebra"));
		System.out.println("Our latest set after allAll is: " +h);
		//Iterators
		System.out.println("********* ITERATORS START ***********");
		Iterator<String> it=h.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("********* SIMPLE FOR ***********");
		//Simple for loop
		for(String s: h) {System.out.println(s);}
		System.out.println("********* FOR EACH ***********");
		h.forEach(System.out::println);
		//removeAll
		h.removeAll(h);
		System.out.println("My set after removeAll: " +h);
		
		
	}
}
