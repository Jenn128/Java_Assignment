package javaAssignment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class GUI extends JFrame 
{
	//Frame to set up the GUI
	private JFrame frame;
	
	//Text Field for the user to enter the term to be searched
	private JTextField inputField;
	
	//Panel to organize components of GUI
	private JPanel panel;
	
	//Label to tell user to enter a term to be searched
	private JLabel searchLabel;
	
	//Labels to display results of searching the four files
	private static JLabel firstFileResult;
	private static JLabel secondFileResult;
	private static JLabel thirdFileResult;
	private static JLabel fourthFileResult;
	
	//Labels to display the results of searching for wildcard in files
	private static JLabel firstWildcardResult;
	private static JLabel secondWildcardResult;
	private static JLabel thirdWildcardResult;
	private static JLabel fourthWildcardResult;
	
	//Counters to record how many wildcard's there are in each file
	private static int christmasCounter;
	private static int easterCounter;
	private static int newYearCounter;
	private static int halloweenCounter;
	
	//Variable to store the user input that doesn't contain the *
	private static String withoutWildcard;
	

    public GUI() 
    {
    	//Set up frame with a title 
    	frame = new JFrame("Search Engine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up panel with GridBagLayout
        panel = new JPanel();
        
        //I used https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html to understand the format of GridBagLayout
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraint = new GridBagConstraints();
        
        //Making components fill their display area horizontally
		boolean shouldFill = true;
		if (shouldFill) 
		{
	        //natural height, maximum width
	        constraint.fill = GridBagConstraints.HORIZONTAL;
        
		}
 
		//Set up Text field for user input and added the Text field to the panel
        inputField = new JTextField(20);
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 6;
        panel.add(inputField, constraint);
        
        //Added searchLabel to panel
        searchLabel = new JLabel("Please enter a term to be searched:"); 
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 5;
        panel.add(searchLabel, constraint);
        
        //added firstFielResult to the panel
        firstFileResult = new JLabel(""); 
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 1;
        panel.add(firstFileResult, constraint);
        
        //added secondFileResult to the panel
        secondFileResult = new JLabel(""); 
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 2;
        panel.add(secondFileResult, constraint);
        
        //added thirdFielResult to the panel
        thirdFileResult = new JLabel("");
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 3;
        panel.add(thirdFileResult, constraint);
        
        //added fourthFileResult to the panel
        fourthFileResult = new JLabel("");
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 4;
        panel.add(fourthFileResult, constraint);
        
        //added firstWildcardresult to the panel
        firstWildcardResult = new JLabel(""); 
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 7;
        panel.add(firstWildcardResult, constraint);
        
        //added secondWildcardResult to the panel
        secondWildcardResult = new JLabel(""); 
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 8;
        panel.add(secondWildcardResult, constraint);
        
        //added thirdWildcardResult to the panel
        thirdWildcardResult = new JLabel(""); 
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 9;
        panel.add(thirdWildcardResult, constraint);
        
        //added fourthWildcardResult to the panel
        fourthWildcardResult = new JLabel(""); 
        constraint.weightx = 0.5;
        constraint.gridx = 0;
        constraint.gridy = 10;
        panel.add(fourthWildcardResult, constraint);
        
        //Added the panel onto the frame 
        //Set the frame size and make it visible
        frame.getContentPane().add(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
        
        
    }
    
   
	//Getter and setter methods for retrieving and setting the JTextfield object
	public JTextField getInputField() {
		return inputField;
	}

	public void setInputField(JTextField inputField) {
		this.inputField = inputField;
	}
	
	//Getter and setter for methods for retrieving and setting the String 
	//that contains the user input without the *
	public static String getwithoutWildcard() {
		return withoutWildcard;
	}

	public static void setwithoutWildcard(String withoutWildcard) {
		GUI.withoutWildcard = withoutWildcard;
	}

	//Getter and setter methods for retrieving and setting the search label
	public JLabel getSearchLabel() {
		return searchLabel;
	}

	public void setSearchLabel(JLabel searchLabel) {
		this.searchLabel = searchLabel;
	}

	//Getter and setter methods for retrieving and setting the firstFileResult label
	public static JLabel getFirstFileResult() {
		return firstFileResult;
	}

	public static void setFirstFileResult(JLabel firstFileResult) {
		GUI.firstFileResult = firstFileResult;
	}

	//Getter and setter methods for retrieving and setting the secondFileResult label
	public static JLabel getSecondFileResult() {
		return secondFileResult;
	}

	public static void setSecondFileResult(JLabel secondFileResult) {
		GUI.secondFileResult = secondFileResult;
	}

	//Getter and setter methods for retrieving and setting the thirdFileResult label
	public static JLabel getThirdFileResult() {
		return thirdFileResult;
	}

	public static void setThirdFileResult(JLabel thirdFileResult) {
		GUI.thirdFileResult = thirdFileResult;
	}

	//Getter and setter methods for retrieving and setting the fourthFileResult label
	public static JLabel getFourthFileResult() {
		return fourthFileResult;
	}

	public static void setFourthFileResult(JLabel fourthFileResult) {
		GUI.fourthFileResult = fourthFileResult;
	}

	//Getter and setter methods for retrieving and setting the firstWildcardResult label
	public static JLabel getFirstWildcardResult() {
		return firstWildcardResult;
	}

	public static void setFirstWildcardResult(JLabel firstWildcardResult) {
		GUI.firstWildcardResult = firstWildcardResult;
	}

	//Getter and setter methods for retrieving and setting the secondWildcardResult label
	public static JLabel getSecondWildcardResult() {
		return secondWildcardResult;
	}

	public static void setSecondWildcardResult(JLabel secondWildcardResult) {
		GUI.secondWildcardResult = secondWildcardResult;
	}

	//Getter and setter methods for retrieving and setting the thirdWildcardResult label
	public static JLabel getThirdWildcardResult() {
		return thirdWildcardResult;
	}

	public static void setThirdWildcardResult(JLabel thirdWildcardResult) {
		GUI.thirdWildcardResult = thirdWildcardResult;
	}

	//Getter and setter methods for retrieving and setting the fourthWildcardResult label
	public static JLabel getFourthWildcardResult() {
		return fourthWildcardResult;
	}

	public static void setFourthWildcardResult(JLabel fourthWildcardResult) {
		GUI.fourthWildcardResult = fourthWildcardResult;
	}

	//Getter and setter methods for retrieving and setting the christmasCounter variable
	public static int getChristmasCounter() {
		return christmasCounter;
	}

	public static void setChristmasCounter(int christmasCounter) {
		GUI.christmasCounter = christmasCounter;
	}

	//Getter and setter methods for retrieving and setting the easterCounter variable
	public static int getEasterCounter() {
		return easterCounter;
	}

	public static void setEasterCounter(int easterCounter) {
		GUI.easterCounter = easterCounter;
	}

	//Getter and setter methods for retrieving and setting the newYearCounter variable
	public static int getNewYearCounter() {
		return newYearCounter;
	}
	
	public static void setNewYearCounter(int newYearCounter) {
		GUI.newYearCounter = newYearCounter;
	}

	//Getter and setter methods for retrieving and setting the halloweenCounter variable
	public static int getHalloweenCounter() {
		return halloweenCounter;
	}

	public static void setHalloweenCounter(int halloweenCounter) {
		GUI.halloweenCounter = halloweenCounter;
	}

	//Getter and setter methods for retrieving and setting the variable 
	//that stores the user input that doesn't contain the *
	public static String getWithoutWildcard() {
		return withoutWildcard;
	}

	public static void setWithoutWildcard(String withoutWildcard) {
		GUI.withoutWildcard = withoutWildcard;
	}

	//Function that searches through the file named "Christmas.txt
	public static int searchChristmas(String userInput) 
    {
		//Initialize the variables counter and a file called firstFile
        int counter = 0;
        File firstFile = new File("Christmas.txt");

        //Initialize the Scanner for reading the Christmas.txt file
        Scanner christmasScanner = null;
        try 
        {
        	christmasScanner = new Scanner(firstFile);
        	
        	//Iterate through each word in the file until there
        	//is no longer another token in the file
            while (christmasScanner.hasNext()) 
            {
                String word = christmasScanner.next();
                
                //if statement is carried out if the user input contains a *                if(userInput.contains("*"))
            	{
                	//Hides labels that shows user input when wild card is not applied
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	//Displays labels that shows user input when wild card is applied
                	getFirstWildcardResult().setVisible(true);
                	getSecondWildcardResult().setVisible(true);
                	getThirdWildcardResult().setVisible(true);
                	getFourthWildcardResult().setVisible(true);
                	
                	//Removes * from user input
                	withoutWildcard = userInput.replace("*", "");
                	
                	//checks if each word in the file is the same as the user input with the *
            		if (word.contains(withoutWildcard))
                    {
            			//Prints each word that was a match to standard output
            			System.out.println(word);
            			
            			//Increments christmasCounter by one
            			//to display how many matched there were overall
            			christmasCounter++;
                    }
            	}
                
                //if the word in the file matched the user input counter is incremented
                //to display how matches there were overall
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        
        //Error message displayed if an error occurs
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred." + e.getMessage());
        }
        
        //Returns the total number of matches with the user input
        return counter;
    }
    
	//Function that searches through the file named "Easter.txt
    public static int searchEaster(String userInput) 
    {
    	//Initialize the variables counter and a file called secondFile
    	int counter = 0;
        File secondFile = new File("Easter.txt");

      //Initialize the Scanner for reading the Easter.txt file
        Scanner easterScanner = null;
        try 
        {
        	easterScanner = new Scanner(secondFile);
        	
        	//Iterate through each word in the file until there
        	//is no longer another token in the file
            while (easterScanner.hasNext()) 
            {
                String word = easterScanner.next();
                
              //if statement is carried out if the user input contains a *
                if(userInput.contains("*"))
            	{
                	//Hides labels that shows user input when wild card is not applied
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	//Displays labels that shows user input when wild card is applied
                	getFirstWildcardResult().setVisible(true);
                	getSecondWildcardResult().setVisible(true);
                	getThirdWildcardResult().setVisible(true);
                	getFourthWildcardResult().setVisible(true);
                	
                	
                	//Removes * from user input
                	withoutWildcard = userInput.replace("*", "");
                	
                	//checks if each word in the file is 
                	//the same as the user input with the *
            		if (word.contains(withoutWildcard))
                    {
            			//Prints each word that was a match to standard output
            			System.out.println(word);
            			
            			//Increments easterCounter by one
            			//to display how many matched there were overall
            			easterCounter++;
                    }

            	}
                
              //if the word in the file matched 
               //the user input counter is incremented
              //to display how matches there were overall
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        
      //Error message displayed if an error occurs
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred." + e.getMessage());
        }
        
      //Returns the total number of matches with the user input
        return counter;
    }
    
  //Function that searches through the file named "NewYear.txt
    public static int searchNewYear(String userInput) 
    {
    	//Initialize the variables counter and a file called thirdFile
    	int counter = 0;
        File thirdFile = new File("NewYear.txt");

      //Initialize the Scanner for reading the NewYear.txt file
        Scanner newYearScanner = null;
        try 
        {
        	newYearScanner = new Scanner(thirdFile);
        	
        	//Iterate through each word in the file until there
        	//is no longer another token in the file
            while (newYearScanner.hasNext()) 
            {
                String word = newYearScanner.next();
                
              //if statement is carried out if the user input contains a *
                if(userInput.contains("*"))
            	{
                	//Hides labels that shows user input when wild card is not applied
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	//Displays labels that shows user input when wild card is applied
                	getFirstWildcardResult().setVisible(true);
                	getSecondWildcardResult().setVisible(true);
                	getThirdWildcardResult().setVisible(true);
                	getFourthWildcardResult().setVisible(true);
                	
                	
                	//Removes * from user input
                	withoutWildcard = userInput.replace("*", "");
                	
                	//checks if each word in the file 
                	//is the same as the user input with the *
            		if (word.contains(withoutWildcard))
                    {
            			//Prints each word that was a match to standard output
            			System.out.println(word);
            			
            			//Increments newYearCounter by one
            			//to display how many matched there were overall

            			newYearCounter++;
                    }

            	}
                
              //if the word in the file matched the user input counter is incremented
                //to display how matches there were overall
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        
      //Error message displayed if an error occurs
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred." + e.getMessage());
        }
        
      //Returns the total number of matches with the user input
        return counter;
    }
   
  //Function that searches through the file named "Halloween.txt
    public static int searchHalloween(String userInput) 
    {
    	//Initialize the variables counter and a file called fourthFile
    	int counter = 0;
        File fourthFile = new File("Halloween.txt");

      //Initialize the Scanner for reading the Christmas.txt file
        Scanner halloweenScanner = null;
        try 
        {
        	halloweenScanner = new Scanner(fourthFile);
        	
        	//Iterate through each word in the file until there
        	//is no longer another token in the file
            while (halloweenScanner.hasNext()) 
            {
                String word = halloweenScanner.next();
                
              //if statement is carried out if the user input contains a *
                if(userInput.contains("*"))
            	{
                	//Hides labels that shows user input when wild card is not applied
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	//Displays labels that shows user input when wild card is applied
                	getFirstWildcardResult().setVisible(true);
                	getSecondWildcardResult().setVisible(true);
                	getThirdWildcardResult().setVisible(true);
                	getFourthWildcardResult().setVisible(true);
                	
                	
                	//Removes * from user input
                	withoutWildcard = userInput.replace("*", "");
                	
                	//checks if each word in the file is 
                	//the same as the user input with the *
            		if (word.contains(withoutWildcard))
                    {
            			//Prints each word that was a match to standard output
            			System.out.println(word);
            			
            			//Increments halloweenCounter by one
            			//to display how many matched there were overall
            			halloweenCounter++;
                    }
            	}
                
              //if the word in the file matched the user input counter is incremented
                //to display how matches there were overall
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        
      //Error message displayed if an error occurs
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred." + e.getMessage());
        }
        
      //Returns the total number of matches with the user input
        return counter;
    }

    //main method
    public static void main(String[] args) 
    {
      
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
            	//an instance of the GUI class is created 
            	//which starts the program
                new GUI();
            }
        });
    }
    
}

