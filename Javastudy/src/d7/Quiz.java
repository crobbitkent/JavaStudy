package d7;


// ������ ������ Ŭ����
public class Quiz {
	//===============FIELD===============//
	String text;
	Quiz yesQuiz;
	Quiz noQuiz;
	
	// ���������� ����
	public void setQuiz(Quiz d1) {
		this.yesQuiz = d1;
	}
	
	// ������ �����ϱ�
	public Quiz(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Quiz [text=" + text + ", yesQuiz=" + yesQuiz + ", noQuiz=" + noQuiz + "]";
	}

	
	//===============METHOD===============//

	// ����(answer)�� ���� ���� ���� �Ѿ��
	public Quiz getNext(String answer) {
		Quiz next = null;
		
		if(true == answer.equals("yes")) {
			next = yesQuiz;
		}else {
			next = noQuiz;
		}
		
		return next;
	}
	
	
}












