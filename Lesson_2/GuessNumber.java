import java.util.Scanner;

public class GuessNumber {
	Player playerFirst = new Player("Ivan", 4);
	Player playerSecond = new Player("Vasya", 14);

	public int random() {
		int numberComputer;
		numberComputer = (int) (Math.random() * 10);
		return numberComputer;
	}

	public String nameFirst() {
		String nameFirst = playerFirst.getName();
		return "First player name: " + nameFirst;
	}

	public String nameSecond() {
		String nameSecond = playerSecond.getName();
		return "Second player name: " + playerSecond;
	}

	public String chekNumber() {
		System.out.println(nameFirst());
		System.out.println(nameSecond());
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