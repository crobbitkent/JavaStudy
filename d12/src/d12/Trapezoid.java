package d12;

public class Trapezoid implements IAreable {
	private int bot;
	private int height;
	private int top;
	

	// �غ�, ����, ����
	public Trapezoid(int b, int t, int h) {
		// TODO Auto-generated constructor stub
		bot = b;
		height = h;
		top = t;
	}

	// (����)+(�Ʒ���)}��(����) �� 2
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (top + bot) * height * 0.5;
	}

}
