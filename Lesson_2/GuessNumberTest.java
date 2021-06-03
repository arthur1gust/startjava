import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first name player: ");
		Player playerFirst = new Player(scan.nextLine());
		System.out.println("Enter second name player: ");
		Player playerSecond = new Player(scan.nextLine());
		
		GuessNumber gn = new GuessNumber(playerFirst, playerSecond);

		do {
			System.out.println(gn.start());

			System.out.print("Will you want continue? [yes/no]: ");
			scan.nextLine();

			while (!scan.hasNext("yes") && !scan.hasNext("no")) {
				System.out.print("Will you want continue? [yes/no]: ");
				scan.nextLine();
			}
		} while (scan.nextLine().equalsIgnoreCase("yes"));
	}
}