package com.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		int r;
		FileReader fr = new FileReader("C:\\Users\\Chaitanya\\Downloads\\Test.txt");
		//while((r=fr.read())!=-1) // !=-1
		
		
		while((r= fr.read())!=-1)
			System.out.print((char)r); //type casting 
		fr.close();


	}

}
