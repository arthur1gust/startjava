public class Calculator {	
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		String sign = "+";

		if (sign == "+") {
			System.out.println(a + b);
		} else if (sign == "-") {
			System.out.println(a - b);
		} else if (sign == "*") {
			System.out.println(a * b);
		} else if (sign == "/") {
			System.out.println((float) a / b);
		} else if (sign == "^") {
			int result = 1;
			for (int i = 1; i <= b; i++) {
				result *= a;
			}
			System.out.println(result);
		} else if (sign == "%") {
			System.out.println(a % b);
		} else {
			System.out.println("Введите другую операцию");
		}
	}
}