package d7;




// 복불복 상자에 들어있는 쪽지
public class MemoData {
	// 쪽지 내용 O,X
	String content;

	public MemoData(String content) {
		super();
		this.content = content;
	}

	@Override
	public String toString() {
		return "MemoData [content=" + content + "]";
	}
	
	// Method 이거는 필요할 때 천천히 만든다.
	
	// "O"이면 true
	public boolean showResult() {
		return this.content.equals("O");
	}
}
