package Chapter11.Ex01;

class Aa {

	// 자식 클래스에서 오버라이딩 가능 : 부모의 실행블락 코드를 자식에서 새롭게 정의해서 사용 가능
	void pirnt() {
		System.out.println("Aa 클래스의 print()");
	}

	void print() {
		// TODO Auto-generated method stub
		
	}

	// 오버라이딩 불가한 메소드 : 아주 중요한 메소드 < == 자식 클래스에서 수정하지 못하도록 설정
	final void run() {
		System.out.println("Aa 클래스의 run()");

	}
}

class Bb extends Aa {

	@Override
	void print() {
		System.out.println("Bb 클래스의 print()");
	}
	// 오버라이딩이 불가함
//	final void run() {}

}

public class Final_Method {

	public static void main(String[] args) {
		/*
		 	Final Method : 자식 클래스에서 오버라이딩을 불가하도록 부모 클래스의 인스턴스 메소드에서 설정
		 */

	}

}
