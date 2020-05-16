import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String yesAnswer = "yes";
		String answer;

		do {
		System.out.print("Will you want continue? [yes/no]: ");
		answer = scan.nextLine();

		System.out.print("Enter first number: ");
		calc.setA(scan.nextInt());

		System.out.print("Enter second number: ");
		calc.setB(scan.nextInt());

		System.out.print("Enter operation: ");
		calc.setSign(scan.next().charAt(0));

		System.out.println(calc.getResult());
		}
		while (answer.equalsIgnoreCase(yesAnswer));
	}
}