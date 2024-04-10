# Java_Assignment

For this project, I chose the 'My Search Engine' project.

Classes:

GUI Class:
In my GUI class, I set up the GUI frame with GridBagLayout. I made the attributes private and used getter and setter methods to access them in the ActionListeners class. There are four functions in this class to search the four different text files. In each function, there is a Scanner for reading through the text file. I used a while loop to iterate through each word in the text file and compare it to the user input. Each time there is a match with the user input and a word in the text file I incremented a variable called counter. I then returned the value in counter when the functions are called in the ActionListeners class. The results of searching through the four files are then added to four different labels on the GUI. If the user input contains a *, the if statement in each of the functions that search the text files first puts the user input with the * removed into a variable and then compares the user input without the * with each word in the text file and a counter is incremented if there is a match. Each counter is then used in the ActionListeners class and is accessed by the getter methods for each of the counters. 

ActionListeners Class:
In the action listener class, there is an ActionListener method for the text field. The response from the text field is put into a variable called userInput. The four functions that search through the text files are then called and each counter variable which is returned from each file is put into a results variable. The four results are then put into an array and I used bubble sort to out the array in descending order. This enabled the top match to be shown at the top of the list as the biggest number would be the first number and so on. The four labels which display these results are then updated. If the user input contains a *, all words in the text file which contain that word are displayed to standard output and the number of words which contain the user input for each file are displayed on the GUi, in four seperate labels.

Core Functionality:
In my search engine, you are able to search for a single word across a set of text files. The user is asked to type a term to be searched into the text field. Once the user presses enter, four labels appear with the results of how many words matched the users input for each of the four files.

Optional Functionality:
The user is also able to use the wildcard *. If the user input contains *, the search functions count each word that contains the user input and displays each of these words to standard output. Four labels are also displayed on the GUi of how many words contained the user input word for each of the four files. The strongest match is also returned first, at the top of the list with each of the four labels being displayed in descending order.

If I had more time:
If I had more time, I would allow the user to search for multiple words together as a single word.
