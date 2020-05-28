import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Player playerFirst = new Player();
		Player playerSecond = new Player();
		GuessNumber randomNumber = new GuessNumber();

		int random;

		do {
			random = randomNumber.random();
			System.out.println("A computer guess number: " + random);

			System.out.println(randomNumber.nameFirst());
			System.out.println(randomNumber.nameSecond());
			System.out.println(randomNumber.chekNumberFirst());
			System.out.println(randomNumber.chekNumberSecond());

			System.out.print("Will you want continue? [yes/no]: ");
			scan.nextLine();

			while (!scan.hasNext("yes") && !scan.hasNext("no")) {
				System.out.print("Will you want continue? [yes/no]: ");
				scan.nextLine();
			}
		} while (scan.nextLine().equalsIgnoreCase("yes"));
	}
}