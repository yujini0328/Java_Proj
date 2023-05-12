package Chapter04.Ex06;

public class Break_controll_Statement {
	public static void main(String[] args) {
		/*
		 * break 키워드 : 제어문 (if, switch), 반복문(for, while, do while) 실행 블럭을 탈출할 때 사용하는 키워드
		 * - if문 내에서 일반적으로 사용
		 */

		// 1. 단일 Loop 문에서 break 사용
		System.out.println("=======1. 단일 Loop 문에서 break 사용============");
		for (int i = 0; i < 10; i++) {
			System.out.println("break 사용전 출력" + i);
			break;
			// System.out.println("break 사용후 출력" + i); // 도달할 수 없는 코드
		}
		System.out.println("=================================");
		// 일반적으로 if 조건을 사용해서 break를 사용함.
		for (int i = 0; i < 10; i++) {
			System.out.println("break 사용전 출력" + i);
			if (i == 5)
				break;
			System.out.println("break 사용후 출력" + i); // 도달할 수 없는 코드
		}

		// 2. 다중(이중) Loop 문에서 break 사용 : 한 단계만 탈출
		System.out.println("=======2. 단일(이중) Loop 문에서 break 사용 : 한 단계만 탈출============");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + " , " + j);
				if (j == 2) {
					break; // 한 단계만 탈출
				}
			}
		}

		// 3. 다중(이중) Loop 문에서 점프해서 한번에 탈출 : LABLE를 사용해서 점프
		System.out.println("=======3. 다중(이중) Loop 문에서 점프해서 한번에 탈출 : LABLE를 사용해서 점프============");
		pos1: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.println(i + " , " + j);

				if (j == 2) {
					break pos1; // pos1 : 두 단계만 탈출
				}
			}
		}

		// 4. 변수 값을 조정해서 점프해서 탈출
		System.out.println("=======4. 변수 값을 조정해서 점프해서 탈출============");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.println(i + " , " + j);

				if (j == 2) {
					i = 50;	// 바깥쪽의 탈출할 조건을 false로 만들어서
					break ; // 한 단계만 탈출
				}
			}
		}
	}

}
