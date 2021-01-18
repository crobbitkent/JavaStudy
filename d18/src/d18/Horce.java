package d18;

// 말 한마리당, while문 하나 = extends
public class Horce extends Thread{
	private String name;
	private int position;
	


	public Horce(String name) {
		this.name = name;
		this.position = 0;
	}
	
	// Thread의 start를 하면 이 함수가 실행된다.
	@Override
	public void run() {
		gallop();
	}
	
	public synchronized void gallop() {
		
		for(int i = 0; i < 100; ++i) {
			
			position += (int)(Math.random() * 10);
			
			int count = position / 10;
			
			// 동기화
			// synchronized(System.out) {
				for(int j = 0; j < count; ++j) {
					System.out.print(">");
				}
				System.out.println(name + " : " + position);
			// }
			// 동기화 끝
			
			
			try{
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		} // end for
		
	}

	@Override
	public String toString() {
		return "Horce [name=" + name + ", position=" + position + "]";
	}
	
	
}
