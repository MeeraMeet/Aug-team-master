package com.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
	//We have an excel or db where we have rows and columns
		// array -> {1,2,3,4,5,6} // you can say a[0] =1; a[1]=2; 
		//int i[] = new int[3];
		
		String s[][] = new String[2][3]; // Indexes as 0,1 - rows and for columns we will have 0,1,2 => 0,0 is first cell, 0,1 is the row0col1
		System.out.println(s.length); //row length
		System.out.println(s[0].length); //column length
		
		s[0][0]="Say R0C0 has value 1, it will print 1"; s[0][1]="R0C1"; s[0][2]="R0C2"; 
		s[1][0]="R1C0"; s[1][1]="R1C1"; s[1][2]="R01C2";
		
		// How do we print all the values?
		for (int row =0; row<s.length; row++)
		{
			for(int col=0; col <s[0].length; col++)
			{
				System.out.println(s[row][col]);
			}
		}
		

	}

}
