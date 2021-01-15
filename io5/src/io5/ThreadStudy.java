package io5;

public class ThreadStudy {
	
	public static void main(String[] args) {
		
		int loop = 100;
		
		new Thread(()->{for(int i = 0; i < loop; ++i) {
			System.out.println(Thread.currentThread().getName()+ " : " +i);
		}})	.start(); 
		// start() == 시동 걸고 출발!, 파란불! => cpu의 빈틈을 노리기 시작.
		
		
		
		
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
