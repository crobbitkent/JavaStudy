package d12;

public class Rectangle implements IAreable {
	private int width;
	private int height;
	
	public Rectangle(int w, int h) {
		// TODO Auto-generated constructor stub
		width = w;
		height = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
}
