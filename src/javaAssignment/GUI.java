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
	private JFrame frame;
	private JTextField inputField;
	private JPanel panel;
	private JLabel searchLabel;
	private static JLabel firstFileResult;
	private static JLabel secondFileResult;
	private static JLabel thirdFileResult;
	private static JLabel fourthFileResult;
	private static JLabel firstWildcardResult;
	private static JLabel secondWildcardResult;
	private static JLabel thirdWildcardResult;
	private static JLabel fourthWildcardResult;
	private static int christmasCounter;
	private static int easterCounter;
	private static int newYearCounter;
	private static int halloweenCounter;
	private static String withoutWildcard;
	

    public GUI() 
    {
    	frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
		boolean shouldFill = true;
		if (shouldFill) 
		{
	        //natural height, maximum width
	        c.fill = GridBagConstraints.HORIZONTAL;
        
		}
 
        inputField = new JTextField(20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 6;
        panel.add(inputField, c);
        searchLabel = new JLabel("Please enter a term to be searched:"); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        panel.add(searchLabel, c);
        firstFileResult = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(firstFileResult, c);
        secondFileResult = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        panel.add(secondFileResult, c);
        thirdFileResult = new JLabel("");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        panel.add(thirdFileResult, c);
        fourthFileResult = new JLabel("");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        panel.add(fourthFileResult, c);
        firstWildcardResult = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 7;
        panel.add(firstWildcardResult, c);
        secondWildcardResult = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 8;
        panel.add(secondWildcardResult, c);
        thirdWildcardResult = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 9;
        panel.add(thirdWildcardResult, c);
        fourthWildcardResult = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 10;
        panel.add(fourthWildcardResult, c);
        
        
        frame.getContentPane().add(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
        
        
    }
     
    public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getInputField() {
		return inputField;
	}

	public void setInputField(JTextField inputField) {
		this.inputField = inputField;
	}

	
	

	public static String getwithoutWildcard() {
		return withoutWildcard;
	}

	public static void setwithoutWildcard(String withoutWildcard) {
		GUI.withoutWildcard = withoutWildcard;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getSearchLabel() {
		return searchLabel;
	}

	public void setSearchLabel(JLabel searchLabel) {
		this.searchLabel = searchLabel;
	}

	public static JLabel getFirstFileResult() {
		return firstFileResult;
	}

	public static void setFirstFileResult(JLabel firstFileResult) {
		GUI.firstFileResult = firstFileResult;
	}

	public static JLabel getSecondFileResult() {
		return secondFileResult;
	}

	public static void setSecondFileResult(JLabel secondFileResult) {
		GUI.secondFileResult = secondFileResult;
	}

	public static JLabel getThirdFileResult() {
		return thirdFileResult;
	}

	public static void setThirdFileResult(JLabel thirdFileResult) {
		GUI.thirdFileResult = thirdFileResult;
	}

	public static JLabel getFourthFileResult() {
		return fourthFileResult;
	}

	public static void setFourthFileResult(JLabel fourthFileResult) {
		GUI.fourthFileResult = fourthFileResult;
	}

	public static JLabel getFirstWildcardResult() {
		return firstWildcardResult;
	}

	public static void setFirstWildcardResult(JLabel firstWildcardResult) {
		GUI.firstWildcardResult = firstWildcardResult;
	}

	public static JLabel getSecondWildcardResult() {
		return secondWildcardResult;
	}

	public static void setSecondWildcardResult(JLabel secondWildcardResult) {
		GUI.secondWildcardResult = secondWildcardResult;
	}

	public static JLabel getThirdWildcardResult() {
		return thirdWildcardResult;
	}

	public static void setThirdWildcardResult(JLabel thirdWildcardResult) {
		GUI.thirdWildcardResult = thirdWildcardResult;
	}

	public static JLabel getFourthWildcardResult() {
		return fourthWildcardResult;
	}

	public static void setFourthWildcardResult(JLabel fourthWildcardResult) {
		GUI.fourthWildcardResult = fourthWildcardResult;
	}

	public static int getChristmasCounter() {
		return christmasCounter;
	}

	public static void setChristmasCounter(int christmasCounter) {
		GUI.christmasCounter = christmasCounter;
	}

	public static int getEasterCounter() {
		return easterCounter;
	}

	public static void setEasterCounter(int easterCounter) {
		GUI.easterCounter = easterCounter;
	}

	public static int getNewYearCounter() {
		return newYearCounter;
	}

	public static void setNewYearCounter(int newYearCounter) {
		GUI.newYearCounter = newYearCounter;
	}

	public static int getHalloweenCounter() {
		return halloweenCounter;
	}

	public static void setHalloweenCounter(int halloweenCounter) {
		GUI.halloweenCounter = halloweenCounter;
	}

	public static String getWithoutWildcard() {
		return withoutWildcard;
	}

	public static void setWithoutWildcard(String withoutWildcard) {
		GUI.withoutWildcard = withoutWildcard;
	}

	public static int searchChristmas(String userInput) 
    {
        int counter = 0;
        File firstFile = new File("Christmas.txt");

        Scanner christmasScanner = null;
        try 
        {
        	christmasScanner = new Scanner(firstFile);
            while (christmasScanner.hasNext()) 
            {
                String word = christmasScanner.next();
                                if(userInput.contains("*"))
            	{
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	String withoutWildcard = userInput.replace("*", "");
            		if (word.contains(withoutWildcard))
                    {
            			System.out.println(word);
            			christmasCounter++;
                    }
            	}
                
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            // Handle file not found exception
            System.out.println("An error occurred." + e.getMessage());
        }
        return counter;
    }
    
    public static int searchEaster(String userInput) 
    {
    	int counter = 0;
        File secondFile = new File("Easter.txt");

        Scanner easterScanner = null;
        try 
        {
        	easterScanner = new Scanner(secondFile);
            while (easterScanner.hasNext()) 
            {
                String word = easterScanner.next();
                
                if(userInput.contains("*"))
            	{
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	String withoutWildcard = userInput.replace("*", "");
            		if (word.contains(withoutWildcard))
                    {
            			System.out.println(word);
            			easterCounter++;
                    }

            	}
                
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            // Handle file not found exception
            System.out.println("An error occurred." + e.getMessage());
        }
        return counter;
    }
    
    public static int searchNewYear(String userInput) 
    {
    	int counter = 0;
        File thirdFile = new File("NewYear.txt");

        Scanner newYearScanner = null;
        try 
        {
        	newYearScanner = new Scanner(thirdFile);
            while (newYearScanner.hasNext()) 
            {
                String word = newYearScanner.next();
                
                if(userInput.contains("*"))
            	{
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	withoutWildcard = userInput.replace("*", "");
            		if (word.contains(withoutWildcard))
                    {
            			System.out.println(word);
            			newYearCounter++;
                    }

            	}
                
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            // Handle file not found exception
            System.out.println("An error occurred." + e.getMessage());
        }
        return counter;
    }
   
    public static int searchHalloween(String userInput) 
    {
    	int counter = 0;
        File fourthFile = new File("Halloween.txt");

        Scanner halloweenScanner = null;
        try 
        {
        	halloweenScanner = new Scanner(fourthFile);
            while (halloweenScanner.hasNext()) 
            {
                String word = halloweenScanner.next();
                
                if(userInput.contains("*"))
            	{
                	firstFileResult.setVisible(false);
                	secondFileResult.setVisible(false);
                	thirdFileResult.setVisible(false);
                	fourthFileResult.setVisible(false);
                	
                	String withoutWildcard = userInput.replace("*", "");
            		if (word.contains(withoutWildcard))
                    {
            			System.out.println(word);
            			halloweenCounter++;
                    }
            	}
                
                if (word.equals(userInput)) 
                {
                    counter++;
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            // Handle file not found exception
            System.out.println("An error occurred." + e.getMessage());
        }
        return counter;
    }

    
    public static void main(String[] args) 
    {
      
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new GUI();
            }
        });
    }
    
}

