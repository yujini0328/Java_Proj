package Chapter10.Ex05;

class A{
	// 인스턴스 필드
	int m = 20;
	
	// 인스턴스 메소드
	void print() {
		System.out.println("A - print()");
	}
}

class B extends A {
	int m = 30;
	
	// 인스턴스 메소드는 오버라이딩
	void print() {
		System.out.println("B - print()");
	}
}


public class Overriding_Instance_Filed {

	public static void main(String[] args) {
		/*
		 	상속에서 주의 : 오버라이딩은 인스턴스 메소드만 오버라이딩이 된다.
		 	
		 	상속은 부모클래스의 필드(인스턴스 필드, 정적 필드), 메소드(인스턴스 / 정적), 이너클래스를 상속 받는다.	생성자는 상속되지 않는다. 
		 		- 오버라이딩은 인스턴스 메소드만 오버라이딩이 된다.
		 		- 인스턴스 필드, 정적 필드, 정적 메소드는 오버라이딩 되지 않는다.
		 		
		 	필드와 메소드의 메모리 저장 위치
		 		- 인스턴스 필드 : Heap 공간에 저장이됨, 부모 필드, 자식 필드 별개의 공간에 저장됨. <== 오버라이딩 되지 않음.
		 		- 정적 필드	 : 클래스 영역에 저장이됨, 부모, 자식은 별도의 공간에 저장됨 <= 오버라이딩 되지 않음.
		 		- 인스턴스 메소드 : 인스턴스 메소드 영역 저장됨, 오버라이딩 됨.
		 		- 정적 메소드	 : 클래스 영역에 저장이됨, 부모, 자식은 별도의 공간에 저장됨 <== 오버라이딩 되지 않는다.
		 */
		
		// 자식 객체를 생성하면서 부모 타입으로 지정(인스턴스 필드는 오버라이딩 되지 않는다.)`
		A a1 = new B();
			//m필드의 값을 출력
			System.out.println(a1.m); 	// 20
		
			a1.print(); 	// 오버라이딩 되어서 출력됨
			
			B b1 = (B) a1;
			System.out.println(b1.m); 	// 30
			b1.print();
		

	}

}
