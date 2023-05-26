package chapter12.ex07;

interface A {
	
	//필드 <==== public static final 이 생략되어 있음. 
	int a = 20; 
	int b = 30; 
	String c = "현대 자동차"; 
	
	//메소드 : public abstract
	void abc();  // 2000 년도에 구현된 메소드 : USB 1.0
	void bcd();  // 2005 년도에 구현된 메소드 : USB 2.0 
	
	//default 메소드 : 인터페이스 내부에서 구현 코드를 가지는 메소드 
 	default void cde() {
		System.out.println("2010년도의 USB 3.0 기능 구현 ");
	};  // 2010 년도에 구현된 메소드 : USB 3.0    <== 새로운 기능을 1000개의 클래스에 적용 할려고 한다. 
	
	//static 메소드 : 인터페이스 내부에서 구현 부가 있는 메소드 
	static void def () {
		System.out.println("static 메소드 - 객체 생성없이 타입으로 바로 호출이 가능 ");
	}
	
	
}

// 위의 인터페이스를 구현한 클래스가 1000 개 있다. 

class Aa implements A {

	@Override
	public void abc() {
		System.out.println("Aa - 2000년도에 USB 1.0 을 구현한 메소드 ");	
	}
	@Override
	public void bcd() {
		System.out.println("Aa - 2005년도에 USB 2.0 을 구현한 메소드 ");			
	}
	
}
class Aaa implements A {

	@Override
	public void abc() {
		System.out.println("Aaa - 2000년도에 USB 1.0 을 구현한 메소드 ");	
	}
	@Override
	public void bcd() {
		System.out.println("Aaa - 2005년도에 USB 2.0 을 구현한 메소드 ");			
	}
	
	// default 메소드 오버라이딩 : 부모의 기능을 자식 클래스에서 새롭게 정의 사용 
	@Override
	public void cde() {
		System.out.println("Aaa - 부모의 default 메소드 오버라이딩 됨 ");
	}
	
}


public class Default_Method {
	public static void main(String[] args) {
		/*
		 	인터페이스 의 특징 : 
		 		- 모든 필드 , 메소드 는 public 접근 제어자 
		 		- 모든 필드는 public static final 이 생략됨 
		 		- 모든 메소드는 public abstract 이 생략됨 
		 		- 인터페이스 내부의 메소드는 선언만 되어야 하고 구현부{}를 생성하면 안된다. <== 자바 1.7 
		 			 - default / static <== 구현부를 가지는 메소드 <==  자바 1.8 추가된기능 
		 	default 메소드 : 메소드 앞에 붙이는 키  <== 인터페이스에서 구현부가 있는 메소드 , 주의 : 접근 제어자가 아니다. 
		 	    - 인터페이스에서 구현된 모든 클래스에게 상속되어서 적용. 
		 	    - 새로운 기능을 하위의 모든 클래스에게 적용 할때 사용함. 오류없이 적용할때사용
		 	    - 오버라이딩도 가능함. 
		 	    
		    static 메소드 : 인터페이스 내에서 메소드 이름앞에 붙임. 구현부가 있는 메소드 
		        - 자식클래스의 객체를 생성하지 않고 인터페이스 이름으로 호출 가능한 메소드 
		         
		 */
	
		// 자식 클래스를 생성하면서 인터페이스 타입으로 지정 
		A a1 = new Aa(); 
		A a2 = new Aaa(); 
		
		a1.abc();
		a1.bcd();
		a1.cde();      //default 메소드 
		
		System.out.println("=====default 메소드 오버라이딩==============");
		a2.abc();
		a2.bcd();
		a2.cde();     // default 메소드 <== 자식에서 오버라이딩됨 
		
		System.out.println("===Static 메소드 호출 ===============");
		A.def();       //A 인터페이스 타입 
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.c);
		
//		A.a = 50;         // final 이므로 수정 불가함. 
	}
}
