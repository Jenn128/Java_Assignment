package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToNewYearFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter newYearWrite = new FileWriter("NewYear.txt");
		    newYearWrite.write("The New Year is the time or day at which a new calendar year begins and the calendar's "
		    		+ "year count increments by one. Many cultures celebrate the event in some manner.[1] In the Gregorian"
		    		+ " calendar, the most widely used calendar system today, New Year occurs on January 1 (New Year's Day,"
		    		+ " preceded by New Year's Eve). This was also the first day of the year in the original Julian calendar"
		    		+ " and the Roman calendar (after 153 BC)."
		    		+ "\r\n"
		    		+ "Other cultures observe their traditional or religious New Year's Day according to their own customs,"
		    		+ " typically (though not invariably) because they use a lunar calendar or a lunisolar calendar. Chinese"
		    		+ " New Year, the Islamic New Year, Tamil New Year (Puthandu), and the Jewish New Year are among well-known"
		    		+ " examples. India, Nepal, and other countries also celebrate New Year on dates according to their own"
		    		+ " calendars that are movable in the Gregorian calendar.\r\n"
		    		+ "\r\n"
		    		+ "During the Middle Ages in Western Europe, while the Julian calendar was still in use, authorities moved"
		    		+ " New Year's Day, depending upon locale, to one of several other days, including March 1, March 25, Easter"
		    		+ ", September 1, and December 25. Since then, many national civil calendars in the Western World and beyond "
		    		+ "have changed to using one fixed date for New Year's Day, January 1—most doing so when they adopted the Gregorian"
		    		+ " calendar.");
		    newYearWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
		    System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
