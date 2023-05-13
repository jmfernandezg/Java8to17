package com.jmfg.training.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesReadWriteAsString {
	
	public static void main(String[] args) throws IOException {
		
		readString();
		writeString();
	}
	
	private static void readString() throws IOException {

		Path path = Paths.get("src/main/java/com/jmfg/training/java11/file1.txt");
		String content = new String(Files.readAllBytes(

				path));
		System.out.println(content);

		//new method added in JDK11.
		String contents = Files.readString(path);
		System.out.println(contents);
	}

	private static void writeString() throws IOException {
		  
		  Files.writeString(Paths.get("src/main/java/com/jmfg/training/java11/file2.txt"),"I am learning Java 11");
		  
		  var testContents = Files.readString(Paths.get("src/main/java/com/jmfg/training/java11/file2.txt"));
		  System.out.println(testContents.equals("I am learning Java 11"));
	}
}
