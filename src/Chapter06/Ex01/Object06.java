package Chapter06.Ex01;

class Student2{
	// 기본생성자
	public Student2() {}
	
	// 필드
	String sName;	// 학생이름
	int sAge;		// 학생나이
	String sAddr;	// 학생주소
	String sEmail;	// 학생메일주소
	
	// 메소드 : 필드의 내용을 출력하는 메소드
	public void print() {
		System.out.println("이름 : " + sName);
		System.out.println("나이 : " + sAge);
		System.out.println("주소 : " + sAddr);
		System.out.println("메일주소 : " + sEmail);
		
	}
	
}


public class Object06 {

	public static void main(String[] args) {
		// kim 객체 : 김길동/20/서울/aaa@aaa.com
		// lee 객체 : 이순신/30/부산/bbb@bbb.com
		// hong 객체 : 홍길동/45/광주/ccc@ccc.com
		
		// 각 객체의 필드의 값 입력후, 배열에 넣어서 저장후 끄집어 내어서 다시 출력 .....
		
		System.out.println("======kim 객체=====");
		//1. 객체 생성
		Student2 kim = new Student2();
		
		kim.sName = "김길동";
		kim.sAge = 20;
		kim.sAddr = "서울";
		kim.sEmail = "aaa@aaa.com";
		
		kim.print();
		
		System.out.println("======Lee 객체=====");
		Student2 Lee = new Student2();
		
		Lee.sName = "이순신";
		Lee.sAge = 30;
		Lee.sAddr = "부산";
		Lee.sEmail = "bbb@bbb.com";
		
		Lee.print();
		
		System.out.println("======hong 객체=====");
		Student2 hong = new Student2();
		
		hong.sName = "홍길동";
		hong.sAge = 45;
		hong.sAddr = "광주";
		hong.sEmail = "ccc@ccc.com";
		
		hong.print();
		
		
		System.out.println("===== 객체를 배열에 저장 후 출력 ====");
		
		// 2. 배열을 선언하면서 바로 배열에 값을 할당.
		Student2[] arr1 = new Student2[] {kim, Lee, hong};
		
//		arr1[0] = kim;
//		arr1[1] = Lee;
//		arr1[2] = hong;
		System.out.println(kim);
		System.out.println(Lee);
		System.out.println(hong);
		
		// 배열의 각 방의 저장된 객체를 끄집어 냄.
		Student2 a1 = arr1[0];	// Kim
		Student2 a2 = arr1[1];	// Lee
		Student2 a3 = arr1[2];	// hong
		
		System.out.println("===================");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println("====================");
		a1.print();
		System.out.println("====================");
		a2.print();
		System.out.println("====================");
		a3.print();
	}
}
