public class Calculator {	
    public static void main(String[] args) {
    	int number_1 = 3;
    	int number_2 = 6;

    	double sum = number_1 + number_2;
    	double subtraction = number_1 - number_2;
    	double multiplication = number_1*number_2;
    	float division = (float)number_1/number_2;

    	int result = 1;
		for (int i=1; i<=number_2; i++){
			result = result*number_1;
		}

		int m = number_1%number_2;

    	System.out.println(sum);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(division);
		System.out.println(result);
		System.out.println(m);
    }
}