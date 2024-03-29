package Java_Assignment;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class GUI extends JFrame 
{


    public GUI() 
    {
        // Create button
        JButton button1 = new JButton("Please enter a term to search");



        // Layout for button
        setLayout(new FlowLayout());
        add(button1);
       

        // The frame
        setTitle("GUI Search Bar");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        // Run the application
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

