package com.garbage;

public class Garbcoll {
	//final, finally, finalize
	//thread called Deamon
	//few ways to make an obj eligible for garbage collection
	// Null ref to an obj
	public static void main(String[] args) {
		Garbcoll g1 = new Garbcoll();
		Garbcoll g2 = new Garbcoll();

		//what are the objects here? g1 & g2

		// we shall make g1 as null
		g1= null;
		System.gc();//static method where we request JVM to collect garbage by running Garbage collector
		g2 = null;
		Runtime.getRuntime().gc(); // in run time we request
		System.out.println(g1);
		System.out.println(g2);


	}
	@Override
	protected void finalize() throws Throwable {

		//System.out.println("Garbage collector is called above");
		System.out.println("Garbage collector is called above" + this);

	}

}

