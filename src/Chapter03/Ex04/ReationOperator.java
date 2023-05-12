package Chapter03.Ex04;

public class ReationOperator {

	public static void main(String[] args) {
		/*
		 크기비교 연산자 ( > , < , >=, <=, !=, ==) vs 등가 비교 연산자 ( ==, != )	<== 결과를 true, false
		 */
		
		//1. 크기 비교 연산자
		System.out.println("1. ===========================");
		System.out.println( 5 > 2); 	//true
		System.out.println( 5 < 2); 	//false
		System.out.println( 5 >= 2); 	//true
		System.out.println( 5 <= 2); 	//false
		System.out.println( 5 <= 2); 	//true
		
		// 2. 동가 비교 연산자( == , != )	<== stack 메모리의 값을 비교, 기본 자료형에서 사용,
				// 참조 자료형의 값을 비교할때는 str1.equals(str2) : Heap 영역의 값을 비교.
		int a = 5;
		int b = 2;
		int c = 5;
		
		
		System.out.println("2. ===========================");
		System.out.println(a == b);		// false
		System.out.println(a != b); 	// true
		
		System.out.println(a == c); 	// true
		System.out.println(a != c);
		
		
		//3. 참조 자료형일때 등가 연산자의 비교 : 
				// 변수 값은 stack에 저장이되고 Heap의 저장된 값의 주소를 가지고 있다.
				// 참조 자료형일때 Heap에 저장된 값을 비교할때는 equals()를 사용한다.
		System.out.println("3. ===========================");
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1); 
		System.out.println(str2);
		
		
		// == stack의 str1의 주소(100), str2(200)
		System.out.println(str1 == str2); 	// false가 출력됨
		
			// 참조 자료형일때 Heap에 저장된 값을 비교하는 메소드 equals()를 사용해서 비교함.
		System.out.println(str1.equals(str2));
		
	}
}
