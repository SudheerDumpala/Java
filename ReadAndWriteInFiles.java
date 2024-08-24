/* We can do operations on files using different meethods.
 * some of them are 1) FileInputStream, 2) Scanner 3)FileReader
 * 4) BufferReader */
package com.Files;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ReadAndWriteInFiles {
	public static void main(String[] args) throws IOException {
		File file = new File("/home/sudheer/Documents/Sample/blank.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		// using FileInputStream
		
		FileInputStream fis = new FileInputStream(file);
		int Asciicode;
		/*
		 The read() method reads the input by character wise and it gives the output as
		 the Ascii Values of that character. if no character is there to read(End of the
		 file, read() method returns -1
		*/
		String text = "";
		while((Asciicode = fis.read())!= -1) {
			//System.out.print((char)Asciicode);
			text += String.valueOf((char)Asciicode);
		}
		
		System.out.print(text);
		System.out.println();
		
		// USING SCANNER
		// It allows to read both by the character wise and by line wise using 
		// .next() and the .nextLine() methods
		
		//Scanner input = new Scanner(file); OR
		/*FileInputStream files = new FileInputStream(file);
		Scanner input = new Scanner(files);*/
		Scanner input = new Scanner(new FileInputStream(file));
		while(input.hasNext()) {
			System.out.print(input.nextLine()+"\n");
		}
		
		// using FileReader
		// FileReader is as same as the FileInputStream and as same as it also uses the read()

		// using BufferReader
		//BufferReader reads the file by using the object of the reader class,
		//which is either can be a FileReader object or InputStreamReader object
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// code
		fr.close();
		br.close();
		
		input.close();
		fis.close();	
		
		// WRITING OPERATIONS IN FILES
		/* To write data in files, we use mainly three classes, They are 
		 * 1) FileOutputStream, 2)FileWriter, 3)BufferedWriter
		 * Note: we can't able to use the "Scanner" class to do write operations in files
		 */
		// using FileOutputStream
		FileOutputStream fos = new FileOutputStream(file);
		String string = "Hello Mr.Praveen Kumar Dumpala";
		for(char ch:string.toCharArray()) {
			fos.write(ch); // It iterates only through characters not strings
		}
		
		// using FileWriter
		String word = "Hello Sudheer";
		FileWriter fw = new FileWriter(file);
		fw.write(word);
		fos.close();
		fw.close();
		
		// using BufferedWriter
		String sentence = "The Northeren Lights are looking soo beautiful";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(sentence);
	}
}
