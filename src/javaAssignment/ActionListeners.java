package javaAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ActionListeners extends GUI
{
	private String userInput;

	public String getUserInput() 
	{
		return userInput;
	}



	public void setUserInput(String userInput) 
	{
		this.userInput = userInput;
	}

	public ActionListeners() 
	{
		getInputField().addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
            	userInput = getInputField().getText();
            	
            
				int result = searchChristmas(userInput);
	          
	            int secondResult = searchEaster(userInput);
	            
	            int thirdResult = searchNewYear(userInput);
 
	            int fourthResult = searchHalloween(userInput);
	           
	            int[] values = {result, secondResult, thirdResult, fourthResult};
	        	
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
	            
	            int[] valuesWildcard = {getChristmasCounter(), getEasterCounter(), getNewYearCounter(), getHalloweenCounter()};
	            
	            for (int i = 0; i < valuesWildcard.length - 1; i++) {
	                for (int j = 0; j < valuesWildcard.length - i - 1; j++) {
	                    if (valuesWildcard[j] < valuesWildcard[j + 1]) {
	                        // Swap values[j] and values[j + 1]
	                        int temp = valuesWildcard[j];
	                        valuesWildcard[j] = valuesWildcard[j + 1];
	                        valuesWildcard[j + 1] = temp;
	                    }
	                }
	            }
	            
	            
	            
	            JLabel[] Labels = {getFirstFileResult(), getSecondFileResult(), getThirdFileResult(), getFourthFileResult()};
	            
	            JLabel[] Labels_2 = {getFirstWildcardResult(), getSecondWildcardResult(), getThirdWildcardResult(), getFourthWildcardResult() };
	            
	            
	            String[] order = {"First", "Second", "Third", "Fourth"};
	            
	            for (int i = 0; i < values.length; i++) 
	            {
	                Labels[i].setText("The word " +  getUserInput() +  " was found " + values[i] + " time(s) in the " + order[i] + " text file");
	            }
	            
	            if(userInput.contains("*"))
            	{
	            	for(int i = 0; i < valuesWildcard.length; i++)
	            	{
	            		Labels_2[i].setText("The word: " + getwithoutWildcard() + " was found in " + valuesWildcard[i] + " different word(s) in the " + order[i] + " text file");
	            	}
            	}
            }
        
        });
		
	}

		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			new ActionListeners();
		}
}
	


