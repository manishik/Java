package com.javaInterview.IO;

import java.io.*;

public class Writer1 {

	public static void main(String[] args) {
		try {
			boolean newFile = false;
			File myDir = new File("mydir");
			myDir.mkdir();
			
			File file = new File("ManishFileWriter.txt");
			System.out.println("Does this file exist? " + file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Howdy\nManish\nHow is it going?"); // write characters to the file
			fileWriter.flush(); // flush before closing
			fileWriter.close(); // close file when done
		} catch (IOException e) {
		}
	}

}
