import java.util.*;

public class TipCalculator2 {
	/* this program allows the user to input their own bill and calculate what tip they should give
	 * the user adds the bill amount as well as their desired percentage for gratuity
	 * then the program calculates the tip amount and the total bill
	 */
	public static void main(String[] arg) {
		Scanner console = new Scanner(System.in);
		System.out.println("Total Bill: ");
		double total = console.nextDouble(); 
		System.out.println("Tip Percent: ");
		double tipPercent = console.nextDouble();
		double totalBill = Calculate(total, tipPercent);
		System.out.println(totalBill);
	}
	
	public static double Calculate(double total, double tipPercent) {
		double totalBill = total*tipPercent;
		return totalBill;
		
	}

}
