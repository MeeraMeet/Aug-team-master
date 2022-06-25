package com.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowCode {

public static void file() throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException // you are able to throw(s) many exceptions
//again it is telling user that there is a possiblity of such excpetions.
	
	{
		File f = new File("C:\\Users\\Chaitanya\\Downloads\\Test.txt");
		FileInputStream fis = new FileInputStream(f);
		throw new FileNotFoundException("File missing"); // one throw is possible for a method
		
	}
	public static void main(String[] args) {
		try
		{
			file();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}