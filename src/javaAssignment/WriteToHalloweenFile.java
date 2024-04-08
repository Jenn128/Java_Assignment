package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToHalloweenFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter halloweenWrite = new FileWriter("Halloween.txt");
		    halloweenWrite.write("Halloween or Hallowe'en (less commonly known as Allhalloween, All Hallows' Eve,"
		    		+ " or All Saints' Eve) is a celebration observed in many countries on 31 October, the eve of the "
		    		+ "Western Christian feast of All Hallows' Day. It is at the beginning of the observance of Allhallowtide,"
		    		+ " the time in the liturgical year dedicated to remembering the dead, including saints (hallows), martyrs, "
		    		+ "and all the faithful departed. In popular culture, the day has become a celebration of horror,"
		    		+ " being associated with the macabre and supernatural.\r\n"
		    		+ "\r\n"
		    		+ "One theory holds that many Halloween traditions were influenced by Celtic harvest festivals, particularly the"
		    		+ " Gaelic festival Samhain, which are believed to have pagan roots.Some go further and suggest "
		    		+ "that Samhain may have been Christianized as All Hallow's Day, along with its eve, by the early Church. Other"
		    		+ " academics believe Halloween began solely as a Christian holiday, being the vigil of All Hallow's Day."
		    		+ " Celebrated in Ireland and Scotland for centuries, Irish and Scottish immigrants took many Halloween "
		    		+ "customs to North America in the 19th century, and then through American influence various Halloween customs "
		    		+ "spread to other countries by the late 20th and early 21st century.\r\n"
		    		+ "\r\n"
		    		+ "Popular Halloween activities include trick-or-treating (or the related guising and souling), attending Halloween "
		    		+ "costume parties, carving pumpkins or turnips into jack-o'-lanterns, lighting bonfires, apple bobbing, divination "
		    		+ "games, playing pranks, visiting haunted attractions, telling scary stories, and watching horror or Halloween-themed"
		    		+ " films.Some people practice the Christian observances of All Hallows' Eve, including attending church services"
		    		+ " and lighting candles on the graves of the dead, although it is a secular celebration for others."
		    		+ " Some Christians historically abstained from meat on All Hallows' Eve, a tradition reflected in the eating "
		    		+ "of certain vegetarian foods on this vigil day, including apples, potato pancakes, and soul cakes.");
		    halloweenWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
	    	System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
