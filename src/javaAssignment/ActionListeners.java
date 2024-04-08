package javaAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ActionListeners extends GUI
{
	private String userInput;
	private String second_userInput;
	
	
	public String getUserInput() 
	{
		return userInput;
	}



	public void setUserInput(String userInput) 
	{
		this.userInput = userInput;
	}

	

	public String getSecond_userInput() {
		return second_userInput;
	}



	public void setSecond_userInput(String second_userInput) {
		this.second_userInput = second_userInput;
	}


	public ActionListeners() 
	{
		getInputField().addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
            	userInput = getInputField().getText();
            	
            	getTask_Label().setVisible(false);
            	getSecond_Task_Label().setVisible(true);
            	getYesButton().setVisible(true);
            	getNoButton().setVisible(true);
            }
        
        });
		
		getSecond_inputField().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				second_userInput = getSecond_inputField().getText();
				
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
            
            int result_2 = Search_Christmas(second_userInput);
            
            //Result_Label.setText("The word " + userInput + " was found " + String.valueOf(result) + " time(s) in the Christmas text file" );
            
            int second_result_2 = Search_Easter(second_userInput);
            
            //Second_Result_Label.setText("The word " + userInput + " was found " + String.valueOf(second_result) + " time(s) in the Easter text file");
            
            int third_result_2 = Search_NewYear(second_userInput);
            
            //Third_Result_Label.setText("The word " + userInput + " was found " + String.valueOf(third_result) + " time(s) in the New Year text file");
            
            int fourth_result_2 = Search_Halloween(second_userInput);
            
            //\Fourth_Result_Label.setText("The word " + userInput + " was found " + String.valueOf(fourth_result) + " time(s) in the Halloween text file");
           
            int[] values_2 = {result_2, second_result_2, third_result_2, fourth_result_2};
        	
            for (int i = 0; i < values_2.length - 1; i++) {
                for (int j = 0; j < values_2.length - i - 1; j++) {
                    if (values[j] < values_2[j + 1]) {
                        // Swap values[j] and values[j + 1]
                        int temp = values_2[j];
                        values_2[j] = values_2[j + 1];
                        values_2[j + 1] = temp;
                    }
                }
            }
            
     
            JLabel[] Labels_2 = {getResult_Label(), getSecond_Result_Label(), getThird_Result_Label(), getFourth_Result_Label()};
            
            String[] order_2 = {"First", "Second", "Third", "Fourth"};
            
            for (int i = 0; i < values_2.length; i++) 
            {
                Labels_2[i].setText("The words " +  getUserInput() + getSecond_userInput() + " were found " + values[i] + " time(s) in the " + order_2[i] + " text file");
            }
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
                
                getTask_Label().setVisible(true);
                getYesButton().setVisible(false);
                getNoButton().setVisible(false);
                getSecond_Task_Label().setVisible(false);
            }
        
        });
		
		getYesButton().addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	 getResult_Label().setVisible(false);
                 getSecond_Result_Label().setVisible(false);
                 getThird_Result_Label().setVisible(false);
                 getFourth_Result_Label().setVisible(false);

            	getInstruction_Label().setVisible(true);
            	
            	getSecond_inputField().setVisible(true);
            };
        
       });
	
	}
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			new ActionListeners();
		}
}
	


