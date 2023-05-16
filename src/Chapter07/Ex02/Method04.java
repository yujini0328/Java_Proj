package Chapter07.Ex02;

public class Method04 {
	
	// 인스턴스 메소드 : 객체화해야 호출이 됨
	String sum (int a, int b) {
		
		int c = a + b;			// c = a + b
		String d = String.valueOf(c);	// 정수 c를 String 타입으로 변환 d 변수에 할당
		return d;
	}
	
	// 정적(static) 메소드 : 객체 생성 없이 호출 가능
	static int sum2(int a, int b) {
		
		return a + b;
	}
	
	
	
	public static void main(String[] args) {
		
		// main 메소드는 static 키워드가 들어가 있다.
			// 같은 클래스 내에서 static 붙은 메소드는 메소드 명으로 바로 호출이 됨
		int a;
		a = sum2(10, 20);
		System.out.println(a);
		
		// sum : 인스턴스 메소드, 객체화해야 호출이 됨
		Method04 m1 = new Method04();
		
		String s1 = m1.sum(10, 30);		// 40 <== String
		String s2 = m1.sum(70, 70);		// 140 <== String
		
		System.out.println(s1);	// 40
		System.out.println(s1);	// 140
		
		System.out.println(s1 + s2);
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); 	// 180 <== 40 + 180
		
		
		// 같은 클래스 내부에서 메소드 호출 (static 메소드는 static 메소드를 호출가능)
		// sum2 : static(정적 메소드)
		int m = Method04.sum2(10, 20);		// 1. 클래스명으로 호출 : 객체 생성 없이 호출됨
			System.out.println(m);
			
		Method04 m3 = new Method04();		// 2. 객체 생성 후 출력
		int n = m3.sum2(10, 20);
			System.out.println(m);
			
		int k = sum2(10,20);				// 3. main 메소드에서 메소드명으로 바로 호출됨 : 
													// 동일한 클래스 내부, static
			System.out.println(k);
			
		// sum (10, 10);	// 인스턴스 메소드 : 객체 생성 후 호출
		sum2(10, 10);		// 정적(static) 메소드 : 객체 생성 후 호출, 클래스명으로 호출, 메소드명으로 바로 호출
		
	}

}
