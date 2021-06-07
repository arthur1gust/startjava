import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String checkResponse = "";
		
		System.out.print("Enter first name player: ");
		Player playerFirst = new Player(scan.nextLine());
		System.out.print("Enter second name player: ");
		Player playerSecond = new Player(scan.nextLine());
		
		GuessNumber gn = new GuessNumber(playerFirst, playerSecond);
		
		do {
			gn.start();
			System.out.print("Will you want continue? [yes/no]: ");
			while (!scan.hasNext("yes") && !scan.hasNext("no")) {
				checkResponse = scan.nextLine();
				System.out.print("Will you want continue? [yes/no]: ");
				if (checkResponse.equals("yes") || checkResponse.equals("no")) {
                    break;
                } else {
                    System.out.print("Enter correct value: ");
                }
			}
		} while (scan.nextLine().equalsIgnoreCase("yes"));
	}
}