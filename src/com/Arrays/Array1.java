package com.Arrays;

public class Array1 {
public static void main(String[] args) {

//arrays woudl come into picture. => Collection of elements of a same/similar data type.
// elements woudl be stored in contignous order in the memory
// Data structure of similar elements
// Index based
//1st element be of 0th Index
// last element will be of (n-1) index where n is the length of the array


	int[] arrInt = {9, 8 , 20};
	System.out.println(arrInt);
	System.out.println(arrInt[2]);
	
	// for-each 
	for (int i: arrInt)
	System.out.println(i);

	// 2nd method
	
	System.out.println("************************ 2nd Method **********************");
	
	int a[]= new int[5];
	a[0]= 60;
	a[1]= 100;
	a[2]= 6;
	a[4]= 50;
	a[3]= 40;
	
	// traversing the array
	System.out.println(a.length);
	for (int i = 0; i <a.length;i++)
		System.out.println(a[i]);
	
	System.out.println(a[5]); //Index is bounded between 0 & 4
	
}
}
