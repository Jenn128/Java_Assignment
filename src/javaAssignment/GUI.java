package javaAssignment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
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
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
       
 
        JTextField inputField = new JTextField(10);
        JLabel Task_Label = new JLabel("Please enter a term to be searched:"); 
        JLabel Result_Label = new JLabel(""); 
        JLabel Second_Result_Label = new JLabel(""); 
        JLabel Third_Result_Label = new JLabel("");
        JLabel Fourth_Result_Label = new JLabel("");
        
        
        
        
        layout.setHorizontalGroup
        (
        	layout.createSequentialGroup()
        	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        	.addComponent(Task_Label)
        	.addComponent(inputField)
        	.addComponent(Result_Label)
        	.addComponent(Second_Result_Label)
        	.addComponent(Third_Result_Label)
        	.addComponent(Fourth_Result_Label)
        	)
        );
        
        layout.setVerticalGroup
        (
        	layout.createSequentialGroup()
        	.addComponent(Task_Label)
        	.addComponent(inputField)
        	.addComponent(Result_Label)
        	.addComponent(Second_Result_Label)
        	.addComponent(Third_Result_Label)
        	.addComponent(Fourth_Result_Label)
        );
        
        inputField.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	String userInput = inputField.getText(); 
               
                //String result = result_of_UserInput(userInput);
              
            	int result = Search_Christmas(userInput);
                 
                Result_Label.setText(String.valueOf(result));
                
                int second_result = Search_Easter(userInput);
                
                Second_Result_Label.setText(String.valueOf(second_result));
                
                int third_result = Search_NewYear(userInput);
                
                Third_Result_Label.setText(String.valueOf(third_result));
                
                int fourth_result = Search_Halloween(userInput);
                
                Fourth_Result_Label.setText(String.valueOf(fourth_result));
                
                
            }
        });

        frame.getContentPane().add(panel);
        frame.setSize(400, 200);
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

