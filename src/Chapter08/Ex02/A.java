package Chapter08.Ex02;

public class A {
	// 생성자
	public A () {}
	
	// 필드에 부여된 접근 제어자
	public int a = 1;			// 같은 패키지나, 다른 패키지에서 접근 가능
	protected int b = 2;		// 같은 패키지에서 접근 가능, 다른 패키지에서 접근할대 상속 관계가 있어야 접근가능
	int c = 3;					// 외부 클래스에서 접근가능, 단 같은 패키지에 있어야 한다.
	private int d = 4;			// 같은 클래스에서만 접근, 외부 클래스에서는 접근 불가.
	
	// 메소드에 부여된 접근 제어자
	public void abc () {
		System.out.println("public");
	}
	protected void bcd () {
		System.out.println("proctected");
	}
	void def () {
		System.out.println("default");
	}
	private void efg () {
		System.out.println("private");
	}
	
	
	public static void main(String[] args) {
		

		

		
		
	}

}
