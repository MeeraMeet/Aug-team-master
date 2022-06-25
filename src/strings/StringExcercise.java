package strings;

public class StringExcercise {

	public static void main(String[] args) {
		String s1 = "UnitedStatesOfAmerica";
		// length
		System.out.println("s1 length: " + s1.length());
		//character at nth index/position
		System.out.println("s1 character at 2nd position: " + s1.charAt(0));
		//Substring -> part of the string
		System.out.println("Substring :" + s1.substring(6));
		
		System.out.println("Another Substring :" + s1.substring(6,11));
		// Concat - Joining of Strings
		String s2 = "United";
				String s3 = "StatesOfUSA";
				System.out.println("Concatenated String is " +s2.concat(s3));
				
				System.out.println("Index of U: " + s1.indexOf("U"));
				
				//System.out.println("Index of e, post the 5th index is: " +s1.indexOf('e',5));
				
			String s5 = "Hello";
			String s6 = "HEllo";
			System.out.println(s5.equals(s6));
			
			System.out.println(s6.toLowerCase());
			System.out.println(s6.toUpperCase());
			
			String s7 = s6.replace('l','h');
			System.out.println(s7);
		
	}

}
