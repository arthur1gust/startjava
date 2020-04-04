public class MyFirstGame {
	public static void main(String[] args) {
		int m = 36;
		if (m > 50) {
			System.out.println("Vvedenoe vami chislo bolshe togo, chto zagadal computer");
		} else if (m < 30) {
			System.out.println("Vvedenoe vami chislo menshe togo, chto zagadal computer");
		} else if (m >= 37 && m <= 50) {
			System.out.println("Vvedenoe vami chislo bolshe togo, chto zagadal computer");
		} else if (m >= 30 && m <= 35) {
			System.out.println("Vvedenoe vami chislo menshe togo, chto zagadal computer");
		} else {
			System.out.println("Vy ugadali");
		}
	}
}