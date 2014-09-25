import java.util.*;

/**
 * 
 */

/**
 * @author Jordan
 *
 */
public class WhichBreakingBadCharacterAreYou {

	/** This program allows the user to learn which Breaking Bad character their personality represents
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int walterWhite = 0;
		int skylerWhite = 0;
		int hankSchrader = 0;
		int jessePinkman = 0;
		Scanner console = new Scanner(System.in);
		System.out.println("Which Breaking Bad Character Are You?");
		System.out.println("Do you think of yourself as a very important person?");
		String answer1 = console.nextLine();
		if (answer1.equals("yes")) {
			walterWhite+=2;
			skylerWhite++;
			hankSchrader--;
			jessePinkman--;
			
		} else if (answer1.equals("no")) {
			walterWhite-=2;
			skylerWhite--;
			hankSchrader++;
			jessePinkman++;
		}	
		System.out.println("Do you find that you put yourself before others?");
		String answer2 = console.nextLine();
		if (answer2.equals("yes")) {
			walterWhite--;
			skylerWhite++;
			hankSchrader++;
			jessePinkman+=2;
		} else if (answer2.equals("no")) {
			walterWhite++;
			skylerWhite--;
			hankSchrader--;
			jessePinkman-=2;
		}
		System.out.println("Do you give up easily on your goals?");
		String answer3 = console.nextLine();
		if (answer3.equals("yes")) {
			walterWhite--;
			skylerWhite++;
			hankSchrader+=2;
			jessePinkman--;
		} else if (answer3.equals("no")) {
			walterWhite++;
			skylerWhite--;
			hankSchrader-=2;
			jessePinkman++;
		}
		System.out.println("Do you find that you are easily stressed?");
		String answer4 = console.nextLine();
		if (answer4.equals("yes")) {
			walterWhite++;
			skylerWhite+=2;
			hankSchrader--;
			jessePinkman++;
		} else if (answer4.equals("no")) {
			walterWhite--;
			skylerWhite-=2;
			hankSchrader++;
			jessePinkman--;
		}
		calculate(walterWhite, skylerWhite, hankSchrader, jessePinkman);
	}
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
		// TODO Auto-generated method stub


}