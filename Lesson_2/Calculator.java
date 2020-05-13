public class Calculator {
		int a;
		int b;
		String sign;
//		char sign;
		double output;

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

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public void calculate() {
		switch (sign) {
			case "+":
				//System.out.println(a + b);
				output = a + b;
			break;
			case "-":
				//System.out.println(a - b);
				output = a - b;
			break;
			case "*":
				//System.out.println(a * b);
				output = a * b;
			break;
			case "/":
				//System.out.println((float) a / b);
				output = a / b;
			break;
			case "^":
				int result = 1;
				for (int i = 1; i <= b; i++) {
					result *= a;
				}
				//System.out.println(result);
				output = result;
			break;
			case "%":
				//System.out.println(a % b);
				output = a % b;
			break;
			default:
				System.out.println("Введите другую операцию");
				
		}
		System.out.println(a+" "+sign+" "+b+": "+output);
	}
}