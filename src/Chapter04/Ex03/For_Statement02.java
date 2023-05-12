package Chapter04.Ex03;

public class For_Statement02 {
	public static void main(String[] args) {
		/*
		 	반복문 : for, while, do while
		 		-- 조건이 true 동안 계속 반복, 조건 false가 되면 실행블럭{ }을 빠져나옴.
		 		-- 조건이 무한 루프에 빠지지 않도록 잘 처리해야한다.
		 		-- 조건이 비어있으면 무한 루프에 빠지게됨.
		 		-- 서버가 메모리 꽉 차버려서 다운될 수 있다.
		 */
		
		// 1. for 문에 조건이 없는 경우 <== 무한 루프가 발생됨
		/*
		for(int i = 0; ; i++) {
			System.out.println();
		}
		*/
		
		// 2. for 문에서 초기값 생략, 조건 생략, 증가값도 생략된 경우 <== 무한 루프가 돌아감
		/*
		for (;;) {
			System.out.println("무한루프");
		}
		*/
		
		// 3. for문에서 조건을 잘못 처리하면 무한 루프에 빠질 수 있다.
			// if 조건 내에서 break; 문을 사용해서 무한루프를 빠져 나올 수 있다.
		for(int i = 1000; i <= 1000 ; i-- ) {	
			System.out.println(i);
			
			if( i == -500) {break;}		// i == -500일때 for 문을 빠져 나옴
		}

	}

}
