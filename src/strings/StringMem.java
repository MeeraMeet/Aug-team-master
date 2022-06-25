package strings;

public class StringMem {

	public static void main(String[] args) {

		String s1 = "Canada"; //Immutable. 
		String s2 = "Canada";// 
		String s3 = new String("Canada");
		String s4 = new String("Canada");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	
	//String is backed up charArray[] -> Array is static. Defined in size. Never grow. => String is also static and hence it is immutable
	}

}
