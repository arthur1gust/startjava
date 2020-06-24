import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GuessNumber gn = new GuessNumber();

		Player playerFirst = new Player(scan.nextLine(), scan.nextInt());
		Player playerSecond = new Player(scan.nextLine(), scan.nextInt());

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