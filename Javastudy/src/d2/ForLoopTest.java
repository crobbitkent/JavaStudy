package d2;

public class ForLoopTest 
{
	public static void main(String[] args)
	{
		// ������
		
		          // �ʱ⹮  // �˻�� // ��ȯ��
		outer:for (int i = 0; i < 10; ++i) 
		{
			System.out.println(i);
			break outer;
		}
		
		// �ݺ��� ����!
		// 1. �ʱ⹮(int i = 0;) => �ѹ��� ����ȴ�.
		// (�ݺ� 2~4)
		// 2. �˻��(i < 10;) => boolean Ÿ���̾�� �Ѵ�.
		// 3. ����
		// 4. ��ȯ��(i++)
		
		
	}
}
