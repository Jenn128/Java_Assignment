package javaAssignment;

import java.io.File;
import java.io.IOException;

public class CreateEasterFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
			 File easter = new File("Easter.txt");
			 if (easter.createNewFile()) 
			 {
				 System.out.println("File created: " + easter.getName());
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
