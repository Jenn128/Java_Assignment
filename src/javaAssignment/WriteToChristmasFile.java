package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToChristmasFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter christmasWrite = new FileWriter("Christmas.txt");
		    christmasWrite.write("Christmas is an annual festival commemorating the birth of Jesus Christ, observed primarily on "
		    		+ "December 25 as a religious and cultural celebration among billions of people around the world. "
		    		+ "A feast central to the liturgical year in Christianity, it follows the season of Advent (which begins four "
		    		+ "Sundays before) or the Nativity Fast, and initiates the season of Christmastide, which historically in the "
		    		+ "West lasts twelve days and culminates on Twelfth Night. Christmas Day is a public holiday in many countries,"
		    		+ " is celebrated religiously by a majority of Christians, as well as culturally by many non-Christians,"
		    		+ " and forms an integral part of the holiday season surrounding it.\r\n"
		    		+ "\r\n"
		    		+ "The traditional Christmas narrative recounted in the New Testament, known as the Nativity of Jesus, "
		    		+ "says that Jesus was born in Bethlehem, in accordance with messianic prophecies.[11] When Joseph and Mary "
		    		+ "arrived in the city, the inn had no room, and so they were offered a stable where the Christ Child "
		    		+ "was soon born, with angels proclaiming this news to shepherds, who then spread the word.\r\n"
		    		+ "\r\n"
		    		+ "There are different hypotheses regarding the date of Jesus's birth, and in the early fourth century, "
		    		+ "the church fixed the date as December 25. This corresponds to the traditional date of "
		    		+ "the winter solstice on the Roman calendar. It is exactly nine months after Annunciation on March 25, "
		    		+ "also the date of the spring equinox. Most Christians celebrate on December 25 in the Gregorian calendar, "
		    		+ "which has been adopted almost universally in the civil calendars used in countries throughout the world. "
		    		+ "However, part of the Eastern Christian Churches celebrate Christmas on December 25 of the older Julian calendar, "
		    		+ "which currently corresponds to January 7 in the Gregorian calendar. For Christians, believing that God came into "
		    		+ "the world in the form of man to atone for the sins of humanity rather than knowing Jesus's exact birth date "
		    		+ "is considered to be the primary purpose of celebrating Christmas.\r\n"
		    		+ "\r\n"
		    		+ "The customs associated with Christmas in various countries have a mix of pre-Christian, Christian, "
		    		+ "and secular themes and origins. Popular holiday traditions include gift giving; completing "
		    		+ "an Advent calendar or Advent wreath; Christmas music and caroling; watching Christmas movies; viewing "
		    		+ "a Nativity play; an exchange of Christmas cards; attending church services; a special meal; and "
		    		+ "displaying various Christmas decorations, including Christmas trees, Christmas lights, nativity scenes, "
		    		+ "garlands, wreaths, mistletoe, and holly. Additionally, several related and often interchangeable figures, "
		    		+ "known as Santa Claus, Father Christmas, Saint Nicholas, and Christkind, are associated with bringing gifts "
		    		+ "to children during the Christmas season and have their own body of traditions and lore. Because gift-giving "
		    		+ "and many other aspects of the Christmas festival involve heightened economic activity, the holiday has become a "
		    		+ "significant event and a key sales period for retailers and businesses. Over the past few centuries, Christmas has "
		    		+ "had a steadily growing economic effect in many regions of the world. ");
		    christmasWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
	    	System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
