/*
 * package com.Arrays;
 * 
 * import java.util.ArrayList; import java.util.Collections; import java.util.*;
 * import java.util.List;
 * 
 * public class LinkedList { public static void main(String[] args) { LinkedList
 * ll = new LinkedList();
 * //*************************************************************************
 * 
 * ll.add("10"); //it will add to the end. So any add will usullly add to end of
 * arraylist. So this is 0th index ll.add("Chaitanya");// this is first index.
 * Now let us add at 1st index. ll.add("AddElementTest"); ll.add("Ravinuthlla");
 * String s1 = ll.get(0); String s2 = ll.get(1); //Exception and its handling
 * try {String s3 = ll.get(5);} catch (Exception e) { //e.printStackTrace(); }
 * System.out.println("First element in ArrayList of String is: " + s1);
 * System.out.println("Second element in ArrayList of String is: " + s2);
 * System.out.println("Size of String typed ArrayList is: " + ll.size());
 * System.out.println(
 * "*********************************************************************");
 * //Remove first element. Removll is based on index
 * System.out.println("First element removll in ArrayList of String is: " +
 * ll.remove(0)); System.out.println(
 * "*********************************************************************");
 * for(int i=0; i< ll.size();i++)
 * System.out.println("lll elements in ArrayList of String are: " + ll.get(i) +
 * ","); System.out.println(
 * "*********************************************************************");
 * System.out.println("Are we removing Ravinuthlla " +
 * ll.remove("Ravinuthlla")); for(int i=0; i< ll.size();i++)
 * System.out.println("lll elements in ArrayList of String are: " + ll.get(i) +
 * ","); System.out.println(
 * "*********************************************************************"); //
 * Let us modify something. Say I want to replace "First INdex Test" with
 * "Magnus" ll.set(0, "Ravinuthlla"); for(int i=0; i< ll.size();i++)
 * System.out.println("Latest entries in ll are: " + ll.get(i) + ",");
 * System.out.println(
 * "*********************************************************************");
 * //Sorting ll.add("siva");ll.add("krishna");ll.add("aishu");ll.add("zaheer");
 * ll.add("Sobha");ll.add("Kam");ll.add("Aaradhya");ll.add("Zaheer");
 * Collections.sort(ll); for(String str:ll) System.out.println(str);
 * System.out.println(
 * "*********************************************************************");
 * 
 * //Creating a new array here to convert ArrayList to Array String[] arr = new
 * String[ll.size()]; //convertion now ll.toArray(arr);
 * 
 * for(String convArray:arr) { System.out.println("Converted array is :"
 * +convArray + ",");} System.out.println(
 * "*********************************************************************");
 * //contains System.out.println(ll.contains(s2)); System.out.println(
 * "*********************************************************************");
 * //clear array ll.clear(); System.out.println(ll); }
 * 
 * private String size() { // TODO Auto-generated method stub return null; }
 * 
 * private String get(int i) { // TODO Auto-generated method stub return null; }
 * 
 * private void add(String string) { // TODO Auto-generated method stub
 * 
 * } }
 * 
 */