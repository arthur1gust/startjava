public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 28;

		if (age > 20) {
			System.out.println ("Vam bolshe 20 let");
		}

		boolean gender = true;
		
		if (gender) {
			System.out.println ("You are man!");
		} else if (gender = false) {
			System.out.println ("You are woman!");
		}

		double height = 2;

		if (height < 1.80) {
			System.out.println ("You are short");
		} else if (height >= 1.80) {
			System.out.println ("You are tall!");
		}

		String firstNameLetter = "M";

		if (firstNameLetter == "M") {
			System.out.println ("Your name M...");
		} else if (firstNameLetter == "I") {
			System.out.println ("Your name I...");
		} else {
			System.out.println ("Your name ...");
		}
	}
}