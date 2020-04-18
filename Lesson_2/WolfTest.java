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
        

     int age;
     boolean male_gender;
     String color;
     String name;
     double weight;

 	 void displayInfo() {
        System.out.println(age);
        System.out.println(male_gender);
        System.out.println(color);
        System.out.println(name);
        System.out.println(weight);
	}

}