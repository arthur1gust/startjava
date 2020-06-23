import java.util.Scanner;

public class GuessNumber {
	String nameFirst;
	String nameSecond;
	int numberFirst;
	int numberSecond;
	Scanner scan = new Scanner(System.in);
	GuessNumberTest gnt = new GuessNumberTest();

	public int random() {
		int numberComputer;
		numberComputer = (int) (Math.random() * 10);
		return numberComputer;
	}

	public String changeNameFirst() {
		nameFirst = scan.nextLine();
		System.out.print("Enter first name");
		return nameFirst;
	}

	public String changeNameSecond() {
		nameSecond = scan.nextLine();
		System.out.print("Enter second name");
		return nameSecond;
	}

	public int changeNumberFirst() {
		numberFirst = scan.nextInt();
		System.out.print("Enter first number");
		return numberFirst;
	}

	public int changeNumberSecond() {
		numberSecond = scan.nextInt();
		System.out.print("Enter second number");
		return numberSecond;
	}

	Player playerFirst = new Player(changeNameFirst(), changeNumberFirst());
	Player playerSecond = new Player(changeNameSecond(), changeNumberSecond());

	public String start() {
		System.out.println(changeNameFirst());
		System.out.println(changeNameSecond());
		int sumFirst = random() - playerFirst.getNumber();
		int sumSecond = random() - playerSecond.getNumber();
		String resultFirst;
		if (sumFirst == 0) {
			resultFirst = "First player won!";
		} else if (sumSecond == 0) {
			resultFirst = "Second player won!";
		} else {
			resultFirst = "No winner.";
		}
		return resultFirst;
	}
}