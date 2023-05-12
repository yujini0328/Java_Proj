package Chapter04.Ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 단축키 : Ctrl + Shift + F <== 코드를 자동정렬
		// 단축키 : Ctrl + Alt + 화살표 : 선택된 라인을 복사
		// 단축키 : Alt + 화살표 : 선택라인을 이동

		// 스캐너로 번호를 인풋 받아서 4번을 누를때까지는 계속 무한루프
		// do while, if, for-for

		Scanner sc = new Scanner(System.in);
		int a; // sc로 받은 값을 담은 변수

		do {
			System.out.println("=====================================================================");
			System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7배수단 출력 | 4. 프로그램 종료");
			System.out.println("=====================================================================");
			System.out.println("위의 번호를 입력하세요 :");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("1. 구구단 출력");
				System.out.println("===========================");
				for (int i = 1; i < 10; i++) {
					System.out.print(i + "단" + "\n");

					for (int j = 1; j < 10; j++) {
						System.out.printf("%d*%d=%d\t", i, j, i * j);
					}
					System.out.println();
					System.out.println();
				}
			} else if (a == 2) {
				System.out.println("2. 19단 출력");
				System.out.println("===========================");
				for (int i = 1; i <= 19; i++) {
					System.out.println(i + "단");

					for (int j = 1; j <= 19; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}

			} else if (a == 3) {
				System.out.println("3. 19단 중 7배수단 출력");
				System.out.println("===========================");
				for (int i = 1; i <= 19; i++) {
					if (i % 7 == 0) {
						System.out.println(i + "단");

						for (int j = 1; j <= 19; j++) {
							System.out.printf("%d * %d = %d\t", i, j, i * j);
						}
						System.out.println();
					}
				}
			} else if (a == 4) {
				System.out.println("4. 프로그램 종료");
				break;
			} else {
				System.out.println("경고 : 1 ~ 4까지의 정수만 입력");
			}

		} while(true);
		System.out.println("while문 탈출 - 프로그램 종료됨");
		sc.close();
	}
}
