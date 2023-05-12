package chapter05.Ex07;

public class Main_Mathod_Argument02 {
	public static void main(String[] args) {
		// main 메소드의 input 매개변수로 실수 값을 넘겨 받아 계산
		
		// 1. 직접 넘어오는 변수를 받아서 할당
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		System.out.println(a + b + c); 	// + : 연결 연산
		
		// String에 저장된 실수를 double 형식으로 변환
		Double aa = Double.parseDouble(a);
		Double bb = Double.parseDouble(b);
		Double cc = Double.parseDouble(c);
		
		System.out.println(aa+bb+cc);
		
		
		System.out.println("=======main 메소드 배열에 들어오는 값을 for 사용해서 출력========");
		
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]);	// string 타입
		}
		
		
	}

}
