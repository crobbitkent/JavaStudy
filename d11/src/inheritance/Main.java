package inheritance;

public class Main {
	public static void main(String[] args) {
		Store store1 = new SeoulStore();
		Store store2 = new BusanStore();
		
		// �̰��� ���...
		store1.makeRamen();
		store2.makeRamen();
		
		Store[] arr = new Store[5];
		arr[0] = store1;
		arr[1] = store2;
		
		
	}
	
	private static void test(Store store) {
		store.makeRamen();
	}
}
