package chapter05.Ex01;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  배열 방 100개를 생성후 3의 배수만 저장
		  
		  
		 */
		
		int[] arr1 = new int[100];
		
		for(int i = 0 ; i < 100 ; i++) {
			arr1[i] = i+0;
			if(i%3==0) {
//				System.out.println(i + "." + arr1[i]);
			}else {
				arr1[i] = 0;
			}
			System.out.println(i + "번 인덱스 : " + arr1[i]);
		}
		
		System.out.println("===== 정답 =====");
		
		// 1. 배열 변수 선언 및 방크기 지정
		int c = 100;
		
		int[] arr2 = new int[c];		// index 0~99
		
		System.out.println(arr1.length);	// 방의 갯수를 출력
		
		int a = 0;		// 3의 배수를 저장하는 변수
		
		// arr1 배열의 각 방에 값을 저장하는 for
		for(int i =0; i < arr2.length ; i++) {
			a += 3;		// a = a+3;
			arr2[i] = a;
		}
		
		// arr1 배열의 각 방에 값을 출력하는 for
		System.out.println("=======for 문을 사용해서 출력===========");
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println("arr2 [" + i + "]" + arr2[i]);
		}
		
		System.out.println("=========Enhanced For : 향상된 For==========");
		// 배열의 첫 번째 방부터 마지막 방까지 자동으로 그 값을 출력할 때 사용
		for( int k : arr2) {
			System.out.print(k + " ");
		}
		System.out.println("\n \n");
		
	}

}
