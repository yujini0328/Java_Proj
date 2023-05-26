package Chapter10.Ex06;

class Aa {
	
	int a = 10;
	
	void abc() {
		System.out.println("Aa 클래스의 abc 메소드");
	}
	void ab() {
		System.out.println("Aa 클래스의 ab 메소드");
	}
	
}
class Bb extends Aa {
	
	int b = 20;
	
	@Override
	void abc() {
		System.out.println("Bb 클래스의 abc()");
	}
	void bcd() {
		abc();			// this.abc(), this가 생략되어 있음.
	}
	void cde() {
		super.abc();	// 부모 객체의 abc() 메소드 호출
	}
	void def () {
		super.ab();		//  부모 객체의 ab() 메소드 호출
	}
	void efg() {
		System.out.println(super.a);
		System.out.println(this.b);
	}
}

public class Super_Keyword02 {
	public static void main(String[] args) {
		//
		
		// 1. 객체 생성
		Bb bb = new Bb();		// bb : Aa, Bb 타입을 내포하고 있고 Bb 타입으로 지정
		bb.bcd();	// 자기 자신의 abc() 메소드 호출됨, this 
		bb.cde(); 	// 부모 클래스의 메소드 호출 : Aa의 abc() 호출
		bb.def();	// 부모의 ab() 호출
		
		bb.efg();
		
		
		
	}

}
