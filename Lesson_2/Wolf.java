public class Wolf {
	private String maleGender = "man";
	private String name = "reks";
	private double weight = 20.6;
	private int age = 3;
	private String color = "black";

	public String getMaleGender() {
		return maleGender;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	void setAge(int age) {
		int sum = age - 8;
		if(sum > 0) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void go() {
		System.out.print("Going...\n");
	}

	public void sit() {
		System.out.print("Sitting...\n");
	}

	public void run() {
		System.out.print("Running...\n");
	}

	public void howl() {
		System.out.print("Howling...\n");
	}

	public void hunt() {
		System.out.print("Hunting...\n");
	}
}