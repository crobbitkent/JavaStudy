package io4;

public class Main {
	public static void main(String[] args) throws Exception {
		// package 이름까지 포함한 class 이름
		String name = "io4.AJob";
		
		// name이라는 이름을 가진 Class 변수를 선언
		// jdbc driver 로딩할 때도 사용된다.
		Class cls = Class.forName(name);
		
		System.out.println(cls);
		
		// class 생성자를 호출했고 instance를 get했다. 그래서 AJob의 참조변수를 obj에 대입
		// Object obj = cls.getConstructors()[0].newInstance(null);
		
		// 이걸 한단계 downcasting 해서 쓸 수 있다.
		Job obj = (Job)(cls.getConstructors()[0].newInstance(null));
		
		obj.doJob();
		
		System.out.println(obj);
	}
}
