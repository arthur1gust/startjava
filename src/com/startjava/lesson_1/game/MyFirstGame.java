public class MyFirstGame {
	public static void main(String[] args) {
		int numberComputer = 36;

		for (int numberPlayer = 1; numberPlayer <= 100; numberPlayer++) {
			int sum = numberPlayer - numberComputer;
			if (sum == 0) {
				System.out.println("Вы угадали!");
			} else if (sum < 0) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			}
		}
	}
}