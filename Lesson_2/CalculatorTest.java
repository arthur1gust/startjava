import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator clc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vvedite pervoe chislo: ");
		clc.setA(scan.nextInt());

		System.out.print("Vvedite pervoe chislo: ");
		clc.setB(scan.nextInt());

		System.out.print("Vvedite operator: ");
		char sign = scan.next().charAt(0);
	}
}