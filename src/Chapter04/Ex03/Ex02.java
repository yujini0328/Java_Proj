package Chapter04.Ex03;

public class Ex02 {
	public static void main(String[] args) {
		/*
		  2중 for문을 사용해서 구구단 출력
		  
		  1단
		  1 * 1 = 1		1 * 2 =2	...... 1 * 9 = 9
		  2단
		  2 * 1 = 2		2 * 2 =4	...... 2 * 9 = 18
		  
		  
		  .....
		  9단
		  
		 */
		
		
		int i, j;		// i : 단을 출력하는 변수, // j : 1~9번까지 출력되는 변수
		
		for (i = 1; i<10; i++) {
			System.out.printf("%d단\n", i);
			System.out.println("=====================================================");
			
			for(j=1 ; j<10 ; j++) {
				System.out.printf(i + "*" + j + "=" + i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		/* 정답
		System.out.println("===print()로 출력======");
		for (i = 1; i<10; i++) {
			System.out.println(i + "단");
			
			for(j=1 ; j<10 ; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===printf()로 출력======");
		for (i = 1; i<10; i++) {
			System.out.println(i + "단");
			
			for(j=1 ; j<10 ; j++) {
				System.out.printf("%d*%d=%d \t", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
	}

}
