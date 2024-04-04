package javaAssignment;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        
        
        layout.setHorizontalGroup
        (
        	layout.createSequentialGroup()
        	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        	.addComponent(Task_Label)
        	.addComponent(inputField)
        	.addComponent(Result_Label))
        );
        
        layout.setVerticalGroup
        (
        	layout.createSequentialGroup()
        	.addComponent(Task_Label)
        	.addComponent(inputField)
        	.addComponent(Result_Label)
        );
        
        inputField.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String userInput = inputField.getText(); 

               
                String result = result_of_UserInput(userInput);

                
                Result_Label.setText(result);
            }
        });

        frame.getContentPane().add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

   

    public static String result_of_UserInput(String userInput) {
       
        return "You entered: " + userInput;
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

