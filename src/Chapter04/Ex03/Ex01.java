package Chapter04.Ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  스캐너로 1 ~ 9 까지의 정수를 인풋 받아서 for 문을 사용해서
		  인풋 받은 단수를 출력
		  1. println () 으로 출력
		  2. printf ()
		  
		 */
		
		System.out.println("=====1.println()으로 출력");
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("정수를 입력하세요 :");
		a = sc.nextInt();
		
		for(int i = 1 ; i < 10 ; i ++) {
			System.out.println( a + "*" + i + "=" + a*i);
		}
		System.out.println("=====2.printf()으로 출력");
		
		for(int i = 1 ; i < 10 ; i ++) {
			System.out.printf("%d*%d=%d\n", a, i, a*i);
		}
		
		/* 정답
		int i, j;
		
		System.out.println("출력할 단수(1단 ~ 9단) 정수를 입력하세요 :");
		i = sc.nextInt(); 	// 콘솔로부터 단수를 입력받아 i 변수에 값 할당.
		
		System.out.println("======println()으로 출력");
		for(j=1 ; j<10 ; j++) {
			System.out.println(i + "*" + j + "=" + i*j); 
		}
		
		System.out.println("======printf()으로 출력");
		for(j=1 ; j<10 ; j++) {
			System.out.printf("%d * %d = %d", i, j, i*j); 
		}
		*/

		
		

			
	}

}
