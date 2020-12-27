package d2;

// ��ȭ�� ����
public class TheaterProblem {
	public static void main(String[] args) {
		// ����profit = ���� - ����
		// ����income = Ƽ�� ���� * ������
		// ���outcome = ������� + (������ * 800��)

		int loopCount = 0;
		int fixedExpense = 180000; // 
		int expensePerPerson = 800; // ���� 1��� �߰� ���
		int price = 10000; // Ƽ�ϰ���
		int count = 120; // ������	
		
		int prevProfit = 0;
		int profit = 0;
		
		while (true) {
			// ���� ���� ����
			if(++loopCount > 10){
				return;
			}		

			int income = price * count;
			int outcome = fixedExpense + (count * expensePerPerson);

			profit = income - outcome;

			System.out.println("���� : " + price);
			System.out.println("������ : " + count);
			System.out.println("���� : " + profit);
			System.out.println("===============================");
			
					
			price -= 1000;
			count += 30;
			
		} // end while
	}
}
