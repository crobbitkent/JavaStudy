package d7;

import java.util.Scanner;

public class QuizMain2 {
	
	public static void main(String[] args) {
		
		// ���� ���
		Quiz q1 = new Quiz("�Ͱ� �������� �� ���� �� ���� �ϴ� ���̴�.");
		
		Quiz q2 = new Quiz("��� �ִٰ� �����Ǹ� yes, ����� �ִٰ� �����Ǹ� no");
		Quiz q3 = new Quiz("����� ���� �������� ���������� �ǳ�? (A = yes, B = no)");
		
		Quiz q4 = new Quiz("���� ���ͳ� �޽����� �α��� ���� �� ��ٷ� �α׾ƿ��ϴ� ����� ���� ��ó�޴´�.");
		Quiz q5 = new Quiz("���� ���� ���ڱ� �������� ���� ���� �ִ�.");
		Quiz q6 = new Quiz("�׸��� ���ڴ� ���� ����.");
		Quiz q7 = new Quiz("���� ���� ���� �ʴ´�.");
		Quiz q8 = new Quiz("�׸��� ��, ��� ���۰���?");
		Quiz q9 = new Quiz("����� �̷� �׽�Ʈ�� �º��� �� �ֳ���?");

		Quiz q10 = new Quiz("��� 1 : ��¼�� �̷��� �Ǽ̳���? ��Ȱġ��簡 �ʿ��մϴ�...");
		Quiz q11 = new Quiz("��� 2 : ����� �����ǽ��� �����ϼ���. ��ٺ��� ���� ���� �����̴ϴ�.");
		Quiz q12 = new Quiz("��� 3 : �׷��� ����� ����� �ֱ���. ��Ȱ�� ������ ����ϴ�.");
		
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
		
		System.out.println("�ɸ��׽�Ʈ�� �����մϴ�.");
		
		Scanner scanner = new Scanner(System.in);
		String userAnswer = "";	
		
		for(Quiz currentQuiz = q1; null != currentQuiz; currentQuiz = currentQuiz.getNext(userAnswer)) {
			System.out.println(currentQuiz.text);
			userAnswer = scanner.nextLine();
		}
		
		System.out.println("�ɸ��׽�Ʈ�� �������ϴ�.");
	}
}
