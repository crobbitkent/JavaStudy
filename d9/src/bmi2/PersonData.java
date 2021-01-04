package bmi2;




public class PersonData {
	//======================= FIELD =======================//
	private String name;
	private double height;
	private double weight;
	
	//====================== CONSTRUCTOR ========================//
	public PersonData(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	
	//===================== TO STRING ======================//
	@Override
	public String toString() {
		return "PersonData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}


	// 읽기 전용
	//====================== GETTER =======================//
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	
	
	
	
	
}
