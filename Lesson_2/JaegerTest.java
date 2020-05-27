public class JaegerTest {
	public static void main(String[] args) {
		Jaeger robotFirst = new Jaeger("Gipsy Avenger", "Mark-6", "United States of America", "Destroyed", 81.77F, 2.004F);
		Jaeger robotSecond = new Jaeger("Coyote Tango", "Mark-1", "United States of America", "Destroyed", 85.34F, 2.312F);
		
		System.out.println(robotFirst.getModelName());
		System.out.println(robotSecond.getModelName());
		System.out.println(robotFirst.getMark());
		System.out.println(robotSecond.getMark());
		System.out.println(robotFirst.getOrigin());
		System.out.println(robotSecond.getOrigin());
		System.out.println(robotFirst.getStatus());
		System.out.println(robotSecond.getStatus());
		System.out.println(robotFirst.getHeight());
		System.out.println(robotSecond.getHeight());
		System.out.println(robotFirst.getWeight());
		System.out.println(robotSecond.getWeight());

		robotFirst.drift();
		robotSecond.move();
		System.out.println(robotSecond.scanKaiju());

	}
}