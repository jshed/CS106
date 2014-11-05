/**
 * This program uses additional classes to analyze a file containing information in a used car lot
 * @author Jordan Shedrofsky
 */

import java.util.*;
import java.io.*;

public class ProjectFive {
	
	/**
	 * 
	 * @param args Arguments passed to Car and Analysis classes
	 * @throws FileNotFoundException
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
	 
		/* Call additional class "Analysis" to do analysis on file*/
		Analysis analysis = new Analysis();
		analysis.organize();
	}
}