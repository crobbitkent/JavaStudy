package d11;







public class Ex1 {
	
	static {
		System.out.println("EX1");
	}
	
	// �̷��� �ϸ� ����(new) �Ұ�
	// java doc���� ������ �ʴ´�.
	// �Լ��鸸 ������� ��ƿ��Ƽ Ŭ������ �̷��� ���ȴ�.
	// private Ex1() {	}
	
	public void doA() {
		System.out.println("A");
		Ex1.doB();
	}
	
	public static void doB() {
		System.out.println("B");
		// doA(); // �Ұ���
	}
	
	
	
	
}