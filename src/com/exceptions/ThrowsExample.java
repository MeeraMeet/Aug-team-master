package com.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {

	public static void file() throws FileNotFoundException, IOException
	
	{
		File f = new File("C:\\Users\\Chaitanya\\Downloads");
		FileInputStream fis = new FileInputStream(f);
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
