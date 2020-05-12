import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator clc = new Calculator(); // создание объекта
		Scanner scan = new Scanner(System.in); // Объявление сканера
		
		
		System.out.print("Vvedite pervoe chislo: ");
		clc.setA(scan.nextInt());

		System.out.print("Vvedite operator: ");
		char operator = scan.next().charAt(0);

		System.out.print("Vvedite pervoe chislo: ");
		clc.setB(scan.nextInt());
	}
}