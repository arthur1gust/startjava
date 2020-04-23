public class MyFirstGame {
	public static void main(String[] args) {
		int m = 36;

		for (int i = 1; i <= 100; i++) {
			int sum = i - m;
			boolean result = sum < 0;
			if (sum == 0) {
				System.out.println("Вы угадали!");
			} else if (result == true) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			}
		}
	}
}