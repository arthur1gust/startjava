public class Calculator {
		int a;
		int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static int calculate(int a,int b,char sign) {
		int output;
		switch (sign) {
			case '+':
				output = a + b;
			break;
			case '-':
				output = a - b;
			break;
			case '*':
				output = a * b;
			break;
			case '/':
				output = a / b;
			break;
			case '^':
				int result = 1;
				for (int i = 1; i <= b; i++) {
					result *= a;
				}
				output = result;
			break;
			case '%':
				output = a % b;
			break;
			default:
				System.out.println("Введите другую операцию");
				output = calculate(a, b, sign);
		}
		return output;
	}
}