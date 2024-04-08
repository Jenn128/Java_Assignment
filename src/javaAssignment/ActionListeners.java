package javaAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ActionListeners extends GUI
{
	private String userInput;
	
	public String getUserInput() {
		return userInput;
	}



	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}



	public ActionListeners() 
	{
		getInputField().addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
            	userInput = getInputField().getText();
            	
            	getSecond_Task_Label().setVisible(true);
            	getYesButton().setVisible(true);
            	getNoButton().setVisible(true);
            }
        
        });
		
		getNoButton().addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
            	
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
                
         
                JLabel[] Labels = {getResult_Label(), getSecond_Result_Label(), getThird_Result_Label(), getFourth_Result_Label()};
                
                String[] order = {"First", "Second", "Third", "Fourth"};
                
                for (int i = 0; i < values.length; i++) 
                {
                    Labels[i].setText("The word " + userInput + " was found " + values[i] + " time(s) in the " + order[i] + " text file");
                }
                
                getYesButton().setVisible(false);
                getNoButton().setVisible(false);
                getSecond_Task_Label().setVisible(false);
            }
        
        });
	}

	

	public static void main(String[] args) 
{
	// TODO Auto-generated method stub
		new ActionListeners();
}
}
