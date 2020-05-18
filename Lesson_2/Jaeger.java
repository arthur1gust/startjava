public class Jaeger {
	private String robotName;
	private String modelName;
	private String mark;
	private String origin;
	private String status;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	boolean drift() {
		System.out.println("You completed drift");
		return true;
	}

	void move() {
		System.out.println("You walked 5 steps");
	}

	String scanKaiju() {
		return "nothing";
	}

	void useVortexCannon() {

	}
}