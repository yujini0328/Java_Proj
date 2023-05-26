package Chapter10.Ex07;

class A extends Object{
		// class A extends Object		: 최상위 클래스는 Object 클래스를 상속 받는다.
	Integer a;
	String b;
	Double c;
	Boolean d;
	
	Object e;
}
class B extends A {
	
	int a = 10;
	int b = 20;
	int c = 20;
	
	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}

public class Object_Class {

	public static void main(String[] args) {
		/*
		 	Object 클래스 : 
		 	- java.lang.object
		 	- java.lang 패키지의 모든 클래스는 import 없이 사용할 수 있다.
		 	- 모든 자바 클래스는 Object 클래스의 자식이 됩니다.
		 	- 자바의 모든 클래스는 Object 클래스의 선언된 메소드를 상속 받는다.
		 	- toString() : 객체 자체를 출력시 객체의 "패키지주소@메모리주소"		<== 재정의해서 많이 사용(객체의 필드에 저장된 값을 출력)
		 	- equals() : 기본적으로 stack 메모리의 주소를 비교 <==> 재정의해서 Heap의 값을 비교하도록 설정
		 */
		
		A a = new A();
		
		System.out.println(a);
		System.out.println(a.toString());	// Object 클래스의 .toString	
		
		B b = new B();
		
		System.out.println(b);
		System.out.println(b.toString());

	}

}
