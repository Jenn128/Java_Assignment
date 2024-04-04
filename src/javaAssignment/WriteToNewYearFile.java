package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToNewYearFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter newYearWrite = new FileWriter("NewYear.txt");
		    newYearWrite.write("New Years is celebrated on the 31st of December each year."
		    		+ "It marks the beginning of a new year and it is a celebration of the year ahead");
		    newYearWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
		    System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
