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
	private JTextField second_inputField;



	private JPanel panel;
	private JLabel Task_Label;
	private JLabel Result_Label;
	private JLabel Second_Result_Label;
	private JLabel Third_Result_Label;
	private JLabel Fourth_Result_Label;
	private JLabel Second_Task_Label;
	private JLabel Third_Task_Label;
	private JButton yesButton;
	private JButton noButton;
	private JLabel instruction_Label;
	
	
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
        second_inputField = new JTextField(20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 11;
        panel.add(inputField, c);
        getSecond_inputField().setVisible(false);
        Task_Label = new JLabel("Please enter a term to be searched:"); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        panel.add(Task_Label, c);
        Result_Label = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(Result_Label, c);
        Second_Result_Label = new JLabel(""); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        panel.add(Second_Result_Label, c);
        Third_Result_Label = new JLabel("");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        panel.add(Third_Result_Label, c);
        Fourth_Result_Label = new JLabel("");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        panel.add(Fourth_Result_Label, c);
        yesButton = new JButton("Yes");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 8;
        panel.add(yesButton, c);
        yesButton.setVisible(false); // Initially hidden
        noButton = new JButton("No");
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 9;
        panel.add(noButton, c);
        noButton.setVisible(false); // Initially hidden
        Second_Task_Label = new JLabel("Would you like any other words to be searched beside this one:"); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 7;
        panel.add(Second_Task_Label, c);
        Second_Task_Label.setVisible(false); 
        instruction_Label = new JLabel("please enter the term you would like to search with the first word"); 
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 10;
        panel.add(instruction_Label, c);
        instruction_Label.setVisible(false); /// Initially hidden
       
   
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

	public JTextField getSecond_inputField() {
		return second_inputField;
	}

	public void setSecond_inputField(JTextField second_inputField) {
		this.second_inputField = second_inputField;
	}
	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getTask_Label() {
		return Task_Label;
	}

	public void setTask_Label(JLabel task_Label) {
		Task_Label = task_Label;
	}

	public JLabel getInstruction_Label() {
		return instruction_Label;
	}

	public void setInstruction_Label(JLabel instruction_Label) {
		this.instruction_Label = instruction_Label;
	}

	public JLabel getResult_Label() {
		return Result_Label;
	}

	public void setResult_Label(JLabel result_Label) {
		Result_Label = result_Label;
	}

	public JLabel getSecond_Result_Label() {
		return Second_Result_Label;
	}

	public void setSecond_Result_Label(JLabel second_Result_Label) {
		Second_Result_Label = second_Result_Label;
	}

	public JLabel getThird_Result_Label() {
		return Third_Result_Label;
	}

	public void setThird_Result_Label(JLabel third_Result_Label) {
		Third_Result_Label = third_Result_Label;
	}

	public JLabel getFourth_Result_Label() {
		return Fourth_Result_Label;
	}

	public void setFourth_Result_Label(JLabel fourth_Result_Label) {
		Fourth_Result_Label = fourth_Result_Label;
	}

	public JLabel getSecond_Task_Label() {
		return Second_Task_Label;
	}

	public void setSecond_Task_Label(JLabel second_Task_Label) {
		Second_Task_Label = second_Task_Label;
	}

	public JLabel getThird_Task_Label() {
		return Third_Task_Label;
	}

	public void setThird_Task_Label(JLabel third_Task_Label) {
		Third_Task_Label = third_Task_Label;
	}

	public JButton getYesButton() {
		return yesButton;
	}

	public void setYesButton(JButton yesButton) {
		this.yesButton = yesButton;
	}

	public JButton getNoButton() {
		return noButton;
	}

	public void setNoButton(JButton noButton) {
		this.noButton = noButton;
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

