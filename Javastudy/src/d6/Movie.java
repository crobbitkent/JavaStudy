package d6;

public class Movie {

	String category;
	int action;
	int kiss;
	
	// ������ -> new�� �Բ� �ν��Ͻ��� ���� �� ȣ���Ѵ�.
	// ���ڸ� �־���Ѵٰ� ����!
	public Movie(String category, int action, int kiss) {
		super();
		this.category = category;
		this.action = action;
		this.kiss = kiss;
	}

	@Override
	public String toString() {
		return "Movie [category=" + category + ", action=" + action + ", kiss=" + kiss + "]";
	}
	
	public double calcDistance(Movie other) {
		double dist = Math.sqrt(Math.pow(this.action - other.action, 2) + Math.pow(this.kiss - other.kiss, 2));
		
		return dist;
	}
}
