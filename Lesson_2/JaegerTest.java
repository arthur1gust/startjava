public class JaegerTest {
	public static void main(String[] args) {
		Jaeger robotFirst = new Jaeger("Gipsy Avenger", "Mark-6", "United States of America");
		Jaeger robotSecond = new Jaeger("Coyote Tango", "Mark-1", "United States of America");
		
		System.out.println(robotFirst);
		System.out.println(robotSecond);

		robotFirst.drift();
		robotSecond.move();
		System.out.println(robotSecond.scanKaiju());
	}
}