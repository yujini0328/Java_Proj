package Chapter04.Ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 스캐너로 번호를 입력 받고 각 프로그램을 출력하는 프로그램을 작성

		Scanner sc = new Scanner(System.in);
		int a;

		do {
			System.out.println("=========================================");
			System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
			System.out.println("2. 10 이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\"이라고 출력하는 프로그램");
			System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
			System.out.println("5. 프로그램 종료");
			System.out.println("=========================================");
			System.out.println("위의 번호를 입력하세요 :");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
				System.out.println("Type 1 : 증가값으로 홀수 출력");
				for (int i = 1; i <= 20; i += 2) {
					System.out.print(i + " ");
				}
				System.out.println("\n");
				
				System.out.println("Type 2 : if 조건으로 홀수 출력");
				for(int i = 1; i<=20; i++) {
					if(i%2 != 0) {
						System.out.print( i + " ");
					}
				}
				System.out.println("\n");
				
			} else if (a == 2) {
				System.out.println("2. 10 이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\"이라고 출력하는 프로그램");
				System.out.println("10이하의 정수를 입력하세요 :");
				int num = sc.nextInt();

				if (num > 10) {
					System.out.println("10 이하의 정수만 입력해주세요.");
					return;
				}

				for (int i = 1; i <= num; i++) {
					System.out.println(i + ". JAVA 프로그래밍");
				}
				
			} else if (a == 3) {
				int count = 0;	// 짝수만 카운트하는 변수
				System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
				System.out.println("10개의 정수를 입력하세요 :");

				for (int i = 0; i < 10; i++) {
					int num = sc.nextInt();
					if (num == 0) {
						continue;
					}
					if(num%2 == 0) {
						count++;
					}
//					if (num % 2 == 0) {
//						count++;
//					}
				}

				System.out.println("입력된 정수 중 짝수의 개수는 " + count + "개 입니다.");
				System.out.println("\n");

			} else if (a == 4) {
				System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
				System.out.println("성적을 몇개를 작성할지 정수로 넣어주세요 :");
				
				int b, c, sum = 0, count = 0;
				// b : 과목의 성적의 갯수
				// c : 점수를 담을 변수 : for 문을 사용해서 Scanner로 인풋 받는 변수
				// sum : 인풋 받은 점수를 합하는 변수, 
				// count : 과목의 갯수 == b
				b = sc.nextInt();
				System.out.println("각 과목의 점수를 입력하세요 :");
				
				for(int i = 0 ; i < b ; i++) {
					c = sc.nextInt();
					
					sum += c;	// sum = sum + c
					count++;
				}
				double avg = (double)sum/count;
				
				System.out.printf("입력한 과목수는 %d이고, 합계는 %d이고, 평균은 %.2f입니다.", count, sum, avg);

			} else if (a == 5) {
				System.out.println("5. 프로그램 종료");
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력 했습니다. 1 ~ 5사이의 정수를 입력하세요.");
			}

		} while (true);
		sc.close();
	}

}
