import java.util.*;
import java.io.*;
import java.util.regex.*;

/* @author Jordan */
public class ArrayPractice {

	/*This program calculates the balances of three bank accounts */
	public static void main(String[] args) throws FileNotFoundException {
		/* This scanner reads the information from the file input.txt
		 * This file holds the information of the three bank accounts */
		Scanner fileReader = new Scanner (new File("src/input.txt"));
		/* Declares the three variables and sets them all at 0 */
		double checking = 0.0;
		double creditCard = 0.0;
		double savings = 0.0;
		/* Adds monetary information to the three different accounts
		 * Checks if each line holds certain information to decide which account is being affected
		 * Uses line.contains to check the information in each line */
		do {
			String line = fileReader.nextLine();
			Scanner input = new Scanner (line);
			/* Checks information from each line */
			if (line.contains("Checking") && (line.contains("Opening Balance") || line.contains("Deposit"))) {
			/* Ensures program adds information from the next double in the file, not from the next token */
			while (input.hasNext() && !input.hasNextDouble()) {
				input.next();
				/* Adds money to variable in question */
				} checking += input.nextDouble();
			} else if (line.contains("Savings") && (line.contains("Opening Balance") || line.contains("Deposit"))) {
			while (input.hasNext() && !input.hasNextDouble()) {
				input.next();
				} savings += input.nextDouble();
			} else if (line.contains("Credit Card") && (line.contains("Opening Balance") || line.contains("Deposit"))) {
			while (input.hasNext() && !input.hasNextDouble()) {
				input.next();
				} creditCard += input.nextDouble();
			} else if (line.contains("Checking") && line.contains("Withdrawal")) {
			while (input.hasNext() && !input.hasNextDouble()) {
				input.next();
				} checking -= input.nextDouble();
			} else if (line.contains("Savings") && line.contains("Withdrawal")) {
			while (input.hasNext() && !input.hasNextDouble()) {
				input.next();
				} savings -= input.nextDouble();
			} else if (line.contains("Credit Card") && line.contains("Withdrawal")) {
			while (input.hasNext() && !input.hasNextDouble()) {
				input.next();
				} creditCard -= input.nextDouble();
			}
		/* Loops until there is no next line in the file */
		} while (fileReader.hasNextLine());
		
		/* Prints the information for the final monetary values of the accounts */
		System.out.println("Checking: $" + checking);
		System.out.println("Savings: $" + savings);
		System.out.println("Credit Card: $" + creditCard);
		
		/*Closes file reader */
		fileReader.close();
		
		/* Creates a file writer that takes the information from the program in output.txt */
		PrintStream fileWriter = new PrintStream(new File("src/output.txt"));
		/* Sends information to output.txt file */
		fileWriter.println("Checking: $" + checking);
		fileWriter.println("Savings: $" + savings);
		fileWriter.println( "Credit Card: $" + creditCard);
		/* Closes file writer */
		fileWriter.close();
	}
}
