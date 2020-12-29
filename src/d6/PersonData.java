package d6;




public class PersonData {
	// 1. ���� ����
	String name;
	double height;
	double weight;
	
	
	// 3. �ʼ� �����͸� �ִ� ������
	public PersonData(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "PersonData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	public double calcBMI() {
		double bmi = this.weight / (height*height*0.0001);
		return bmi;
	}
}
