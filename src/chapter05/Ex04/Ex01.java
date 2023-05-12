package chapter05.Ex04;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 	arr1 = 4행 100열의 2차원 배열 방을 생성하세요.
		 		0 : 10의 배수만 저장
		 		1 : 3의 배수만 저장
		 		2 : 3배수지만 6의 배수는 저장하지 말고
		 		3 : 7의 배수, 8의 배수 저장
		 */
		
		// 1. 배열 선언
		int[][] arr1 = new int[4][100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d ;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (i == 0) {
					a += 10;
					arr1[i][j] = a;

				} else if (i == 1) {
					b += 3;
					arr1[i][j] = b;

				} else if (i == 2) {
					do {
						c += 3;
					} while (c % 6 == 0);
					arr1[i][j] = c;

				} else if (i == 3) {
					
				}
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
