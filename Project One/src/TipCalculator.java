
public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* this program calculates the tip of a bill at a restaurant
		 * the bill received was a cumulation of three Italian dishes
		 * the bill amounted to $30.00
		 * I used an average tip percentage of 15%
		 * this calculated a tip of $4.50 and a total bill of $34.50
		 */
		double chickenParm = 7.50;
		double largePizza = 15.00;
		double penneVodka = 7.50;
		double bill = chickenParm+largePizza+penneVodka;
		System.out.println("Chicken parm: $7.50");
		System.out.println("Large pepperoni pizza: $15.00");
		System.out.println("Penne a la Vodka: $7.50");
		System.out.print("Bill: ");
		System.out.print("$");
		System.out.print(bill);
		System.out.println("0");
		double tipPercent = .15;
		System.out.println("Recommended Gratuity: 15%");
		System.out.print("Tip Given: ");
		System.out.print("$");
		System.out.print(bill*tipPercent);
		System.out.println("0");
		double tipAmount = bill*tipPercent;
		System.out.print("Total Bill: ");
		System.out.print("$");
		double totalBill = tipAmount+bill;
		System.out.print(totalBill);
		System.out.println("0");
		System.out.println("Thank You and Have a Great Day");
	}
	
	public static void TipCalculator() {
		
		
	}

}



