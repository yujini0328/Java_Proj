package chapter05.Ex03;

public class Ex02 {
	public static void main(String[] args) {
		/*
		  배열방 1000개를 생성, 정수 배열, 
		  4의 배수를 담는데 8의 배수는 담지 않도록 저장
		  
		  출력은 10개씩 끊어서 출력, For 문을 사용해서 출력
		 */
		
		// 배열 선언
		int[] arr1 = new int[1000];		// 배열방 1000개 생성, index : 0 ~ 999
		
		int i = 0; 	// 방번호
		int a;		// 값
		
		
		for(a = 0; true ; a++) {
			if (i == 1000) break;
			
			if(a%4 == 0 && a%8 != 0) {	// 4의 배수이면서 8의 배수가 아닐때
					arr1[i] = a;
					i++;		// i : 999
			}
		}
		for(i = 0 ; i < arr1.length ; i++) {
			System.out.print(arr1[i] + "\t");
			
			if( (i + 1) % 10 == 0) { 	// 10의 배수일때 enter
				System.out.println();
			}		}
	}

}
