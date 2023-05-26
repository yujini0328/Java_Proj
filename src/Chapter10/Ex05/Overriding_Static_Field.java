package Chapter10.Ex05;

class Aa{
	
	static int m = 3;
	
	
}
class Bb extends Aa {
	
	static int m = 4;
	
	
}

public class Overriding_Static_Field {

	public static void main(String[] args) {
		// 정적 필드 : 클래스 영역에 필드의 값이 저장이 되어 있음. 부모의 필드, 자식의 필드는 별개임.
		//		-- 모든 객체에서 공유되는 공간 
			// -- 객체 생성후 사용
			// -- 객체 생성 없이 클래스 이름으로 호출 
		
		// 객체 생성 후 사용.
		Aa aa1 = new Bb();		// 자식 객체 생성하면서 부모 타입으로 지정.
			System.out.println(aa1.m); 	// 3
			
		// 다운 캐스팅후 m을 출력
		Bb bb1 = (Bb) aa1;
			System.out.println(bb1.m); 	// 4
			
		// 객체 생성 없이 클래스 이름으로 사용
			System.out.println(Aa.m); 	// 3
			System.out.println(Bb.m);	// 4
		
		
		

	}

}
