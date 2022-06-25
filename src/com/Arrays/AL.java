package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add("C");
		String s = (String) a.get(1);
		//*************************************************************************
		ArrayList<String> al = new ArrayList<String>(5);
		al.add("10"); //it will add to the end. So any add will usually add to end of arraylist. So this is 0th index
		al.add("Chaitanya");// this is first index. Now let us add at 1st index.
		al.add(1, "AddElementTest");
		al.add("Ravinuthala");
		String s1 = al.get(0);
		String s2 = al.get(1);
		//Exception and its handling
		try
		{String s3 = al.get(5);}
		catch (Exception e) {
			//e.printStackTrace();
		}
		System.out.println("First element in ArrayList of String is: " + s1);
		System.out.println("Second element in ArrayList of String is: " + s2);
		System.out.println("Size of String typed ArrayList is: " + al.size());
		System.out.println("*********************************************************************");
		//Remove first element. Removal is based on index
		System.out.println("First element removal in ArrayList of String is: " + al.remove(0));
		System.out.println("*********************************************************************"); 	
		for(int i=0; i< al.size();i++)
			System.out.println("All elements in ArrayList of String are: " + al.get(i) + ",");
		System.out.println("*********************************************************************");
		System.out.println("Are we removing Ravinuthala " + al.remove("Ravinuthala"));
		for(int i=0; i< al.size();i++)
			System.out.println("All elements in ArrayList of String are: " + al.get(i) + ",");
		System.out.println("*********************************************************************");
		// Let us modify something. Say I want to replace "First INdex Test" with "Magnus"
		al.set(0, "Ravinuthala");
		for(int i=0; i< al.size();i++)
			System.out.println("Latest entries in AL are: " + al.get(i) + ",");
		System.out.println("*********************************************************************");
		//Sorting
		al.add("siva");al.add("krishna");al.add("aishu");al.add("zaheer");
		al.add("Sobha");al.add("Kam");al.add("Aaradhya");al.add("Zaheer");
		Collections.sort(al);
		for(String str:al)  
			System.out.println(str);  
		System.out.println("*********************************************************************");
		
		//Creating a new array here to convert ArrayList to Array
		String[] arr = new String[al.size()];
		//convertion now
		al.toArray(arr);
		
		for(String convArray:arr)  {
			System.out.println("Converted array is :" +convArray + ",");}  
		System.out.println("*********************************************************************");
		//contains
		System.out.println(al.contains(s2));
		System.out.println("*********************************************************************");
		//clear array
		al.clear();
		System.out.println(al);
	}  
}

