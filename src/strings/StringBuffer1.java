package strings;

public class StringBuffer1 {
public static void main(String[] args) {


	StringBuffer s= new StringBuffer("JavaWorlds");
	int l = s.length();
	
	//Capacity
	
	int c = s.capacity();
	System.out.println(c);
	
	// APpend functionality
	
	StringBuffer s1 = new StringBuffer("HelloWorld");
	s1.append("java");
	System.out.println(s1);
	s1.append("123");
		System.out.println(s1);
	
//append as such is a func that appends/adds the string to the end.
	
	// Insert. Insert at an any specified index position
	
	StringBuffer s2 = new StringBuffer("UnitedStates");
	s2.insert(6, "of");
	System.out.println(s2);
	System.out.println(s2.reverse());
	
	// String BUilder
}
	

}
