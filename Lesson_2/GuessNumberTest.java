import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Player playerFirst = new Player();
		Player playerSecond = new Player();
		int r1;
		int r2;
		int sum1;
		int sum2;
		
		do {
			System.out.print("Enter name first player: ");
			playerFirst.setName(scan.nextLine());
			System.out.print("Enter name second player: ");
			playerSecond.setName(scan.nextLine());
			
			System.out.print("Enter first number: ");
			playerFirst.setNumber(scan.nextInt());
			System.out.print("Enter second number: ");
			playerSecond.setNumber(scan.nextInt());
	
			r1 = playerFirst.getNumber();
			r2 = playerSecond.getNumber();
	
			int a = (int) (Math.random() * 100);
			System.out.println(a);
	
			sum1 = a - r1;
			sum2 = a - r2;
	
			System.out.println(sum1);
			System.out.println(sum2);
		} while (sum1 != 0 && sum2 != 0);
	}
}