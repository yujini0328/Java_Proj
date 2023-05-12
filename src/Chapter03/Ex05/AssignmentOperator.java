package Chapter03.Ex05;

public class AssignmentOperator {
	public static void main(String[] args) {
		/*
		 대입 연산자 : +=, -=, *=, /=
		 	기존 연산의 축약된 표현 
		 		val1+=10;		<===>		val1 = val1 + 10;
		 		
		 */
		
		//1. 대입 연산자의 축약 표현
		System.out.println("1. ===========================");
		int val1 = 3;
		val1 = val1 + 3;	// val1 +=3;
		
		System.out.println(val1); 
		
		int val2 = 3;
		val2+=3;		// val2 = val2 + 3;
		System.out.println(val2);
		
		
		//
		System.out.println("2. ===========================");
		int val3 = 10;
		val3 = val3 - 15;
		System.out.println(val3);
		
		int val4 = 10;
		val4-=15;				// val4 = val4 - 15;
		System.out.println(val4);
		
		
	}

}
