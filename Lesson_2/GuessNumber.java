import java.util.Scanner;

public class GuessNumber {

	Player playerFirst = new Player();
	Player playerSecond = new Player();
	Scanner scan = new Scanner(System.in);

	int numberComputer;
	int chekSumFirst;
	int chekSumSecond;
	int sumFirst;
	int sumSecond;

	int random() {
		numberComputer = (int) (Math.random() * 10);
		return numberComputer;
	}

	String nameFirst() {
		System.out.print("Enter name first player: ");
		playerFirst.setName(scan.nextLine());
		String nameFirst = playerFirst.getName();
		return "First player name: " + nameFirst;
	}

	String nameSecond() {
		System.out.print("Enter name second player: ");
		playerSecond.setName(scan.nextLine());
		String nameSecond = playerSecond.getName();
		return "Second player name: " + nameSecond;
	}

	int numberFirst() {
		System.out.print("Enter number first player: ");
		playerFirst.setNumber(scan.nextInt());
		int numberFirst = playerFirst.getNumber();
		return numberFirst;
	}

	int numberSecond() {
		System.out.print("Enter number second player: ");
		playerSecond.setNumber(scan.nextInt());
		int numberSecond = playerSecond.getNumber();
		return numberSecond;
	}

	int chekSumFirst() { 
		sumFirst = random() - numberFirst();
		//scan.nextLine();
		return sumFirst;
	}

	int chekSumSecond() { 
		sumSecond = random() - numberSecond();
		scan.nextLine();
		return sumSecond;
	}

	String chekNumberFirst() {
		int chek_1 = chekSumFirst();
		//scan.nextLine();
		String resultFirst;
		if (chek_1 == 0) {
			resultFirst = "First player won!";
		} else {
			resultFirst = "First player didn't win.";
		}
		return "First player result: " + resultFirst;
	}

	String chekNumberSecond() {
		int chek_2 = chekSumSecond();
		//scan.nextLine();
		String resultSecond;
		if (chek_2 == 0) {
			resultSecond = "Second player won!";
		} else {
			resultSecond = "Second player didn't win.";
		}
		return "Second player result: " + resultSecond;
	}
}
