package Chapter04.Ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 1. Scanner로 정수 1, 2, 3을 인풋 받아서
		 	1 : "금메달 입니다."
		 	2 : "은메달 입니다."
		 	3 : "동메달 입니다."
		 	그외 정수를 인풋 받으면 : "메달이 없습니다."
		 	======================================
		 2. Scanner로 문자열 "gold", "silver", "bronze"
		 	"gold" : "금메달입니다."
		 	"silver" : "은메달입니다."
		 	"bronze" : "동메달입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int rank;
		
		System.out.println("순위를 입력하세요 :");
		rank = sc.nextInt();
		
		sc.close();
		
		switch (rank) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		System.out.println("=====================================");
		
		String medal;
		System.out.println("메달을 입력하세요.(gold/silver/bronze) :");
		medal = sc.next();
		
		switch (medal) {
		case "gold":
			System.out.println("금메달입니다.");
			break;
		case "silver":
			System.out.println("은메달입니다.");
			break;
		case "bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			break;
		}
		
		
		
		
	}

}
