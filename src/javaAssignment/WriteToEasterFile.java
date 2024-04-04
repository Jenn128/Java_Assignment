package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToEasterFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter easterWrite = new FileWriter("Easter.txt");
		    easterWrite.write("Easter is celebrated on a different day each year."
		    		+ "It is celebrated on the first Sunday after the full Moon that occurs "
		    		+ "on or after the spring equinox");
		    easterWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
	    	System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
