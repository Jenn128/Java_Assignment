package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToHalloweenFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter halloweenWrite = new FileWriter("Halloween.txt");
		    halloweenWrite.write("Halloween is celebrated on the 31st of OCtober every year."
		    		+ "It is a spooky season where children dress up in costumes and go 'trick or treating'"
		    		+ "door to door. People give trick or treaters fruit and candy");
		    halloweenWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
	    	System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
