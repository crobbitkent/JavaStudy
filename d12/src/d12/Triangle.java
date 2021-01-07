package d12;

public class Triangle implements IAreable {
	private int bot;
	private int height;
	
	
	public Triangle(int b, int h) {
		// TODO Auto-generated constructor stub
		bot = b;
		height = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return bot * height * 0.5;
	}

}
