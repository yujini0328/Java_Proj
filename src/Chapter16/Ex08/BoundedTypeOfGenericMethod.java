package Chapter16.Ex08;

class A {	// 일반클래스의 제너릭 메소드
	
	// Number 클래스 : 정수(byte, short, int, long)나 실수(float, double)를 처리하는 부모클래스 
		// T : Byte, Short, Integer, Long, Float, Double 타입이 올 수 있다.
	
	
	public <T extends Number> void method1 (T t) {	// 정수나 실수만 처리하는 자료형만 올 수 있다.
		
		System.out.println(t.intValue());	// t.intValue() : Number 타입의 메소드
	}
}

// 인터페이스 : 제너릭 타입 제한시 인터페이스일때 다중제한이 가능하다. 클래스 일때는 하나만 처리할 수 있다.
		// < T extends IF1 $ IF2 & IF3>
		// 인터페이스로 제한을 두면 인터페이스를 구현한 하위의 모든 클래스가 타입으로 지정될 수도 있다.
interface IF1 {
	void print();	// public abstract가 생략됨. 1. 자식 클래스에서 구현 클래스를 만들고 사용, 2. 익명 클래스를 사용해서 구현
}
class Aa implements IF1 {

	@Override
	public void print() {
		System.out.println("Aa 구현된 메소드 호출 - 오버라이딩");
	}
	
}
class Aaa extends Aa {
	
	@Override
	public void print() {
		System.out.println("Aaa 구현된 메소드 호출 - 오버라이딩");
	}
	public void print2 () {
		System.out.println("Aaa의 자식 Aaa의 print2 메소드");
	}
}


interface IF2 {
	void eat();
}
interface IF3 {
	void run();
}

// 제너릭 클레스에서 인터페이스를 사용해서 타입을 제한 : 여러 인터페이스를 적용 가능
class E <T extends IF1 > {	// T : IF1 (자식 : Aa, Aaa), IF2, IF3
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

// 제너릭 메소드에서 인터페이스 타입 사용 제한
class B {
	public <T extends IF1> void method1 (T t) {		// T : IF1 (자식 : Aa, Aaa), IF2, IF3
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		/*
		 	제너릭 메소드에서 타입 제한 :
		 		- 타입 제한을 두지 않을 때 : 모든 타입이 매개변수 인자로 오기 때문에 Object의 메소드만 사용 가능
		 		- 타입을 제한을 두면 : 제한을 둔 클래스의 메소드를 사용가능 
		 */
		
		//
		A a = new A();	// 일반 클래스
		a.<Double> method1(88.88);
		
		a.<Float> method1 (99.99F);
		a.<Integer> method1 (100);
		
//		a.<String> method1 ("안녕");
		
		
		System.out.println("=======================");
		B b1 = new B();
		
		// 제너릭 메소드 호출(익명 클래스로 작동)
		b1.<IF1> method1 (new Aa());			// 자식 클래스를 객체화해서 인터페이스 타입으로 오버라이딩
		b1.<IF1> method1 (new Aaa());		
		
		// 제너릭 메소드 호출 () : 익명 클래스 사용해서 호출
		// 인터페이스는 객체화할 수 없다. : 자식을 객체화해서 타입으로는 지정 가능하다.
		// 		-- 인터페이스의 메소드 호출시 자식의 오버라이딩된 메소드 호출
		b1.<IF1> method1 (new IF1() {
			@Override
			public void print() {
				System.out.println("오버라이딩된 익명 클래스");
			}
		});
		
		b1.<IF1> method1 (new IF1() {	// 익명 클래스
			@Override
			public void print() {
				System.out.println("익명 클래스 2");
			}
		});
		
		b1.<Aa> method1 (new Aa());
		b1.<Aaa> method1 (new Aaa());
	}
}
