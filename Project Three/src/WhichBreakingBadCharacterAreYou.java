import java.util.Scanner;

public class WhichBreakingBadCharacterAreYou {

	/*This program tells the user which Breaking Bad character they most closely represent */
	
	public static void main(String[] args) {
		/* This method defines the variables used in the program */
		int walterWhite = 0;
		int skylerWhite = 0;
		int hankSchrader = 0;
		int jessePinkman = 0;
		/* This method sets up the user to apply input to the program */
		Scanner console = new Scanner(System.in);
		System.out.println("Which Breaking Bad Character Are You?");
		/* This statement asks the first question to see what character the user represents
		 * Each of the four questions correlates to one of the four characters more than the other three
		 * The first question is in extreme correlation to Walter White but is in close correlation to other characters as well
		 * The value of the variable with extreme correlation will go up by 3 or down by 3 depending on the user's answer
		 */
		System.out.println("Do you think of yourself as a very important person?");
		String answer1;
		/* Here the program ensures that the user adds valid input */
		do {
			System.out.println("Please enter 'yes' or 'no'");
			answer1 = console.nextLine();
		} while (!answer1.equalsIgnoreCase("yes")
			&& !answer1.equalsIgnoreCase("no"));
		if (answer1.equalsIgnoreCase("yes")) {
			walterWhite+=3;
			skylerWhite++;
			hankSchrader--;
			jessePinkman--;
			
		} else if (answer1.equalsIgnoreCase("no")) {
			walterWhite-=3;
			skylerWhite--;
			hankSchrader++;
			jessePinkman++;
		}	
		/* This statement asks the second question of the program
		 * It is in extreme correlation to the character Jesse Pinkman
		 */
		System.out.println("Do you find that you put yourself before others?");
		String answer2;
		do {
			System.out.println("Please enter 'yes' or 'no'");
			answer2 = console.nextLine();
		} while (!answer2.equalsIgnoreCase("yes")
			&& !answer2.equalsIgnoreCase("no"));
		if (answer2.equalsIgnoreCase("yes")) {
			walterWhite--;
			skylerWhite++;
			hankSchrader--;
			jessePinkman+=3;
		} else if (answer2.equalsIgnoreCase("no")) {
			walterWhite++;
			skylerWhite--;
			hankSchrader++;
			jessePinkman-=3;
		}
		/* This statement asks the third question of the program
		 * It is in extreme correlation to the character Hank Schrader
		 */
		System.out.println("Do you give up easily on your goals?");
		String answer3;
		do {
			System.out.println("Please enter 'yes' or 'no'");
			answer3 = console.nextLine();
		} while (!answer3.equalsIgnoreCase("yes")
			&& !answer3.equalsIgnoreCase("no"));
		if (answer3.equalsIgnoreCase("yes")) {
			walterWhite--;
			skylerWhite++;
			hankSchrader-=3;
			jessePinkman--;
		} else if (answer3.equalsIgnoreCase("no")) {
			walterWhite++;
			skylerWhite--;
			hankSchrader+=3;
			jessePinkman++;
		}
		/* This statement asks the fourth and final question of the program
		 * It is in extreme correlation to the character Skyler White
		 */
		System.out.println("Do you find that you are easily stressed?");
		String answer4;
		do {
			System.out.println("Please enter 'yes' or 'no'");
			answer4 = console.nextLine();
		} while (!answer4.equalsIgnoreCase("yes")
			&& !answer4.equalsIgnoreCase("no"));
		if (answer4.equalsIgnoreCase("yes")) {
			walterWhite--;
			skylerWhite+=3;
			hankSchrader++;
			jessePinkman++;
		} else if (answer4.equalsIgnoreCase("no")) {
			walterWhite++;
			skylerWhite-=3;
			hankSchrader--;
			jessePinkman--;
		}
		calculate(walterWhite, skylerWhite, hankSchrader, jessePinkman);
	}
	/* Here, a second method is made to calculate which character or variable received the highest score
	 * When the calculation is complete the program says "You are: " followed by the character that the user most closely represents
	 */
	public static void calculate(int walterWhite, int skylerWhite, int hankSchrader, int jessePinkman) {
		System.out.print("You are: ");
		if (walterWhite > skylerWhite && walterWhite > hankSchrader && walterWhite > jessePinkman) {
			System.out.println("Walter White");
		} else if (skylerWhite > walterWhite && skylerWhite > hankSchrader && skylerWhite > jessePinkman) {
			System.out.println("Skyler White");
		} else if (hankSchrader > walterWhite && hankSchrader > skylerWhite && hankSchrader > jessePinkman) {
			System.out.println("Hank Schrader");
		} else if (jessePinkman > walterWhite && jessePinkman > skylerWhite && jessePinkman > hankSchrader) {
			System.out.println("Jesse Pinkman");
		}
	}
}