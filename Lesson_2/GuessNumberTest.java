import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Player playerFirst = new Player();
		Player playerSecond = new Player();
		int numberFirst;
		int numberSecond;
		int sumFirst;
		int sumSecond;
		int numberComputer;
		String answer;

		do {
			System.out.print("Enter name first player: ");
			playerFirst.setName(scan.nextLine());
			System.out.print("Enter name second player: ");
			playerSecond.setName(scan.nextLine());
			
			System.out.print("Enter first number: ");
			playerFirst.setNumber(scan.nextInt());
			System.out.print("Enter second number: ");
			playerSecond.setNumber(scan.nextInt());

			numberFirst = playerFirst.getNumber();
			numberSecond = playerSecond.getNumber();
	
			numberComputer = (int) (Math.random() * 2);
			System.out.println(numberComputer);
	
			sumFirst = numberComputer - numberFirst;
			sumSecond = numberComputer - numberSecond;
			
			if (sumFirst == 0) {
				System.out.println("First player won! ");
			} else if (sumSecond == 0) {
				System.out.println("Second player won! ");
			}

			System.out.print("Will you want continue? [yes/no]: ");
			scan.nextLine();

			while (!scan.hasNext("yes") && !scan.hasNext("no")) {
				System.out.print("Will you want continue? [yes/no]: ");
				scan.nextLine();
			}
		} while (scan.nextLine().equalsIgnoreCase("yes"));
	}
}