package chapter05.Ex07;

public class Ex02 {
	public static void main(String[] args) {
		// main method의 배열 변수 args로 실수 값 넣어서 계산하기
		// ars : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		// for 문을 사용해서 처리
		// 합계 : <실수를 더한 합계>
		
		// For 문을 사용해서 args 배열에 담긴값 출력
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("==========================");
		
		double sum = 0 ;
		for( int i = 1 ; i < args.length ; i++) {
			sum += Double.parseDouble(args[i]);
		}
		
		System.out.printf("합계는 : %.3f" + sum);
		
//		String a = args[0];
//		String b = args[1];
//		String c = args[2];
//		String d = args[3];
//		String e = args[4];
//		String f = args[5];
//		String g = args[6];
//		String h = args[7];
//		
//		Double aa = Double.parseDouble(a);
//		Double bb = Double.parseDouble(b);
//		Double cc = Double.parseDouble(c);
//		Double dd = Double.parseDouble(d);
//		Double ee = Double.parseDouble(e);
//		Double ff = Double.parseDouble(f);
//		Double gg = Double.parseDouble(g);
//		Double hh = Double.parseDouble(h);
//		
//		for(int i = 0 ; i < args.length ; i++){
//			System.out.println(args[i]);
//		}
		// git 수정 업로드
		
	}

}
