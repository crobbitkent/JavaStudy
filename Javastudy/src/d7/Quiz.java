package d7;


// 데이터 위주의 클래스
public class Quiz {
	//===============FIELD===============//
	String text;
	Quiz yesQuiz;
	Quiz noQuiz;
	
	// 지역변수를 선언
	public void setQuiz(Quiz d1) {
		this.yesQuiz = d1;
	}
	
	// 생성자 제한하기
	public Quiz(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Quiz [text=" + text + ", yesQuiz=" + yesQuiz + ", noQuiz=" + noQuiz + "]";
	}

	
	//===============METHOD===============//

	// 정답(answer)에 따라 다음 노드로 넘어가기
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












