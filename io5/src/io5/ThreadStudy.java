package io5;

public class ThreadStudy {
	
	public static void main(String[] args) {
		
		int loop = 100;
		
		new Thread(()->{for(int i = 0; i < loop; ++i) {
			System.out.println(Thread.currentThread().getName()+ " : " +i);
		}})	.start(); 
		// start() == �õ� �ɰ� ���!, �Ķ���! => cpu�� ��ƴ�� �븮�� ����.
		
		
		
		
		System.out.println("====================================== first line");
		
		new Thread(()->{for(int i = 0; i < loop; ++i) {
			System.out.println(Thread.currentThread().getName()+ " : " +i);
		}})	.start();
		
		System.out.println("====================================== second line");
		
		for(int i = 0; i < loop; ++i) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
		System.out.println("====================================== third line");
	}
	
}
