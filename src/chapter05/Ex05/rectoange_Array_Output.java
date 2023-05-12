package chapter05.Ex05;

import java.util.Arrays;

public class rectoange_Array_Output {

	public static void main(String[] args) {
		/*
		 	2차원 - 정방형 배열 출력 방법
		 		- For - For 
		 		- Enhanced for - Enhanced For
		 		- Arrays.toString(배열 변수)
		 */

		// 배열 : 행 3 : 3, 열 : 100 (index : 0 ~ 99)
			// 0 행 : 1 ~ 100까지 정수
			// 1 행 : 2의 배수
			// 2 행 : 3의 배수
		
		// 1. 배열 선언
		int[][] arr1 = new int[3][100];
		
		System.out.println(arr1.length);	// 행의 갯수
		System.out.println(arr1[0].length); // 0행의 열의 객수
		System.out.println(arr1[1].length);	// 1행의 열의 객수
		System.out.println(arr1[2].length);	// 2행의 열의 객수
		
		// 2. 배열의 각 방에 값 넣기
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				for (int j = 0, a = 1; j < arr1[i].length; j++, a++) {
					arr1[i][j] = j+1;
//					arr1[i][j] = a;
				}

			} else if (i == 1) {
				for (int j = 0, a = 2; j < arr1[i].length; j++, a += 2) {
					arr1[i][j] = a;
//					arr1[i][j] = j+2;
				}

			} else if (i == 2) {
				for (int j = 0, a = 3; j < arr1[i].length; j++, a += 3) {
					arr1[i][j] = a;
				}
			}
		}
		// 출력
		System.out.println("====1. 이중 For 사용해서 2차원 정방형 배열 출력 ====");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====2. Enhance For 사용해서 2차원 정방형 배열 출력 ====");
		for(int[] k: arr1) {
			for( int a : k) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		System.out.println("====3. Arrays.toString 사용해서 2차원 정방형 배열 출력 ====");
		// Arrays.toString()
		System.out.println(Arrays.toString(arr1[0]));	//0행의 값
		System.out.println(Arrays.toString(arr1[1]));	//1행의 값
		System.out.println(Arrays.toString(arr1[2]));	//2행의 값
	}

}
