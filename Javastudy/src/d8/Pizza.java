package d8;

public class Pizza {
	//===============�ʵ�==============//
	String name;
	int size;
	int price;
	
	
	//===============������=============//
	public Pizza(String name, int size, int price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
	//===============�޼���=============//

}
