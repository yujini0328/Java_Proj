package Chapter07.Ex02;

class G{
	
	// 메소드 :
		// - 인스턴스 메소드 : 객체화 시켜야 호출이 가능, 
		// - static 메소드 : 객체 생성없이 클래스명으로 호출이 가능, 객체 만들어서도 호출이 됨.
	// 인스턴스 메소드
	void sum (int a, int b) {
		System.out.println(a + b  + " <== 두 매개변수의 합은 ");	// + : 덧셈으로 처리됨
		System.out.println("두 매개변수의 합은 : " + a + b);		// + : 연결 연산자로 사용됨
	}
	
	// 정적 메소드 : 
	static int diff (int a, int b) {
		return a - b;
	}
	
	
	
}

public class Method03 {
	public static void main(String[] args) {
		
		// 1. 인스턴스 메소드 호출 : 객체화해야 호출이 가능한 메소드
		G g1 = new G();
		
		g1.sum(30, 40);		// 인스턴스 메소드 호출
		
		int a;
		a = g1.diff(50, 60);	// 정적 메소드, 
		System.out.println(a); 	
		
		System.out.println(g1.diff(90, 80));
		
		// 2. 정적 메소드 호출 : 객체 생성 없이 클래스 이름으로 호출 가능
		int b;
		
		b = G.diff(100, 50);
		
		System.out.println(b);
		
		System.out.println(G.diff(300, 40));
		
		
		
		
	}

}
