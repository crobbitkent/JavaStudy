package d12;

public class Circle implements IAreable {
	private int radius;
	
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		radius = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius * Math.PI;
	}

}
