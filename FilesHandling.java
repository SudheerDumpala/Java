package com.Files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class FilesHandling {

	public static void main(String[] args) throws IOException{
		File f = new File("/home/sudheer/Documents/Sample/");
		System.out.println(f.getParent()); // get parent returns the path of the parent file
		File f1 = new File(f.getParent()+"/blank.pdf");
		f1.createNewFile(); // This will create the new file to the parent file path of the previous directory
		/*System.out.println(Arrays.toString(f.list())); // This will give the list of all the contents 
		// in the given  directory (Including the Hidden files)
		System.out.println(Arrays.toString(f.listFiles())); //It gives the path of the files in the directory
		//System.out.println(f.mkdirs()); // mkdir - make directory. it creates a folder in the 
		// same directory of the current  project
		*/
		/*if(f.exists()){
			System.out.println(f.delete()); // To delete a file
		}
		
		System.out.println(f.createNewFile());// to create a file
		System.out.println(f.isHidden()); // to see if the file is hidden or not
		// adding the " . " in the front of the file will make it hidden in linux
		// Ex: .resume.txt is a hidden file
		System.out.println(f.canWrite()); // gives boolean output if the file is writable
		System.out.println(f.setWritable(true)); // making the file writable
		*/
	}

}
