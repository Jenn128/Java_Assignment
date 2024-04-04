package javaAssignment;

import java.io.File;
import java.io.IOException;

public class CreateNewYearFile {
	public static void main(String[] args) 
	{
	    try 
	    {
			 File newYear = new File("NewYear.txt");
			 if (newYear.createNewFile()) 
			 {
				 System.out.println("File created: " + newYear.getName());
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
