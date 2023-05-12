package chapter05.Ex04;

public class Ex01_정답 {

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
	
	System.out.println("행의 갯수 : " + arr1.length);
	System.out.println("0행의 갯수 : " + arr1[0].length);
	System.out.println("1행의 갯수 : " + arr1[1].length);
	System.out.println("2행의 갯수 : " + arr1[2].length);
	System.out.println("3행의 갯수 : " + arr1[3].length);
	
	// 2. 배열의 각 행에 값을 저장
	for (int i = 0; i < arr1.length; i++) {
		if (i == 0) { // 10의 배수만 저장
			for (int j = 0, a = 10; j < arr1[i].length; j++) {
				arr1[i][j] = a;
				a += 10;
			}

		} else if (i == 1) { // 3의 배수만 저장
			for (int j = 0, a = 3; j < arr1[i].length; j++) {
				arr1[i][j] = a;
				a += 3;
			}

		} else if (i == 2) { // 3배수지만 6의 배수는 저장하지 말고
			for (int j = 0, a=3; j < arr1[i].length; a+=3) {
				
				if(a %6 == 0) continue;
				arr1[i][j] = a;
				j++;

			}

		} else if (i == 3) { // 7의 배수, 8의 배수 저장
			for (int j = 0, a = 1 ; j < arr1[i].length; a++) {
				if(a%7 == 0 || a%8 == 0) {
					arr1[i][j] = a;	
					j++;
				}
			}

		}

	}
	// 출력 구문
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1[i].length; j++) {
			System.out.print(arr1[i][j] + "\t");
		}
		System.out.println();
	}
}

}
