package Chapter08.Ex01;

import Chapter08.Ex02.A;

public class A_Test03 extends A {		// A : 부모 클래스, A_Test03 : 자식 클래스	<== 상속관계 설정
	
	// 부모 클래스 : A 클래스의 필드 중 : public과 protected만 접근 가능
	int k = a;		// public		: 1
	int l = b;		// protected	: 2
//	int m = c;		// default
//	int n = d;		// private
	
	// 상속된 메소드 2개가 내려옴. // abc(), bcd(), 
	
	
	
	
	

	public static void main(String[] args) {
		
		A a1 = new A();
		
		// 접근 가능한 필드, 메소드 : public/ protected
		System.out.println(a1.a);	// public 접근 가능
//		System.out.println(a1.b);
		
		a1.abc();
		
		A_Test03 t1 = new A_Test03();
		
		System.out.println(t1.a); 	// A 클래스의 a 필드 : public 
		System.out.println(t1.b); 	// A 클래스의 b 필드 : protected
		
		// 메소드 출력
		t1.abc();		// public
		t1.bcd();		// protected
		
		
		

	}

}
