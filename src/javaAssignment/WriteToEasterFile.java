package javaAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToEasterFile 
{
	public static void main(String[] args) 
	{
	    try 
	    {
	    	FileWriter easterWrite = new FileWriter("Easter.txt");
		    easterWrite.write("Easter,[nb 1] also called Pascha (Aramaic, Greek, Latin) or Resurrection Sunday, is "
		    		+ "a Christian festival and cultural holiday commemorating the resurrection of Jesus from the dead, described "
		    		+ "in the New Testament as having occurred on the third day of his burial following his crucifixion by the Romans "
		    		+ "at Calvary c. 30 AD.[10][11] It is the culmination of the Passion of Jesus Christ, preceded by Lent (or Great Lent), "
		    		+ "a 40-day period of fasting, prayer, and penance.\r\n"
		    		+ "\r\n"
		    		+ "Easter-observing Christians commonly refer to the week before Easter as Holy Week, which in Western Christianity begins"
		    		+ " on Palm Sunday (marking the entrance of Jesus in Jerusalem), includes Spy Wednesday (on which the betrayal of Jesus is"
		    		+ " mourned),and contains the days of the Easter Triduum including Maundy Thursday, commemorating the Maundy and "
		    		+ "Last Supper, as well as Good Friday, commemorating the crucifixion and death of Jesus. In Eastern "
		    		+ "Christianity, the same events are commemorated with the names of days all starting with \"Holy\" or \"Holy and "
		    		+ "Great\", and Easter itself might be called \"Great and Holy Pascha\". In Western Christianity, Eastertide, or "
		    		+ "the Easter Season, begins on Easter Sunday and lasts seven weeks, ending with the coming of the 50th day, Pentecost "
		    		+ "Sunday. In Eastern Christianity, the Paschal season ends with Pentecost as well, but the leave-taking of the Great "
		    		+ "Feast of Pascha is on the 39th day, the day before the Feast of the Ascension.\r\n"
		    		+ "\r\n"
		    		+ "Easter and its related holidays are moveable feasts, not falling on a fixed date; its date is computed based on a "
		    		+ "lunisolar calendar (solar year plus Moon phase) similar to the Hebrew calendar. The First Council of Nicaea (325) "
		    		+ "established only two rules, namely independence from the Hebrew calendar and worldwide uniformity. No details for "
		    		+ "the computation were specified; these were worked out in practice, a process that took centuries and generated a "
		    		+ "number of controversies. It has come to be the first Sunday after the ecclesiastical full moon that occurs on or soonest"
		    		+ " after 21 March. Even if calculated on the basis of the Gregorian calendar, the date of that full moon sometimes "
		    		+ "differs from that of the astronomical first full moon after the March equinox.\r\n"
		    		+ "\r\n"
		    		+ "The English term is derived from the Saxon spring festival Ēostre; Easter is linked to the Jewish Passover by its "
		    		+ "name (Hebrew: פֶּסַח pesach, Aramaic: פָּסחָא pascha are the basis of the term Pascha), by its origin (according to the "
		    		+ "synoptic Gospels, both the crucifixion and the resurrection took place during the week of Passover) and by much "
		    		+ "of its symbolism, as well as by its position in the calendar. In most European languages, both the Christian Easter "
		    		+ "and the Jewish Passover are called by the same name; and in the older English versions of the Bible, as well, the term"
		    		+ " Easter was used to translate Passover.\r\n"
		    		+ "\r\n"
		    		+ "Easter traditions vary across the Christian world, and include sunrise services or late-night vigils, exclamations "
		    		+ "and exchanges of Paschal greetings, flowering the cross, the wearing of Easter bonnets by women, clipping the "
		    		+ "church, and the decoration and the communal breaking of Easter eggs (a symbol of the empty tomb). "
		    		+ "The Easter lily, a symbol of the resurrection in Western Christianity, traditionally decorates the chancel "
		    		+ "area of churches on this day and for the rest of Eastertide.[29] Additional customs that have become associated with "
		    		+ "Easter and are observed by both Christians and some non-Christians include Easter parades, communal dancing (Eastern "
		    		+ "Europe), the Easter Bunny and egg hunting. There are also traditional Easter foods that vary by "
		    		+ "region and culture.");
		    easterWrite.close();
		    System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) 
	    {
	    	System.out.println("An error occurred." + e.getMessage());
	    }
	}
}
