package Chapter16.Ex05;

class GenericMethod {	// 일반 클래스
	
	
	
	// 제너릭 메소드는 반드시 일반 클래스에 생성 가능하다.
	public <T> T method (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);	// 스택의 값을 비교, String은 equals() 메소드가 Heap의 값을 비교하도로고 재정의 되어있다.
	}
	
	public <K, V> void method3 ( K k, V v) {
		
		System.out.println(k + " : " + v);
	}
	
	public <K, V> void method4 (V v) {
		
		K k;
		System.out.println("반드시 타입을 지정해서 호출 되어야함 : 매개변수에서 타입을 유추 할 수 없기 때문");
	}
}




public class Genericmethod01 {
	public static void main(String[] args) {
		/*
		 	제너릭 메소드 : 
		 		- 주의 : 제너릭 클래스의 내부의 메소드가 아니다. , 제너릭 클래스 내부에는 제너릭 클래스를 생성할 수 없다.
		 		- 일반 클래스에 제너릭 메소드가 생성된다.	
		 		- 1. 객체를 생성해서 메소드를 호출시 <타입> 넣고 호출
		 		- 2. 제너릭 메소드의 인풋값이  타입을 유추할 수 있는 경우 : 메소드 호출시 타입을 생략 가능하다.
		 */
		
		// 제너릭 메소드 호출 :
		GenericMethod gm = new GenericMethod(); // 일반 클래스를 객체화
		String str1 = gm.<String> method("안녕");	// 제너릭 메소드 : 메소드를 호출시 타입을 지정해서 호출 
		String str2 = gm.method("오늘");
		
		System.out.println(str1);
		System.out.println(str2);
		
		Integer i1 = gm.<Integer> method(10);	// 제너릭 메소드 호출 
		Integer i2 = gm.method(10); 			// 제너릭 메소드 호출시 타입을 생략해서 호출
		
		System.out.println(i1);
		System.out.println(i2);
		
		
		System.out.println("=======================");
		Boolean bool1 = gm.<String> method2("오늘", "오늘");
		Boolean bool2 = gm.method2("오늘", "오늘");
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("========================");
		gm.<String, Integer> method3 ("국어", 80);
		gm. method3 ("영어", 90);
		
		gm. method3(404, "요청한 값을 찾을 수 없습니다.");
		gm. method3("학점의 평균은 : ", 88.8);
		
		System.out.println("=======================");
		gm.<String, Integer> method4(10) ;
		gm. method4("안녕") ;
		
		
		
	}

}
