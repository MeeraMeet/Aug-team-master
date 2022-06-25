package com.Arrays;

import java.util.ArrayList;

public class IntAL {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>(5);
	list.add(10);list.add(20);list.add(30);list.add(40);list.add(50);list.add(60);
	int n = list.size();
	System.out.println(n);
	for(int i =1; i<= n; i++)
		list.add(i);
	System.out.println(list);
	//remove element at index 3
	list.remove(3);
	System.out.println(list);
	// if we want to print elements in array list with a delimiter
	for(int i=0; i< list.size();i++)
		System.out.println(list.get(i));
}
}
