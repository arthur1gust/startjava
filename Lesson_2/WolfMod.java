class WolfMod {	
	public static void main(String[] args) {
		Wolf one = new Wolf();
		one.age = 3;
		one.male_gender = true;
		one.color = "red";
		one.name = "Rex";
		one.weight = 13;
		one.setName();
		//one.displayInfo();
	}
}

class Wolf {
	int age;
	boolean male_gender;
	String color;
	String name;
	double weight;
	public String setName(){
		return name;
	}
	public void setName(String a){
		name = a;
		System.out.println(name);
	}

	public void displayInfo() {
		System.out.println(name);
	}
	public void run(){
		System.out.print("Running...\n");
	}
	public void sit(){
		System.out.print("Sitting...\n");
	}
	public void learn(){
		System.out.print("Learning Java...\n");
	}
}