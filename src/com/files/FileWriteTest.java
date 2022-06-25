package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) throws IOException {
		String s = "this is a demo on handling files";
		FileWriter fw = new FileWriter("C:\\Users\\Chaitanya\\Downloads\\Test.txt");
		for(int i =0; i<s.length();i++)
			fw.write(s.charAt(i));
		System.out.println("file writing done");
		fw.close();
		
	}

}
