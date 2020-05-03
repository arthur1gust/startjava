public class Calculator {
		int a;
		int b;
		String sign;

	switch (sign) {
		case "+":
			System.out.println(a + b);
		break;
		case "-":
			System.out.println(a - b);
		break;
		case "*":
			System.out.println(a * b);
		break;
		case "/":
			System.out.println((float) a / b);
		break;
		case "^":
			int result = 1;
			for (int i = 1; i <= b; i++) {
				result *= a;
			}
			System.out.println(result);
		break;
		case "%":
			System.out.println(a % b);
		break;
		default:
			System.out.println("Введите другую операцию");
	}
}