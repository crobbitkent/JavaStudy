package d15;

public class Box {
	private Memo[] box;
	private int index;
	
	public Box(int count) {
		box = new Memo[count];
		index = 0;
		int ram = (int)( Math.random()*count);
		for( int i =0; i < count; i++) {
			 if(i==ram) {
				 box[i] = new Memo("X");
			 }else {
				 box[i] = new Memo("O");
			 }
			
			
		}
		
	}
	
	public Memo[] getBox() {
		return box;
	}
	
	public Memo getNextMemo() {	
		Memo result = box[index];
		index += 1;
		return result;
	}
}
