package Chapter10.Ex06;

class Student{
	String name;
	
	// 합계와 평균을 출력하는 메소드 : 부모 클래스의 메소드 : 실행 코드가 없음, 자식 클래스에서 오버라이딩해서 구현 코드룰 생성
	void sum_avg() {
		
	}
}
class Student_Sub extends Student{
	int kor;
	int eng;
	int math;
	
	// 1. 생성자로 매개변수 값을 받아서 각 필드의 값을 할당. name, kor, eng, math
	Student_Sub(){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 2. 필드의 값을 모두 합하고, 평균을 출력, 각 객체의 점수의 합계와 평균을 구하는 메소드
	@Override
	void sum_avg() {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		 System.out.printf("%s의 점수 합계는 %d점이고 평균은 %.2f점 입니다.\n", name, sum, avg);
	    }
}


public class Ex01 {

	public static void main(String[] args) {
		// 각 객체의 필드의 값 할당은 생성자 호출시 매개변수로 값을 넣도록 하세요.
			/*
			 	홍길동 70 88 77
			 	이순신 80 68 87
			 	김똘똘 60 86 87
			 	홍길순 77 56 80
			 	강감찬 55 66 77
			 */
		Student_Sub s1 = new Student_Sub();
		s1.name = "홍길동";
		s1.kor = 70;
		s1.eng = 88;
		s1.math = 77;
		
		Student_Sub s2 = new Student_Sub();
		s2.name = "이순신";
		s2.kor = 80;
		s2.eng = 68;
		s2.math = 87;
		
		Student_Sub s3 = new Student_Sub();
		s3.name = "김똘똘";
		s3.kor = 60;
		s3.eng = 86;
		s3.math = 87;
		
		Student_Sub s4 = new Student_Sub();
		s4.name = "홍길순";
		s4.kor = 77;
		s4.eng = 56;
		s4.math = 80;
		Student_Sub s5 = new Student_Sub();
		s5.name = "강감찬";
		s5.kor = 55;
		s5.eng = 66;
		s5.math = 77;

		// Student 타입의 sum_avg() 호출시 오버라이딩된 메소드 호출
		s1.sum_avg();
		s2.sum_avg();
		s3.sum_avg();
		s4.sum_avg();
		s5.sum_avg();
		
		System.out.println("===========================");
		// 배열에 넣고
		Student[] arr = new Student[] {s1, s2, s3, s4, s5};
		// for 문을 사용해서 배열의 메소드 호출
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].sum_avg();
		}
		
		System.out.println("==========================");
		// for 문을 사용해서 아래와 같이 출력되도록 구문 작성
		Student_Sub ss1 = new Student_Sub();
		Student_Sub[] arr1 = new Student_Sub[] {s1, s2, s3, s4, s5} ;
		
		// 각 과목의 합을 구하는 변수 선언
		int ksum = 0;
		int esum = 0;
		int msum = 0;
		
		
		// 배열로 변수 선언
		for(int i = 0 ; i < arr1.length ; i++) {
			ksum += arr1[i].kor;
			esum += arr1[i].eng;
			msum += arr1[i].math;
		}
		System.out.println("모든 사용자의 국어 점수의 총합 : " + ksum);
		System.out.println("모든 사용자의 영어 점수의 총합 : " + esum);
		System.out.println("모든 사용자의 수학 점수의 총합 : " + msum);
		
		System.out.println("====== 정답 ========");
		int[] sum = new int[3];
		for(int i = 0 ; i < arr.length ; i++) {
			sum[0] += ((Student_Sub)arr[i]).kor;
			sum[1] += ((Student_Sub)arr[i]).eng;
			sum[2] += ((Student_Sub)arr[i]).math;
		}
		System.out.println("모든 사용자의 국어 점수의 총합 : " + ksum);
		System.out.println("모든 사용자의 영어 점수의 총합 : " + esum);
		System.out.println("모든 사용자의 수학 점수의 총합 : " + msum);
		
		
		// 모든 사용자의 국어 점수의 총합 :
		// 모든 사용자의 영어 점수의 총합 :
		// 모든 사용자의 수학 점수의 총합 :
		
	}
}
