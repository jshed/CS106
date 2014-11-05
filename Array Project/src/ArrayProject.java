import java.util.*;
import java.io.*;

public class ArrayProject {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner fileReader = new Scanner (new File("src/input.txt"));
		int numberOfLines = 0;
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			numberOfLines++;
		}
		fileReader.close();
		
		String[] dates = new String [numberOfLines];
		String[] accounts = new String [numberOfLines];
		String [] transactions = new String [numberOfLines];
		double [] amounts = new double [numberOfLines];
		
		int i = 0;
		fileReader = new Scanner(new File("src/input.txt"));
		while (fileReader.hasNext()) {
			
			dates [i] = fileReader.next();
			
			accounts [i] = fileReader.next();
			if (accounts [i].equals("Credit")) {
				accounts[i] = accounts[i] + " " + fileReader.next();
			}
			
			transactions[i] = fileReader.next();
			if (transactions[i].equals("Openning")) {
				transactions[i] = transactions[i] + " " + fileReader.next();
			}
			
			amounts [i] = fileReader.nextDouble();
			
			i++;	
		}
		fileReader.close();
		double checking = 0.0;
		double savings = 0.0;
		double credit = 0.0;
		for (i = 0; i < dates.length; i++) {
			if (accounts[i].equals("Checking")) {
				if (transactions[i].equals("Withdrawal")) {
					checking -= amounts[i];
				} else {
					checking += amounts[i];
				}
			} else if (accounts[i].equals("Savings")) {
				if (transactions[i].equals("Withdrawal")) {
					savings -= amounts[i];
				} else {
					savings += amounts[i];
				}
			} else {
				if (transactions[i].equals("Withdrawal")) {
					credit -= amounts[i];
				} else {
					credit += amounts [i];
				}
			}
		}
		System.out.println("Checking balance: $" + checking);
		System.out.println("Savings balance: $" + savings);
		System.out.println("Credit card balance: $" + credit);
	}
}