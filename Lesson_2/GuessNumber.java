import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	int numberComputer;
	Scanner scan = new Scanner(System.in);

	System.out.println("Bayan: ");
	int number = scan.nextInt();
	System.out.println("Bayan " + number);

	public int getNumberComputer() {
		return numberComputer;
	}

	public void setNumberComputer(int numberComputer) {
		numberComputer = (int) (Math.random() * 10);
		this.numberComputer = numberComputer;
	}
}