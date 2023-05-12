package chapter02.scanner;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double fweight;
		double mweight;
		double sweight;
		double weight;
		
		
		System.out.println("아버지의 몸무게를 입력하세요 : ");
		fweight = sc.nextDouble();
		System.out.println("어머니의 몸무게를 입력하세요 : ");
		mweight = sc.nextDouble();
		System.out.println("형제의 몸무게를 입력하세요 : ");
		sweight = sc.nextDouble();
		System.out.println("자신의 몸무게를 입력하세요 : ");
		weight = sc.nextDouble();
		
		
		double sum = fweight + mweight + sweight + weight;
		double avg = sum/4.0;
		
		System.out.printf("저의 가족의 몸무게 합은 %.2f이고, 평균은 %.2f입니다.", sum, avg);
		
		
		
		
		
		
		
	}

}
