package Chapter10.Ex03;

class A{
	void print() {	// 인스턴스 메소드
		System.out.println("A 클래스의 print()");
	}
}

class B extends A{	// B는 A를 상속받는다.

	
	@Override
	void print() {
		System.out.println("B 클래스의 print()");
	}
}

class C extends A {
	
	@Override
	void print() {
		System.out.println("C 클래스의 print()");
	}
}

public class MethodOverriding01 {
	public static void main(String[] args) {
		/*
		 	메소드 오버로딩(Method Overloading - 상속과는 상관없음.
		 		- 메소드 이름은 동일 시그니처에 따라서 다른 메소드를 식별 작동
		 		- 시그니처 : 메소드를 식별하는 식별자, 리터타입(x), 아규먼트의 갯수, 아규먼트의 자료형
		 	 
		 	메소드 오버라이딩(Method Overriding - 반드시 상속관계일때 적용
		 	 	- 부모 메소드의 실행부를 재정의해서 사용하는것
		 	 	- 인스턴스 메소드일때만 오버라이딩
		 	 	- 필드는 오버라이딩 되지 않는다.
		 	 	- 스태틱 메소드도 오버라이딩 되지 않는다. 
		 	 	- @Overrid 어노테이션 : 부모 클래스의 메소드를 오버라이딩 하겟다고 선언을 하는 선언자.
		 	 			-- 부모 클래스이 메소드의 리턴타입, 메소드명, 시그니처가 정확히 해야 한다.
		 */
		// A 클래스를 객체화해서 A타입으로 지정함.
		A a = new A();		// a : A
		a.print();
		System.out.println("========================");
		
		B b = new B();
		
		b.print(); 		// A 클래스의 print()가 출력
		
		System.out.println("========================");
		C c = new C();
		c.print();		// C 클래스의 print()가 출력
		
		System.out.println("=======자식 객체를 생성하면서 부모 타입으로 지정한 경우 : 오버라이딩된 메소드가 출력=========");
		A ab = new B();
		ab.print();		// B 클래스의 print()가 출력
		
		A ac = new C();
		ac.print();		// C 클래스의 print()가 출력
		
		
	}

}
