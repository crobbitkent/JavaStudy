package d11;



// 21/01/06 static ����
public class Kiosk {
	private static int num;
	
	// ���ǥ ��ȣ�� ��ȯ�ȴ�.
	public int pressButton() {
		return ++num;
	}
}
