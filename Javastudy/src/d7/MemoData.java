package d7;




// ���Һ� ���ڿ� ����ִ� ����
public class MemoData {
	// ���� ���� O,X
	String content;

	public MemoData(String content) {
		super();
		this.content = content;
	}

	@Override
	public String toString() {
		return "MemoData [content=" + content + "]";
	}
	
	// Method �̰Ŵ� �ʿ��� �� õõ�� �����.
	
	// "O"�̸� true
	public boolean showResult() {
		return this.content.equals("O");
	}
}
