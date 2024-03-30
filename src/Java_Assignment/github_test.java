package Java_Assignment;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class github_test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
       
 
        JTextField inputField = new JTextField(10);
        JLabel Task_Label = new JLabel("Please enter a term to be searched"); // Initialize with an empty string
        JLabel resultLabel = new JLabel(""); // Initialize with an empty string
        
        
        layout.setHorizontalGroup(
        		layout.createSequentialGroup()
        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addComponent(inputField)
        		.addComponent(Task_Label)
        		.addComponent(resultLabel))
        		);
        
        layout.setVerticalGroup(
        		layout.createSequentialGroup()
        		.addComponent(inputField)
        		.addComponent(Task_Label)
        		.addComponent(resultLabel)
        		);
        
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = inputField.getText(); // Get text from the input field

                // Call a method to process the input and get the result
                String result = processUserInput(userInput);

                // Update the label with the result
                resultLabel.setText(result);
            }
        });

        frame.getContentPane().add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    // Method to process user input
    public static String processUserInput(String userInput) {
        // Here you can have your logic to process the user input
        return "You entered: " + userInput;
    }
}
