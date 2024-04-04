package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToChristmasFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter christmasWrite = new FileWriter("Christmas.txt");
		    christmasWrite.write("Christmas is celebrated on the 25th of December each year."
		    		+ " It is a magical time of year where the life and love of Jesus is celebrated. Parents "
		    		+ "and Santa give gifts to their children and loved ones.");
		    christmasWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
	    	System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
