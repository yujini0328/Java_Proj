package chapter02.ex01;

public class UsageOfDataType {
	public static void main(String[] args) {
		// 변수 : 계속 다른 값을 할당 할 수 있다.
		// 상수 : 초기값이 지정되면 다른 값을 넣을 수 없다.
		
		// 변수 선언 두가지 방법
		// 1. 변수를 선언, 나중에 값 대입
		int a;
		
		//System.out.println(a); 	// 초기값을 할당하지 않는 상태에서 사용하면 오류가 발생
		
		a = 10;
		System.out.println(a);
		
		// 2. 변수 선언과 동시에 값을 할당
		
		int b = 20;
		
		System.out.println(b);
		
		b = 30;
		System.out.println(b);
		b = 40;
		System.out.println(b);
		
		
		
		// 상수 선연 : 변수 이름 앞에 fianl 키를 넣는다., 상수 이름은 전체 대문자로 사용됨
			// 상수는 초기값이 들어가면 다른값을 넣을 수 없다.
		final double PI = 3.4;
		
		System.out.println(PI);
		
		// PI = 3.14123;	// 상수는 수정할 수 없다.
		
		
		
	}

}
