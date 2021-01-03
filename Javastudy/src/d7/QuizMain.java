package d7;

import java.util.Scanner;

public class QuizMain {
	
	public static void main(String[] args) {
		
		// 시작 노드
		Quiz q1 = new Quiz("1");
		
		Quiz q2 = new Quiz("2");
		Quiz q3 = new Quiz("3");
		
		Quiz q4 = new Quiz("4");
		Quiz q5 = new Quiz("5");
		Quiz q6 = new Quiz("6");
		Quiz q7 = new Quiz("7");
		
		q1.yesQuiz = q2;
		q1.noQuiz = q3;
		
		q2.yesQuiz = q4;
		q2.noQuiz = q5;
		
		q3.yesQuiz = q6;
		q3.noQuiz = q7;
		
		System.out.println("심리테스트를 시작합니다.");
		
		Scanner scanner = new Scanner(System.in);
		String userAnswer = "";	
		
		for(Quiz currentQuiz = q1; null != currentQuiz; currentQuiz = currentQuiz.getNext(userAnswer)) {
			System.out.println(currentQuiz.text);
			userAnswer = scanner.nextLine();
		}
		
		System.out.println("심리테스트가 끝났습니다.");
	}
}
