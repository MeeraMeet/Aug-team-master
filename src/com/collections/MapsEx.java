package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;

public class MapsEx {
//HashMap<k,v> is part of our java collections. We also saw that java collections is being implemented since JDK1.2
	//it stores in key value pair. you can access them using lot of default methods we have.
	//you can also try inserting a duplicated key and see if the correspoding key is getting replaced.
	// HashMap is unsynchronized. (Thread).
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//add elements to Hashmap
		hm.put("Chaitanya", 4050);
		hm.put("Siva", 4051);
		hm.put("Krishna", 4052);
		hm.put("Ravy", 4053);
		hm.put("Indira", null);
		hm.put("Moderna", null);
		hm.put(null, null);
		hm.put(null, null);
		System.out.println("Size of map is: " +hm.size());
		System.out.println("Initial Map is: " +hm);
		//if & assign
		if(hm.containsKey("Chaitanya"))
		{
			//mapping
			Integer i = hm.get("Chaitanya");
			System.out.println("Value of Key Chaitanya is: " +i);
		}
		hm.put("Indira", 4054);
		System.out.println("Latest Map is: " +hm);
		hm.remove("Moderna");
		System.out.println("Latest Map is: " +hm);
		hm.remove(null);
		System.out.println("*********** MAP IS ************");
		System.out.println(hm);
		hm.entrySet();
		System.out.println("Latest Map is: " +hm);
		hm.keySet();
		System.out.println("keySet is: " +hm);
		
		System.out.println("The keySet will be: " +hm.keySet());
		System.out.println("The val will be: " +hm.values());
		
		//ITERATIONS
		
		for(Map.Entry<String, Integer> m: hm.entrySet()) // for(String s: arryaList)
			System.out.println("Key is: " + m.getKey() +" " + "Value is: " +m.getValue());
		//Map.Entry is an interface usually provided by java where it gives again certain methods to access the entries in the map
		//if we gain access, then we can easily modify/manipulate them
		//java.util package is is present in .
	}
	
	
}
