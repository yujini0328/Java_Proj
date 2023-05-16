package Chapter07.Ex02;

class A{
	
	// 인스턴스 필드
	int m;
	int n;
	
	// 메소드 : 함수를 객체지향 언어에서는 메소드, 호출해야 사용가능, 인풋 매개변수를 가짐.
	
	// 리턴값이 없는 메소드
	void print () {			// 리턴타입 메소드명 () {}
		// 호출시 필드의 내용을 출력
		System.out.println("m 필드의 값 : " + m);
		System.out.println("n 필드의 값 : " + n);
		
	}
	
	
	// 리턴 값이 있는 메소드(int), 메소드 호출시 인풋 매개변수를 받는 메소드
	int plus(int a, int b) {
		
		
		return a+b;
	}
	
	//  더블을 리턴
	double mainus(double a, double b) {
		
		
		return a-b;
	}
	
	// 문자열을 리턴
	String fullName(String fName, String lName) {
		
		return lName + " " + fName;
	}
	
}

public class Method01 {
	public static void main(String[] args) {
		
		// 객체 생성
		A a = new A();
		
		// 메소드 호출 : 리턴이 없는 메소드
		a.m = 10;
		a.n = 20;
		
		a.print();
		
		// 리턴 값이 있는 메소드 호출, 매개변수 정수값 2개
		System.out.println(a.plus(10, 20));
		// 더블을 리턴 받는 메소드 호출, 
		System.out.println(a.mainus(33.3, 22.1));
		// 문자열을 리턴 받는 메소드 호출
		System.out.println(a.fullName("길동", "홍"));
		
	}

}
