public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();

		jaegerOne.setModelName("Gipsy Avenger");
		System.out.println(jaegerOne.getModelName());
		jaegerOne.move();
		jaegerOne.setMark("Mark-6");
		System.out.println(jaegerOne.getMark());

		Jaeger jaegerOne_2 = new Jaeger();

		jaegerOne_2.setRobotName("Coyote Tango");
		System.out.println(jaegerOne_2.getRobotName());
		System.out.println(jaegerOne_2.drift());
		jaegerOne_2.setMark("Mark-1");
		System.out.println(jaegerOne_2.getMark());
//		Jaeger robot = new Jaeger("Gipsy Avenger", "Mark-6", "United States of America");	
	}
}