package chapter05.Ex07;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 	main 메소드 args로 다음의 값을 넘깁니다.
		 	
		 	국어 60 영어 70 수학 80 음악 90 과학 70
		 	
		 	각 과목의 합계 : 
		 			평균 :
		 */
		// 1. for 문을 사용해서 배열로 들어오는 전체 내용을 출력
		for(int i = 0 ; i < args.length ; i++){
			System.out.println(args[i] + " ");
		}
		
		System.out.println("==for 문을 사용해서 각 과목의 점수를 int 형으로 변환후 출력 : 합계 : 평균 ===");
		
		int count = 0;
		int sum = 0;
		
		for(int i = 0 ; i < args.length ; i++) {
			if(i % 2 != 0 ) {		// i가 홀수일때만 실행
			sum += Integer.parseInt(args[i]);	// sum = sum + 정수
			count ++;
			}
		}
		System.out.printf("모든 과목의 함계는 %d이고 평균은 : %.2f입니다.", sum, ((double)sum/count));
		
//		String a = args[0];
//		String b = args[1];
//		String c = args[2];
//		String d = args[3];
//		String e = args[4];
//		
//		int aa = Integer.parseInt(args[0]);
//		int bb = Integer.parseInt(args[1]);
//		int cc = Integer.parseInt(args[2]);
//		int dd = Integer.parseInt(args[3]);
//		int ee = Integer.parseInt(args[4]);
//		
//		int sum = aa + bb + cc + dd + ee;
//		double avg = sum/5.0;
//		
//		
//		System.out.println("각 과목의 합계 : " + sum);
//		System.out.println("각 과목의 평균 : " + avg);
		
		
	}

}
