public class Cycle {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}

		int sum = 0;
		int i = 9;
		do {
			if (i % 2 != 0) {
				i = i + 2;
				sum += i;
			} else {
				sum = 0;
			}
		} while(i < 19);
		System.out.println(sum);

		int k = 6;
		while (k > -7) {
			System.out.println(k + " ");
			k -= 2;
		}
	}
}