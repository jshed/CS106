import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * @author Jordan
 *
 */
public class ProjectFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner (new File("src/input.txt"));
		double checking = 0.0;
		double creditCard = 0.0;
		double savings = 0.0;
		do {
			String line = fileReader.nextLine();
			Scanner input = new Scanner (line);
			if (line.contains("Checking") && (line.contains("Opening Balance") || line.contains("Deposit"))) {
			while (input.hasNext() && !input.hasNextDouble()) {
				input.next();
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
		} while (fileReader.hasNextLine());
		
		System.out.println("Checking: $" + checking);
		System.out.println("Savings: $" + savings);
		System.out.println("Credit Card: $" + creditCard);
		
		fileReader.close();
		
		PrintStream fileWriter = new PrintStream(new File("src/output.txt"));
		fileWriter.println("Checking: $" + checking);
		fileWriter.println("Savings: $" + savings);
		fileWriter.println( "Credit Card: $" + creditCard);
		fileWriter.close();

		// TODO Auto-generated method stub	
	}
}
