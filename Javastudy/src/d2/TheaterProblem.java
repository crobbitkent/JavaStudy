package d2;

// 영화관 문제
public class TheaterProblem {
	public static void main(String[] args) {
		// 수익profit = 수입 - 지출
		// 수입income = 티켓 가격 * 관객수
		// 비용outcome = 고정비용 + (관객수 * 800원)

		int loopCount = 0;
		int fixedExpense = 180000; // 
		int expensePerPerson = 800; // 관객 1명당 추가 비용
		int price = 10000; // 티켓가격
		int count = 120; // 관객수	
		
		int prevProfit = 0;
		int profit = 0;
		
		while (true) {
			// 무한 루프 방지
			if(++loopCount > 10){
				return;
			}		

			int income = price * count;
			int outcome = fixedExpense + (count * expensePerPerson);

			profit = income - outcome;

			System.out.println("가격 : " + price);
			System.out.println("관객수 : " + count);
			System.out.println("수익 : " + profit);
			System.out.println("===============================");
			
					
			price -= 1000;
			count += 30;
			
		} // end while
	}
}
