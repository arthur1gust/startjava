public class ConditionalStatement {	
    public static void main(String[] args) {
    	
    	int age = 28;
    	boolean gender = true;
    	double height = 2;
    	String firstWord = "M";

    	if (age > 20) { 
			System.out.println ("Vam bolshe 20 let");
		}

		if (gender) { 
			System.out.println ("You are man!");
		} else if (gender = false) {
			System.out.println ("You are woman!");
		}

		if (height < 1.80) { 
			System.out.println ("You are short");
		} else if (height >= 1.80) {
			System.out.println ("You are tall!");
		}

		if (firstWord == "M") { 
			System.out.println ("Your name M...");
		} else if (firstWord == "I") {
			System.out.println ("Your name I...");
		} else {
			System.out.println ("Your name ...");
		}
    }
}