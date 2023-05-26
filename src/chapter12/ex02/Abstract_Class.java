package chapter12.ex02;

// 1. 콘크리트 클래스 생성후 사용 : <<자주 매번 사용하는 경우>>
abstract class A {		//추상 클래스 
	//추상 메소드  
	abstract void cry();
}
class B extends A {
	@Override
	void cry() {
		System.out.println("구현된 메소드 출력 ");		
	}
}

// 2. 익명 클래스로 사용하는 방법 : << 한번 사용하고 더이상 사용하지 않을 경우 >>
abstract class C {
	abstract void cry(); 
}


abstract class D {
	abstract void run(); 
	abstract void eat(); 
}




public class Abstract_Class {

	public static void main(String[] args) {
		/*
		 	추상 클래스 (Abstract Class ) 
		 	   - 추상 메소드를 포함한 클래스  abstract void abc();
		 	   - 추상 클래스는 객체화 할수 없다. 자식을 객체화 해서 타입으로는 지정 가능하다. 
		 	   - 추상 클래스를 작동하는 방법은 2가지 
		 	      -1. 자식 클래스에서 상속을 통해서 추상 메소드를 구현한 클래스를 만들고 (콘크리트 클래스), 
		 	       		자식 클래스를 객체화 해서 사용
		 	       		<<자주 사용 하는 경우>> 
		 	      -2. 콘크리트 클래스없이 익명 클래스를 만들어서 사용, 
		 	       		<<한번 사용하고 버리는 경우>> , 안드로이드 폰개발시 이벤트 처리 할때 많이 사용. 
		 */
		
		// 1. 구현 클래스를 만들고 사용하는 방법 (콘크리트 클래스를 객체화 해서 타입을 추상 클래스로 지정후 메소드 호출 ) 
		A a1 = new B(); 
		a1.cry();
		
		// 2. 익명 클래스를 생성 해서 사용하는 방법 
		
		C c1 = new C () {
			@Override
			void cry() {
				System.out.println("C 클래스의 구현된 메소드 ");	
			}
		};
		
		c1.cry();
		
		
		D d1 = new D() {
			@Override
			void run() {
				System.out.println("D 클래스의 run () ");
			}
			@Override
			void eat() {
				System.out.println("D 클래스의 eat() ");		
			}
		};
		
		d1.run();
		d1.eat();
		

	}

}
