package Chapter10.Ex05;

class C {	// 부모
	
	// 필드 : 오버라이딩 되지 않는다. 자식과 완전히 별개이다.
	int m = 3;
	static int n = 30;
	
	// 인스턴스 필드 : 오버라이딩된다.
	void print() {
		System.out.println("C");
	}
	
	// 정적 필드 : 오버라이딩되지 않는다. 부모/자식은 별개
	static void print3() {
		System.out.println("C");
	}
}

class D extends C {		// 자식
	// 필드
	int m = 4;
	static int n = 40;
	
	void pirnt() {
		System.out.println("D");
	}
	static void print3() {
		System.out.println("D");
	}
}

public class Overriding_All_Info {

	public static void main(String[] args) {
		
		//
		C c1 = new D();
		System.out.println(c1.m);	//3
		System.out.println(c1.n);	//30
		c1.print();					// D	<== 오버라이딩 : 자식의 메소드 출력됨
		c1.print3();				// C
		
		System.out.println("====================================");
		// 다운캐스팅
		D d1 = (D) c1;
		System.out.println(d1.m);
		System.out.println(d1.n);
		c1.print();
		c1.print3();

	}

}
