package d8;

public class Pizza {
	//===============필드==============//
	String name;
	int size;
	int price;
	
	
	//===============생성자=============//
	public Pizza(String name, int size, int price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
	//===============메서드=============//

}
