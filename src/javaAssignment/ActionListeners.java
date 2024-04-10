package javaAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

//This class extends the GUI class 
//and includes the ActionListeners for the user input

public class ActionListeners extends GUI
{
	//varibale to store the user input
	private String userInput;

	//Getter and setter methods for retrieving and setting the user input
	public String getUserInput() 
	{
		return userInput;
	}
	
	public void setUserInput(String userInput) 
	{
		this.userInput = userInput;
	}

	//Constructor for action listener Class
	public ActionListeners() 
	{
		//Action Listener for the user input text field
		getInputField().addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	//Make labels visible for results of user input
            	getFirstFileResult().setVisible(true);
            	getSecondFileResult().setVisible(true);
            	getThirdFileResult().setVisible(true);
            	getFourthFileResult().setVisible(true);
            
            	//Hides labels that shows user input when wild card is applied
            	getFirstWildcardResult().setVisible(false);
            	getSecondWildcardResult().setVisible(false);
            	getThirdWildcardResult().setVisible(false);
            	getFourthWildcardResult().setVisible(false);
            	
            	//put the text from the input field into the userInput variable
            	userInput = getInputField().getText();
            	
            	//Calling each file searching method
				int result = searchChristmas(userInput);
	          
	            int secondResult = searchEaster(userInput);
	            
	            int thirdResult = searchNewYear(userInput);
 
	            int fourthResult = searchHalloween(userInput);
	           
	            //Sort the file search results in descending order
	            int[] values = {result, secondResult, thirdResult, fourthResult};
	        	
	            //Bubble sort algorithm in descending order
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
	            
	          //Update the result labels with the search results
	            JLabel[] Labels = {getFirstFileResult(), getSecondFileResult(), getThirdFileResult(), getFourthFileResult()};
	            
	            String[] order = {"First", "Second", "Third", "Fourth"};
	            
	            for (int i = 0; i < values.length; i++) 
	            {
	                Labels[i].setText("The word " +  getUserInput() +  " was found " + values[i] + " time(s) in the " + order[i] + " text file");
	            }
	            
	            if(userInput.contains("*"))
	            {
		            //Sort wildcard search results in descending order
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
		            
		            JLabel[] Labels_2 = {getFirstWildcardResult(), getSecondWildcardResult(), getThirdWildcardResult(), getFourthWildcardResult() };
		            
		            for(int i = 0; i < valuesWildcard.length; i++)
	            	{
	            		Labels_2[i].setText("The word: " + getwithoutWildcard() + " was found in " + valuesWildcard[i] + " different word(s) in the " + order[i] + " text file");
	            	}
		            
		            //the wildcard result labels are updated
		            for(int i = 0; i < valuesWildcard.length; i++)
	            	{
	            		Labels_2[i].setText("The word: " + getwithoutWildcard() + " was found in " + valuesWildcard[i] + " different word(s) in the " + order[i] + " text file");
	            	}
	            
	            }
            }
        
        });
		
	}
		
		//Main method
		public static void main(String[] args) 
		{
			//instance of ActionListeners
			new ActionListeners();
		}
}
	


