package javaAssignment;

import java.io.File;
import java.io.IOException;

public class CreateHalloweenFile {
	public static void main(String[] args) 
	{
	    try 
	    {
			 File halloween = new File("Halloween.txt");
			 if (halloween.createNewFile()) 
			 {
				 System.out.println("File created: " + halloween.getName());
			 } 
			 else 
			 {
				 System.out.println("File already exists.");
			 }
	    } 
	    	catch (IOException e) 
	    	 {	
	    		System.out.println("An error occurred." + e.getMessage());
			 }
	}
}
