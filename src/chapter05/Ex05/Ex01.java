package chapter05.Ex05;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 	2차원 정방형 배열 :
		 		4행 200열 배열 선언
		 			0 : 5의 배수
		 			1 : 3의 배수
		 			2 : 7, 8의 배수
		 			3 : 4와 7의 배수 : 28, 
		 */
		
		// 1. 배열 변수 선언
		int[][] arr1 = new int[4][200];

		// 2. 배열의 각 행에 값 입력
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {	// 5의 배수
				for (int j = 0, a = 5; j < arr1[i].length; j++, a += 5) { 
					arr1[i][j] = a;
				}

			} else if (i == 1) { // 3의 배수
				for (int j = 0, a = 3; j < arr1[i].length; j++, a += 3) { // 5의 배수
					arr1[i][j] = a;
				}

			} else if (i == 2) { // 7, 8의 배수
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 7 == 0 || a % 8 == 0) {
						arr1[i][j] = a;
						j++;
					}
				}

			} else if (i == 3) { // 4와 7의 배수 : 28
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 4 == 0 && a % 7 == 0) {
						arr1[i][j] = a;
						j++;
					}
				}
			}
		}
		// 3. 출력( For, Enhanced For, Arrays.toString())
		System.out.println("== 1. for 문을 이용한 출력 ==");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("== 2. Enhanced For 문을 이용한 출력 ==");
		for (int[] k : arr1) {
			for (int a : k) {
				System.out.print(a + "\t");
			}
			System.out.println();
		}
		
		System.out.println("== 3. Arrays.toString() 문을 이용한 출력 ==");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		System.out.println(Arrays.toString(arr1[3]));
	}
}
