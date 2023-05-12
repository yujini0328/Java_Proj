package Chapter04.Ex05;

import java.util.Scanner;

public class Do_While_Statement02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		do {
			System.out.println("=================================");
			System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("위의 번호를 입력하세요 :");
			a = sc.nextInt();
			
			if(a==1) {
				System.out.println("1. 평균 출력");
			}else if(a==2) {
				System.out.println("2. 합계 출력");
			}else if(a==3) {
				System.out.println("3. 이름 출력");
			}else if(a==4) {
				System.out.println("4. 프로그램 종료 ");
			}else {
				System.out.println("잘못 입력했습니다.(1~4번까지의 정수를 입력하세요.");
			}
		} while (true);
	}

}
