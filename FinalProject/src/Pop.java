import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jordan
 * This class categorizes Pop songs from the file
 */

public class Pop {
	public void list4() throws FileNotFoundException {
		
	/* Prepares class to read input.txt file containing playlist*/
	Scanner fileReader = new Scanner(new File("input.txt"));
	
	/* Ensures reader of console knows what genre is being categorized*/
	System.out.println(""
			+ "");
	
	System.out.println("Pop:");
	
	/* Loops through file looking for songs that contain information classifying them as Pop songs*/
	do {
		String song = fileReader.nextLine();
		Scanner input = new Scanner (song);
		
		if (song.contains("Pop")) {
			input.next();
			
	/*If song contains information in question it is printed into the list*/
		System.out.println(song);
		}
		
	/* Loops until there are no songs left in the file */
	} while (fileReader.hasNextLine());
	
	fileReader.close();
	}
	
}
