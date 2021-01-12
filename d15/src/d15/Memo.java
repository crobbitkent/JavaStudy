package d15;



// Memo라는 타입 => 데이터의 묶음 
public class Memo {
	
	// 클래스 변수 선언
	private String contents;
	
	// 생성자
	private Memo() {
		
	}
	// Memo m1 = new Memo();
	
	// 미리(new Memo할 때) contents값을 수정하기 위해서. 또는 채워놓기 위해서
	public Memo(String a) {
		contents = a; // "O"
	}
	// Memo m1 = new Memo(); // 오류가 난다.
	// Memo m1 = new Memo("O"); // 이렇게 호출할 예정이다.
	
	// 이 함수를 만드는 이유?
	// contents값을 확인하려고.
	public String getContents() {
		return contents;
	}
	
	public void setContents(String a) {
		contents = a;
	}
	
}
