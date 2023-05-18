package Chapter08.Ex04;

public class Student_Test {

	public static void main(String[] args) {
		
		//Student 객체 생성
		Student s1 = new Student();
		
		s1.setStuName("홍길동");
		s1.setStuEmail("aaa@aaa.com");
		s1.setStuAge(10);
		s1.setStuWeight(55.55);
		
		// getter로 필드의 정보를 출력
		s1.getStuName();
		s1.getStuEmail();
		s1.getStuAge();
		s1.getStuWeight();
		
		// toString () 호츨 
		
		System.out.println(s1.getStuName());
		System.out.println(s1.getStuWeight());
		System.out.println(s1.getStuAge());
		System.out.println(s1.getStuName());
		
		

	}

}
