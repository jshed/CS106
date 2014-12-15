import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

public class ProblemFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String line1;
		line1 = console.nextLine();
		String line2;
		line2 = console.nextLine();
		String line3;
		line3 = console.nextLine();
		String line4;
		line4 = console.nextLine();
		String line5;
		line5 = console.nextLine();
		String line6;
		line6 = console.nextLine();
		
		if (line1.contains("Nemo")) {
			System.out.println("Found");	
		}
		
		if (line2.contains("nemo")) {
			System.out.println("Found");
		}
		
		if(!line3.contains("Nemo")) {
			System.out.println("Missing");
		}
		if(!line4.contains("Nemo")) {
			System.out.println("Missing");
		}
		if(line5.contains("NEMO")) {
			System.out.println("Found");
		}
	}
}
