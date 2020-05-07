public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setMaleGender("man");
		wolfOne.setName("Reks");
		wolfOne.setWeight(20.6);
		wolfOne.setAge(7);
		wolfOne.setColor("black");

		System.out.println(wolfOne.getMaleGender());
		System.out.println(wolfOne.getName());
		System.out.println(wolfOne.getWeight());
		System.out.println(wolfOne.getAge());
		System.out.println(wolfOne.getColor());
	}
}