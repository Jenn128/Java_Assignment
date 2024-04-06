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
    public GUI() 
    {
    	JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
		boolean shouldFill = true;
		if (shouldFill) {
                        //natural height, maximum width
                        c.fill = GridBagConstraints.HORIZONTAL;
        }
       
 
        JTextField inputField = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        panel.add(inputField, c);
        JLabel Task_Label = new JLabel("Please enter a term to be searched:"); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(Task_Label, c);
        JLabel Result_Label = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        panel.add(Result_Label, c);
        JLabel Second_Result_Label = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        panel.add(Second_Result_Label, c);
        JLabel Third_Result_Label = new JLabel("");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        panel.add(Third_Result_Label, c);
        JLabel Fourth_Result_Label = new JLabel("");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 6;
        panel.add(Fourth_Result_Label, c);
     
        JLabel[] Labels = {Result_Label, Second_Result_Label, Third_Result_Label, Fourth_Result_Label};
        
        String[] order = {"First", "Second", "Third", "Fourth"};
        
        inputField.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
            	String userInput = inputField.getText(); 
               
                //String result = result_of_UserInput(userInput);
              
            	int result = Search_Christmas(userInput);
                 
                //Result_Label.setText("The word " + userInput + " was found " + String.valueOf(result) + " time(s) in the Christmas text file" );
                
                int second_result = Search_Easter(userInput);
                
                //Second_Result_Label.setText("The word " + userInput + " was found " + String.valueOf(second_result) + " time(s) in the Easter text file");
                
                int third_result = Search_NewYear(userInput);
                
                //Third_Result_Label.setText("The word " + userInput + " was found " + String.valueOf(third_result) + " time(s) in the New Year text file");
                
                int fourth_result = Search_Halloween(userInput);
                
                //\Fourth_Result_Label.setText("The word " + userInput + " was found " + String.valueOf(fourth_result) + " time(s) in the Halloween text file");
               
                int[] values = {result, second_result, third_result, fourth_result};
                
                for (int i = 0; i < values.length - 1; i++) {
                    for (int j = 0; j < values.length - i - 1; j++) {
                        if (values[j] < values[j + 1]) {
                            // Swap values[j] and values[j + 1]
                            int temp = values[j];
                            values[j] = values[j + 1];
                            values[j + 1] = temp;
                        }
                    }
                }
                
               
                
                for (int i = 0; i < values.length; i++) {
                    Labels[i].setText("The word " + userInput + " was found " + values[i] + " time(s) in the " + order[i] + " text file");
                }
                
                
                
                
            }
        });

        frame.getContentPane().add(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
    
    public static int Search_Christmas(String userInput) 
    {
        int counter = 0;
        File firstFile = new File("Christmas.txt");

        Scanner christmasScanner = null;
        try 
        {
        	christmasScanner = new Scanner(firstFile);
            while (christmasScanner.hasNext()) 
            {
                String Word = christmasScanner.next();
                if (Word.equals(userInput)) 
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
    
    public static int Search_Easter(String userInput) 
    {
        int counter = 0;
        File secondFile = new File("Easter.txt");

        Scanner easterScanner = null;
        try 
        {
        	easterScanner = new Scanner(secondFile);
            while (easterScanner.hasNext()) 
            {
                String Word = easterScanner.next();
                if (Word.equals(userInput)) 
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
    
    public static int Search_NewYear(String userInput) 
    {
        int counter = 0;
        File thirdFile = new File("NewYear.txt");

        Scanner newYearScanner = null;
        try 
        {
        	newYearScanner = new Scanner(thirdFile);
            while (newYearScanner.hasNext()) 
            {
                String Word = newYearScanner.next();
                if (Word.equals(userInput)) 
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
   
    public static int Search_Halloween(String userInput) 
    {
        int counter = 0;
        File fourthFile = new File("Halloween.txt");

        Scanner halloweenScanner = null;
        try 
        {
        	halloweenScanner = new Scanner(fourthFile);
            while (halloweenScanner.hasNext()) 
            {
                String Word = halloweenScanner.next();
                if (Word.equals(userInput)) 
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

