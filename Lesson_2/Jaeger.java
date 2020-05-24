public class Jaeger {
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

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Jaeger(String modelName, String mark, String origin){
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
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
}