import java.util.Random;

public class GuessNumber {
	int numberComputer;

	public int getNumberComputer() {
		return numberComputer;
	}

	public void setNumberComputer(int numberComputer) {
		numberComputer = (int) (Math.random() * 10);
		this.numberComputer = numberComputer;
	}
}