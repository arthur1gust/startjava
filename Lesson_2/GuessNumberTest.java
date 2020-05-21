import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Player playerFirst = new Player();
		Player playerSecond = new Player();

		System.out.print("Enter name first player: ");
		playerFirst.setName(scan.nextLine());
		System.out.print("Enter name second player: ");
		playerSecond.setName(scan.nextLine());
		
		System.out.print("Enter first number: ");
		playerFirst.setNumber(scan.nextInt());
		System.out.print("Enter second number: ");
		playerSecond.setNumber(scan.nextInt());

		int a = (int) (Math.random() * 100 );
		System.out.println(a);
	}
}