import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		calc.setA(scan.nextInt());

		System.out.print("Enter second number: ");
		calc.setB(scan.nextInt());

		System.out.print("Enter operation: ");
		calc.setSign(scan.next().charAt(0));
	}
}