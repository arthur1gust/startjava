public class Calculator {	
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char ch = 43;

		if (ch == 43) {
			System.out.println(a + b); // сложение
		} else if (ch == 45) {
			System.out.println(a - b); // вычитание
		} else if (ch == 8277) {
			System.out.println(a * b); // умножение
		} else if (ch == 47) {
			System.out.println((float)a/b); // деление
		} else if (ch == 94) {
			int result = 1;
			for (int i = 1; i <= b; i++){
				result = result*a;
				}
			System.out.println(result); // возведение в степень
		} else if (ch == 37) {
			System.out.println(a % b); // остаток от деления
		}
		else {
			System.out.println("Введите другую операцию");
		}
	}
}