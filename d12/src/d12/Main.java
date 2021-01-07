package d12;

public class Main {

	public static void  main(String[] args) {
		
		
		IAreable[] arr = new IAreable[]{
				new Circle(10),
				new Triangle(100, 30),
				new Rectangle(50, 20),
				new Trapezoid(10, 20, 30)
		};
		
		for(int i = 0; i < 4; ++i) {
			System.out.println(arr[i].getArea());
		}
		
		
	}

}
