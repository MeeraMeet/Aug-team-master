package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		HashMap<K, V> is a part of Java’s collection since Java 1.2. 
		//		This class is found in java.util package. It provides the basic implementation of the Map interface of Java. 
		//		It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). 
		//		One object is used as a key (index) to another object (value). If you try to insert the duplicate key, 
		//		it will replace the element of the corresponding key.

		//		HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, 
		//		but there should be only one null key object and there can be any number of null values.  
		//		This class makes no guarantees as to the order of the map.
		//		To use this class and its methods, you need to import java.util.HashMap package or its superclass.

		//		Hierarchy of Maps: Map -> AbstractMap -> HashMap -> LinkedHashMap

		// Create an empty hash map by declaring object
		// of string and integer type
		HashMap<String, Integer> map = new LinkedHashMap<>();

		// Adding elements to the Map
		// using standard add() method
		map.put("John", 10);
		map.put("Dan", 30);
		map.put("Scott", 20);
		map.put("removeable", 80);

		// Print size and content of the Map
		System.out.println("Size of map is:- "
				+ map.size());

		// Printing elements in object of Map
		System.out.println(map);

		// Checking if a key is present and if
		// present, print value by passing
		// random element
		if (map.containsKey("John")) {   //similarly containsValue() method in map finds the value match

			// Mapping
			Integer a = map.get("John");

			// Printing value fr the corresponding key
			System.out.println("value for key"
					+ " \"John\" is:- " + a);
		}

		//Update the map on the basis of index
		map.put("Dan", 40);
		System.out.println("Updated map" +map);

		//removing an element from map
		map.remove("removeable");
		System.out.println("Map after the element is removed " +map);

		//Traversing or iterating over the hashMap
		// Iterate the map using
		// for-each loop

		for (Map.Entry<String, Integer> e : map.entrySet())  
			System.out.println("Key: " + e.getKey()
			+ " Value: " + e.getValue());
		//Map.Entry, entrySet are the keywords to remember
		// Map.Entry interface in Java provides certain methods to access the entry in the Map. 
		//By gaining access to the entry of the Map we can easily manipulate them. 
		//Map.Entry is a generic and is defined in the java.util package.

		if(!map.isEmpty()) {
			System.out.println("Map is not empty :" +map);
		} else {
			System.out.println("Map is empty");
		}
		
//		map.clear();  //clears the map
		
//		keyset vs entrySet
//		keyset() - This method returns the Set view of all the keys present in the map, ie it returns a set of keys.	
//		entrySet() - This method returns the Set view of all the mappings present in the map, ie it returns a set of key, value pairs.
	}
}




