package javaAssignment;

import java.io.File;
import java.io.IOException;

public class CreateChristmasFile {
	public static void main(String[] args) {
	    try {
	      File christmas = new File("Christmas.txt");
	      if (christmas.createNewFile()) {
	        System.out.println("File created: " + christmas.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred." + e.getMessage());
	    }
	  }
}
