package Chapter08.Ex01;

public class A_Test02 {

	public static void main(String[] args) {
		// A 클래스와 다른 패키지에 존재 : import/ 클래스의 전체이름 : 패키지명.클래스명
		
		// 1. 다른 패키지의 클래스를 전체이름으로 사용
		Chapter08.Ex02.A a1 = new Chapter08.Ex02.A();
		
		
		// 2. import 해서 사용
		A a2 = new A();
		
		// 접근 가능한 필드나, 메소드 : public 접근 제어자만 접근 가능 
		System.out.println(a1.a);	// public
//		System.out.println(a1.b);	// protected(상속 관계가 설정이 되어있을때 다른 패키지에서 접근이 됨)
//		System.out.println(a1.c);	// default
//		System.out.println(a1.d);	// private
		
		a1.abc();		// public
//		a1.bcd();		// protected
//		a1.cde();		// default
//		a1.def();		// private
		

	}

}
