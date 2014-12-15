/**
 * This program organizes a music playlist by seperating each song into different lists that correspond to their specific genre
 * @author Jordan Shedrofsky
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class FinalMain {

/**
 * @param args Arguments passed to classes of 6 different genres
 * @throws FileNotFoundException
 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		SixtiesRock list = new SixtiesRock();
		list.list();
		
		SeventiesRock list1 = new SeventiesRock();
		list1.list1();
		
		EightiesRock list2 = new EightiesRock();
		list2.list2();
		
		Alternative list3 = new Alternative();
		list3.list3();
		
		Pop list4 = new Pop();
		list4.list4();
		
		ModernRock list5 = new ModernRock();
		list5.list5();

	}
	
}


