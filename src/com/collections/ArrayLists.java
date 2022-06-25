package com.collections;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1); //Int addition .. If you have a memory and u are adding 1 here. it gets added at the end.
		a.add("String added") ;//String addition // You are adding string and it gets added at the end. Which means it will push 1 to front. So it is like last come last add
		
		String s = (String) a.get(1);
		System.out.println(s);
		//String s = (String) a.get(1);
		System.out.println("********** Array List operations begin ******************");
		ArrayList<String> al = new ArrayList<String>(); // you need not typecast. Because it is only going to have string
		System.out.println("***** Add elements to Array List");
		al.add("10"); // it will append or get added to the end so any add with usally be added t the end of array list. And this is 0th index
		al.add("Krishna"); // this is first index
		al.add(1, "Chaitanya"); // when we try to add Chaitanya between 10 and Krishna .. it needs ot first swap , create memory space and then
		//adds chaitanya
		al.add("Ravinuthala");
		al.add("Ravinuthala");
		al.add(null);
		ArrayList<String> al2 = new ArrayList<String>(); // you need not typecast. Because it is only going to have string
		al2= (ArrayList<String>) al.clone();
		String s1 = al.get(0);
		String s2 = al.get(1);
		String s3 = al.get(2);
		String s4 = al.get(3);
		System.out.println("First element of ArrayList is: " + s1);
		System.out.println("Sec element of ArrayList is: " + s2);
		System.out.println("Third element of ArrayList is: " + s3);
		System.out.println("Fourth element of ArrayList is: " + s4);
		//String s5 = al.get(5);
		try {String s5 = al.get(5);} catch (Exception e) {
			//e.printStackTrace();
		}
		System.out.println("Size of array list is: " +al.size());
		System.out.println("**** REMOVAL of elements in ArrayList *****");
		//aren't they working on the basis of index
		System.out.println("First element removal in arraylist: " + al.remove(0));
		System.out.println("*********************");
		System.out.println("Are we removing Krishna: " + al.remove("Krishna"));
		for (int i =0; i<al.size();i++)
			System.out.println("All the elements now in arrayList are: " +al.get(i));
		System.out.println("***** MODIFY Operation/Update Operation ***************");
		al.set(0, "Krishna");
		for (int i =0; i<al.size();i++)
			System.out.println("All the elements now in arrayList are: " +al.get(i));
		System.out.println("****** SORTING *************");
		al.add("Siva");al.add("Apple");al.add("Zaheer");al.add("Bat");al.add("Tree");al.add("Rome");
		Collections.sort(al);
		for (String str: al)
			System.out.println(str);
		System.out.println("**************** COVERSION of AL to Array ****************");
		String[] arr = new String[al.size()];
		al.toArray(arr);
		// for and print the content of your new array which is derived from your array list.
		System.out.println("********* CONTAINS ************");
		System.out.println(al.contains(s3));
		
		System.out.println("******* Customizing Generic and passing our own data type ********");
		Automobile a1 = new Automobile("Honda", "Manual", 10);
		Automobile a2 = new Automobile("BMW", "Automatic", 2);
		Automobile a3 = new Automobile("Audi", "Hybrid", 5);
		ArrayList<Automobile> autoAL = new ArrayList<Automobile>();
		autoAL.add(a1);
		autoAL.add(a2);
		autoAL.add(a3);
		
		//We saw for, we saw for each. Yest I just hinted about something called "Iterator" which is used
		// to iterate the elements in the collection
		//Iterator<Automobile> it = autoAL.iterator();
		Iterator<Automobile> it =autoAL.iterator();
		while(it.hasNext())
		{
			Automobile au = it.next();
			System.out.println(au.name);
			System.out.println(au.type);
			System.out.println(au.years);
		}
		System.out.println(al);
		
		System.out.println("********* CLEAR my ArrayList******");
		al.clear();
		System.out.println(al);
		
		//arraylis1 & arraylist2 -> arraylist1.addall(arraylist2); 
		//ArrayList<E> - Element  
		//retain() arraylist1.retain(arraylist2); // common elements 
		
		
	}
	

}
