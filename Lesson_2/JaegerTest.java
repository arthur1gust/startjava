public class JaegerTest {
	public static void main(String[] args) {
		Jaeger robotFirst = new Jaeger("Gipsy Avenger", "Mark-6", "United States of America", "Destroyed", 81.77F, 2.004F);
		Jaeger robotSecond = new Jaeger("Coyote Tango", "Mark-1", "United States of America", "Destroyed", 85.34F, 2.312F);
		
		System.out.println(robotFirst);
		System.out.println(robotSecond);

		robotFirst.drift();
		robotSecond.move();
		System.out.println(robotSecond.scanKaiju());

	}
}