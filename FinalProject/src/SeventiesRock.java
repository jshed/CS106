import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jordan
 * This class categorizes Rock songs from the 70s era of music
 */

public class SeventiesRock {
	public void list1() throws FileNotFoundException {
	
	/* Prepares class to read input.txt file containing playlist*/
	Scanner fileReader = new Scanner(new File("input.txt"));
	
	/* Ensures reader of console knows what genre is being categorized*/
	System.out.println(""
			+ "");
	
	System.out.println("70s Rock:");
	
	/* Loops through file looking for songs that contain information classifying them as Rock songs from the 70s*/
	do {
		String song = fileReader.nextLine();
		Scanner input = new Scanner (song);
		
		if (song.contains("Rock") && song.contains("1970") || song.contains("1971") || song.contains("1972") || song.contains("1973") || song.contains("1974") || song.contains("1975") || song.contains("1976") || song.contains("1977") || song.contains("1978") || song.contains("1979")) {
			input.next();
		
	/*If song contains information in question it is printed into the list*/
		System.out.println(song);
		}
	
	/* Loops until there are no songs left in the file */
	} while (fileReader.hasNextLine());
	
	fileReader.close();
	
	

}

}
