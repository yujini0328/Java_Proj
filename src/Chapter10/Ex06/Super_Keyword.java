package Chapter10.Ex06;

class A{
	
	int a;
	
	// 다른 생성자가 존재하지 않을 경우 기본 생성자는 생략 가능
	// 자식 클래스를 생성하는 순간 부모 클래스의 다른 생성자가 존재할 경우, 기본 생성자를 반드시 명시적으로 만들어 줘야 한다.
	A () {}
	
	A(int a){
		this.a = a;
	}
}

class B extends A {
	
	// 기본 생성자가 생략되어 있음.
	// 자식 클래스는 객채화 할때 부모 클래스의 생성자를 호출
	B () {
		super();
	}
	
}

public class Super_Keyword {

	public static void main(String[] args) {
		/*
		 	this 키워드 : 필드, 메소드 이름 앞에 this 키를 사용해서, 자신의 객체의 필드나, 메소드 호출시 사용됨.
		 	this ()	   : 생성자 내부에서 사용됨, 생성자 첫 라인에 와야하고, 자신의 객체의 다른 생성자를 호출
		 	
		 	상속 관계에서 부모 (Super) 클래스
		 	super 키워드	: 필드나 메소드 이름 앞에 super를 사용해서 부모의 필드나 메소드를 호출
		 	super ()	: 생성자 내부에서 사용됨, 생성자 첫 라인에 와야하고, 부모(super)의 생성자를 호출할때 사용.
		 */

	}

}
