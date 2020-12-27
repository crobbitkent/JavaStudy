package d4;




public class ArrayTest {
	public static void main(String[] args) {
		double[] data = {38,38,35,34,41,36,35,33,37,40};
		
		// 1. ������ ���Ƽ� ���빰 ���
		int length = data.length;
		
		for(int i = 0; i < length; ++i){
			System.out.println(data[i] + " ");
		}
			
		// 2. ��ü�� �հ� ���
		int sum = 0;
		
		for(int i = 0; i < length; ++i){
			sum += data[i];		
		}
		
		double average = sum / length;
		System.out.println("��ü �� = " + sum + ", ��� �� = " + average);
		
		// 3. ���� ���� ���� �ε��� ��ȣ ���ϱ�
		double max = data[0];
		int maxIndex = 0;
		
		for(int i = 0; i < length - 1; ++i){
			double temp = data[i + 1];
			
			if(max < temp) {
				max = temp;
				maxIndex = i+1;
			}		
		}
		System.out.println("���� ���� �µ� = " + max + ", �ε��� = " + maxIndex);
	}
}
