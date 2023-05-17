package Chapter07.Ex04;

class C{	// this() 메소드를 사용하지 않고, 생성자를 초기화함.
	int m1, m2, m3, m4 ;	// 필드
	
	// 생성자 : 매개변수가 없는 생성자 <== 기본 생성자
	C(){
		m1 = 1; m2 =2; m3 = 3; m4 = 4;
	}
	// 생성자 : 매개변수가 1개인 생성자
	C(int a){
		m1 = a ; m2 = 2 ; m3 = 3 ; m4 = 4;
	}
	// 생성자 : 매개변수가 2개인 생성자
	C(int a, int b){
		m1 = a ; m2 = b ; m3 = 3 ; m4 = 4;
	}
	// 생성자 : 매개변수가 3개인 생성자
	C(int a, int b, int c){
		m1 = a ; m2 = b ; m3 = c ; m4 = 4;
	}

	// 
	@Override
	public String toString() {
		return "C [m1=" + m1 + ", m2 = " + m2 + ", m3 = " + m3 + ", m4 = " + m4 + "]";
	}
}

class D{	// this() 메소드를 사용해서, 생성자를 초기화함
	int m1, m2, m3, m4 ;
	// 매개변수 없는 생성자
	D(){
		m1 =1; m2 =2 ; m3 = 3 ; m4 = 4;
	}
	
	D(int a){
		this();		// 매개변수 없는 생성자 호출
		m1 = a; 
	}
	
	D(int a, int b){
		this(a);
		m2 = b;
	}
	
	D(int a, int b, int c){
		this(a,b);
		m3 = c;
	}
	
	@Override
	public String toString() {
		return "D [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
	
	
}

public class This_Method {
	public static void main(String[] args) {
		/*
		 	this() 메소드 : 생성자 호출할때 사용됨
		 		- 생성자 내부에서 사용됨.
		 		- 생성자 첫라인에 와야함.
		 		- 생성자 내부에서 다른 생성자를 호출할때 사용됨.
		 		- 시그니처에 따라서 생성자를 호출 : 아규먼트(인풋매개변수) 갯수, 아규먼트의 타입 
		 */
		
		// C 클래스로 객체를 생성후 생성자 호출후 각 필드의 내용 출력
		C c1 = new C();		// 기본 생성자 호출
		C c2 = new C(10);		// 생성자 호출 1
		C c3 = new C(100, 200);		// 생성자 호출 2
		C c4 = new C(1000, 2000, 3000);		// 생성자 호출 3
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println("=======================");
		D d1 = new D();		// 기본 생성자 호출
		D d2 = new D(10);
		D d3 = new D(111, 222);
		D d4 = new D(1000,2000,3000);
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
	}

}
