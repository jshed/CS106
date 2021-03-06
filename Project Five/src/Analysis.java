import java.util.*;
import java.io.*;

public class Analysis {
	public void organize() throws FileNotFoundException {
		/* Scanner that reads the input file and keeps track of number of lines in file */
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		int numLines = 0;
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numLines++;

		}
		fileReader.close();
		
		/* Creates array of object Car */
		Car[] cars = new Car[numLines];

		/* Creates variable counter to track number of cars in analysis */
		int counter = 0;

		int i = 0;
		
		/* Creates variables for specs of each car */
		int year;
		String make;
		int mileage;

		fileReader = new Scanner(new File("src/input.txt"));
		
		/* Loops through file, line by line */
		while (fileReader.hasNextLine()) {
			
			/* Lets program know first Int represents year, following String is make, following Int is mileage */
			year = fileReader.nextInt();
			make = fileReader.next();
			mileage = fileReader.nextInt();

			cars[i] = new Car(year, make, mileage);
			i++;

		}
		fileReader.close();
		
		
		/* Performs analysis on file
		 * Count how many cars in lot as new as 2005 with over 75,000 miles on it
		 */
		for (int j = 0; j < numLines; j++) {
			if (cars[j].year >= 2005) {
				if (cars[j].mileage >= 75000) {
					counter++;

				}
			}
		}
		/* Prints analysis into console */
		System.out.println("Cars as new as 2005 with over 75,000 miles: "
				+ counter + " cars");
	}
}