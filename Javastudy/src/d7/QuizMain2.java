package d7;

import java.util.Scanner;

public class QuizMain2 {
	
	public static void main(String[] args) {
		
		// 시작 노드
		Quiz q1 = new Quiz("귀가 간지러울 땐 누가 내 욕을 하는 것이다.");
		
		Quiz q2 = new Quiz("깔려 있다고 생각되면 yes, 엎드려 있다고 생각되면 no");
		Quiz q3 = new Quiz("당신은 둘중 누구에게 감정이입이 되나? (A = yes, B = no)");
		
		Quiz q4 = new Quiz("내가 인터넷 메신저에 로그인 했을 때 곧바로 로그아웃하는 사람을 보면 상처받는다.");
		Quiz q5 = new Quiz("내가 오면 갑자기 조용해질 때가 종종 있다.");
		Quiz q6 = new Quiz("그림의 남자는 돈이 많다.");
		Quiz q7 = new Quiz("당한 것은 잊지 않는다.");
		Quiz q8 = new Quiz("그림의 얼굴, 기분 나쁜가요?");
		Quiz q9 = new Quiz("당신은 이런 테스트에 승복할 수 있나요?");

		Quiz q10 = new Quiz("결과 1 : 어쩌다 이렇게 되셨나요? 재활치료사가 필요합니다...");
		Quiz q11 = new Quiz("결과 2 : 당신의 피해의식을 인정하세요. 살다보면 좋은 날도 있을겁니다.");
		Quiz q12 = new Quiz("결과 3 : 그래도 당신은 희망이 있군요. 생활에 지장이 없답니다.");
		
		q1.yesQuiz = q2;
		q1.noQuiz = q3;
		
		q2.yesQuiz = q4;
		q2.noQuiz = q6;
		
		q3.yesQuiz = q6;
		q3.noQuiz = q7;
		
		q4.yesQuiz = q5;
		q4.noQuiz = q6;
		
		q5.yesQuiz = q9;
		q5.noQuiz = q8;
		
		q6.yesQuiz = q5;
		q6.noQuiz = q8;
		
		q7.yesQuiz = q10;
		q7.noQuiz = q8;
		
		q8.yesQuiz = q10;
		q8.noQuiz = q11;
		
		q9.yesQuiz = q12;
		q9.noQuiz = q11;
		
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
