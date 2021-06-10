import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        
        String playerAnswer = "";

        do {
            System.out.print("Enter first number: ");
            calc.setA(scan.nextInt());

            System.out.print("Enter second number: ");
            calc.setB(scan.nextInt());

            System.out.print("Enter operation: ");
            calc.setSign(scan.next().charAt(0));

            System.out.println(calc.calculate());

            System.out.print("Will you want continue? [yes/no]: ");
            scan.nextLine();

            while (!scan.hasNext("yes") && !scan.hasNext("no")) {
                System.out.print("Will you want continue? [yes/no]: ");
                playerAnswer = scan.nextLine();
                if (playerAnswer.equals("yes") || playerAnswer.equals("no")) {
                    break;
                } else {
                    System.out.print("Enter correct value: ");
                }
            }
        } while (scan.nextLine().equalsIgnoreCase("yes"));
    }
}