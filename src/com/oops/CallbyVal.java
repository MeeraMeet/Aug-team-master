package com.oops;

public class CallbyVal {
	public static void testCallbyValue(int c) {
	c = 1;
	}
	public static void main(String[] args) {
 int c = 4;
 testCallbyValue(c);
 System.out.println(c);

	}

}

//*********** CALL BY REFERENCE IS NOT POSSIBLE IN JAVA **************//