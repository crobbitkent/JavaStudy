package d2;

public class LeapYear {
	public static void main(String[] args) {
		// �ڷ�
		int year = 2400;
		boolean isLeapYear = false;

		// ����
		// ������ 4�� ���� ���� 0�̸� ����
		if (0 == year % 4) {
			// �ش� ������ 100���� ���������� ���
			if (0 == year % 100) {
				// ���
				isLeapYear = false;
				
				// ��������� 400���� ���������� ����
				if (0 == year % 400) {
					// ����
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;
			}
		}

		// ���
		if (true == isLeapYear) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}	

		/*
		 * if(year % 400 == 0){ 
		 * 	 System.out.println(year + "�����Դϴ�."); 
		 * }else if(year % 100 == 0){
		 * 	 System.out.println(year + "����Դϴ�."); 
		 * }else if(year % 4 == 0){
		 *   System.out.println(year + "�����Դϴ�."); 
		 * }
		 */
	}
}
