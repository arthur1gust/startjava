import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator clc = new Calculator(); // создание объекта
		Scanner scan = new Scanner(System.in); // Объявление сканера
		
		
		System.out.print("Vvedite pervoe chislo: ");
		clc.setA(scan.nextInt());

		System.out.print("Vvedite znak matematicheskoy operacii: ");
		clc.setSign(scan.nextLine());

		System.out.print("Vvedite pervoe chislo: ");
		clc.setB(scan.nextInt());
		
/*
		System.out.print("Vvedite chislo from 1 to 10: ");
		
		int a = scan.nextInt();
		System.out.print("Vvedite 2-oe chislo from 1 to 10: ");
		int b = scan.nextInt();
		System.out.println ("Vy vveli chislo " + a + ", 2-oe chislo: " + b); */
	}
}