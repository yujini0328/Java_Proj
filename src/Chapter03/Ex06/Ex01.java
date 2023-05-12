package Chapter03.Ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  EX01> 삼항 연산자를 사용해서 스캐너로 정수값을 인풋 받아서 인풋 받은 값이 홀수이면 
		  	   "지금 넣은 값은 0이고 [홀수/짝수] 입니다."
		  	   
		  EX02> 스캐너로 인풋 받은 값이 3,6,9의 배수이면 
		  " 지금 넣은 값은3, 6, 9의 배수입니다"
		  " 지금 넣은 값은3, 6, 9의 배수가 아닙니다"
		  	   
		  	   
		 */
		//1. EX01
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("정수를 입력하세요 :");
		num = sc.nextInt();
		System.out.printf((num%2==0) ? "지금 넣은 값은 %d이고, 짝수 입니다." : "지금 넣은 값은 %d이고, 홀수 입니다.", num);
		
		
		//2. EX02
		System.out.println("또 다른 정수값 하나를 넣어주세요 :");
		num = sc.nextInt();
		System.out.println((num%3==0 || num%6==0 || num%9==0) ? "369의 배수입니다." : "369의 배수가 아닙니다." );
	}

}
