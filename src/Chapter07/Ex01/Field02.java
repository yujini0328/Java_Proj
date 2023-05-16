package Chapter07.Ex01;

class B{
	//public B () {}
	int m;			// 인스턴스 필드 : 객체화 후 사용, 다른 객체와 별도 분리가 됨, Heap
	static int n;	// 정적(static) 필드 : 객체없이 클래스명으로 사용 가능, 객체화해서도 사용됨, 메모리에 클래스 영역에 저장됨
							// 모든 객체와 공유되는 필드
	
}

public class Field02 {
	public static void main(String[] args) {
		
		// B 타입으로 b1, b2, b3 객체 생성
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		
		// 인스턴스 필드 : m <== 객체내부에서 고유 공간, 다른 객체화 값이 공유되지 않는 필드.
		b1.m = 1;
		b2.m = 2;
		b2.m = 3;
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		System.out.println(b3.m);
		
		// 정적(static) 필드 : 모든 객체에서 값을 공유하는 필드, 클래스 영역에 값이 저장됨
		b1.n= 10;
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		System.out.println(b3.n);
		System.out.println("==========================");
		
		B.n = 30;		// 객체 생성없이 클래스 이름으로 사용가능 : 
		
		System.out.println(b1.n);
		System.out.println(b2.n);
		System.out.println(b3.n);
	
	}

}
