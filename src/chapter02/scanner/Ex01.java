package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fname;
		String mname;
		String sname;
		String name;
		int fage;
		int mage;
		int sage;
		int age;
		
		System.out.println("아버지의 이름을 입력하세요>>>");
	    fname = sc.next();
	    System.out.println("어머니의 이름을 입력하세요>>>");
	    mname = sc.next();							
	    System.out.println("형제의 이름을 입력하세요>>>");
	    sname = sc.next();							
	    System.out.println("자신의 이름을 입력하세요>>>");
	    name = sc.next();	
	    System.out.println("아버님 나이를 입력 하세요>>>");
	    fage = sc.nextInt();
	    System.out.println("어머님 나이를 입력 하세요>>>");
	    mage = sc.nextInt();
	    System.out.println("형제 나이를 입력 하세요>>>");
	    sage = sc.nextInt();
	    System.out.println("자신의 나이를 입력 하세요>>>");
	    age = sc.nextInt();
		
	    int sum = fage + mage + sage + age;
	    double avg = sum / 4.0;
	    
	    System.out.printf("아버지 이름은 %s이고, 어머니 이름은 %s이고, 형제 이름은 %s이고, 저의 이름은 %s입니다.\n",
	    		fname, mname, sname, name);
	    System.out.printf("저의 가족 나이의 합은 %d살이고, 평균은 %.2f입니다.", sum, avg);
	    
		
		
		// 1. Scanner 등록
		// 2. 아버님 이름, 어머님 이름, 형제이름, 자신이름 : sc.next();
			//아버님나이, 어머님 나이, 형제 나이, 자진의 나이 : sc.nextInt();
		// 3. 스캐너로 받은 변수의 값을 출력
		// 4. 전체 나이의 합계, 평균을 구해서 소숫점이하 2자리까지만 출력
	    
	    
	    //Ex02
	    // 1. 스캐너 등록
	    // 2. 우리 가족의 이름(String) 및 몸무게(double)를 인풋 받고, 몸무게의 합과, 평균을 구해서 출력하는 프로그램을 작성
	    		// sc.nextDouble();
		
		
		
		
		
	}

}
