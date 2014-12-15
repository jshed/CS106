import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jordan
 * This class categorizes Rock songs from the 60s era of music
 */

public class SixtiesRock {
	public void list() throws FileNotFoundException {
		
	/* Prepares class to read input.txt file containing playlist*/
	Scanner fileReader = new Scanner(new File("input.txt"));

	/* Ensures reader of console knows what genre is being categorized*/
	System.out.println("60s Rock:");
	
	/* Loops through file looking for songs that contain information classifying them as Rock songs from the 60s*/
	do {
		String song = fileReader.nextLine();
		Scanner input = new Scanner (song);
		
		if (song.contains("Rock") && song.contains("1960") || song.contains("1961") || song.contains("1962") || song.contains("1963") || song.contains("1964") || song.contains("1965") || song.contains("1966") || song.contains("1967") || song.contains("1968") || song.contains("1969")) {
			input.next();
	/*If song contains information in question it is printed into the list*/
		System.out.println(song);
		}
	/* Loops until there are no songs left in the file */
	} while (fileReader.hasNextLine());
	
	fileReader.close();
	}
	
}