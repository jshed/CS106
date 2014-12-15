import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Organize {
	public void organize() throws FileNotFoundException {
		
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		int numLines = 0;
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numLines++;
		
		}
		
		Song[] songs = new Song[numLines];
		
		String song;
		String artist;
		String album;
		String genre;
		int year;
		
		
		PrintStream fileWriter = new PrintStream(new File("src/Rock.txt"));
		do {
			String line = fileReader.nextLine();
			Scanner input = new Scanner (line);
			
			if (line.contains("Rock") && line.contains("1970") || line.contains("1971") || line.contains("1972") || line.contains("1973") || line.contains("1974") || line.contains("1975") || line.contains("1976") || line.contains("1977") || line.contains("1978") || line.contains("1979")) {
				fileWriter.println(line);
				input.next();
			}
			
		} while (fileReader.hasNextLine());
		
		fileReader.close();
		fileWriter.close();
	}
}
