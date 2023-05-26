package Chapter11.Ex01;

class A {
	
	int a = 3;			// 필드 : Heap에 변수와 값이 저장됨, 값을 수정할 수 있다.
	final int B = 5;	// 상수 : 값을 수정 불가함.
	
	A(){
		a = 7;			// 수정이 가능
//		B = 10;			// 오류 발생 수정이 불가함.
	}
	void print () {
		
		int c = 10;		// c 지역 변수 : Stack에 변수와 값이 저장됨
		final int D = 20;	// d 지역 상수 : 값을 수정할 수 없다.
		
		c = 100;
//		D = 200;			// 오류 발생 : 상수
		
	}
}

public class Final_Field {

	public static void main(String[] args) {
		/* 
		 	final : 마지막이다.
			 	- 1. 필드[변수] : 값을 수정하지 못하도록 한다. [상수]
			 	- 2. 메소드 : 메소드를 수정하지 못하도록 한다. 오버라이딩을 할 수 없는 메소드, 인스턴스 메소드는 자식 클래스에서 오버라이딩
			 	- 3. 클래스 : 상속할 수 없는 클래스, 상속 불가한 클래스
		*/

	}

}
