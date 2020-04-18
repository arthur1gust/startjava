public class WolfTest {
	public static void main(String[] args) {
		Wolf one = new Wolf();
		one.age = 3;
		one.male_gender = true;
		one.color = "red";
		one.name = "Rex";
		one.weight = 13;
		one.displayInfo();
	}
}

class Wolf {
	boolean male_gender;
	String name;
	double weight;
	int age;
	String color;

	void displayInfo() {
		System.out.println(age);
	}
}