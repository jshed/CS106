import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jordan
 * This class categorizes Rock songs from the 80s era of music
 */

public class EightiesRock {
	public void list2() throws FileNotFoundException {
		
	/* Prepares class to read input.txt file containing playlist*/	
	Scanner fileReader = new Scanner(new File("input.txt"));
	
	/* Ensures reader of console knows what genre is being categorized*/
	System.out.println(""
			+ "");
	System.out.println("80s Rock:");
	
	/* Loops through file looking for songs that contain information classifying them as Rock songs from the 80s*/
	do {
		String song = fileReader.nextLine();
		Scanner input = new Scanner (song);
		
		if (song.contains("Rock") && song.contains("1980") || song.contains("1981") || song.contains("1982") || song.contains("1983") || song.contains("1984") || song.contains("1985") || song.contains("1986") || song.contains("1987") || song.contains("1988") || song.contains("1989")) {
			input.next();
		
	/*If song contains information in question it is printed into the list*/
		System.out.println(song);
		}
		
	/* Loops until there are no songs left in the file */
	} while (fileReader.hasNextLine());
	
	fileReader.close();
	
	}
}
