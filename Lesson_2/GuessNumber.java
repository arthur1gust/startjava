import java.util.Scanner;

public class GuessNumber {
	private int numberComputer;
	private Player playerFirst;
    private Player playerSecond;
	
	Scanner scan = new Scanner(System.in);
	GuessNumberTest gnt = new GuessNumberTest();
	
	public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }
/*
	private int random() {
		numberComputer = (int) (Math.random() * 10);
		return numberComputer;
	}
*/
	public void start() {
		numberComputer = (int) (Math.random() * 100);
		//int sumFirst = random() - gnt.playerFirst.getNumber();
		//int sumSecond = random() - gnt.playerSecond.getNumber();
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