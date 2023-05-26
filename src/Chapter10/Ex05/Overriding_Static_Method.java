package Chapter10.Ex05;

class Aaa{
	
	// 정적 메소드 : Aaa 클래스 영역에 실행코드가 들어감.
	static void print() {
		System.out.println("Aaa - print()");
	}
	void print2() {
		System.out.println("Aaa - print2() - 인스턴스 메소드");
	}
}
class Bbb extends Aaa{
	
	static void print() {
		System.out.println("Bbb - print() - 정적 메소드");
	}
	void print2() {
		System.out.println("Bbb - print2() - 인스턴스 메소드");
	}
	
}

public class Overriding_Static_Method {

	public static void main(String[] args) {
		// 정적 메소드 : 클래스 영역에 실행코드를 가지고 있음. 각 클래스 영역에 들어 있기 때문에 오버라이딩 되지 않는다.
			// -- 객체화해서 사용가능
			// -- 객체 없이 클래스 이름으로 바로 사용
		// 객체 생성해서 호출 : 정적 메소드, 인스턴스 메소드
		Aaa aaa1 = new Bbb();
		aaa1.print(); 		// 정적 메소드 : 오버라이딩 되지 않고 각각 별개의 공간에서 작동
		aaa1.print2();		// 인스턴스 메소드 : 오버라이딩되어 자식의 오버라이딩된 메소드 작동
		
		System.out.println("============================");
		// 다운 캐스팅
		Bbb bbb1 = (Bbb) aaa1;
		bbb1.print();
		bbb1.print();
		
		// 객체 생성 없이 바로 호출이됨
		Aaa.print();
		Bbb.print();
		
		

	}

}
