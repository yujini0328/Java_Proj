package Chapter17.Ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;



class Student{
	int stuID;			// 식별자
	String stuName;
	String stuPhone;
	
	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(stuID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
		return false;
		if(getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stuID, other.stuID);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Set<Student> hset = new HashSet();
		
		// 학생 객체 5개 생성해서 set에 넣을 경우 stuID 필드에 중복된 값을 넣지 못하도록 설정
		Student s1 = new Student(1111, "홍길동", "12345678" );
		Student s2 = new Student(2222, "김길동", "87654321" );
		Student s3 = new Student(3333, "옥길동", "23456789" );
		Student s4 = new Student(1111, "홍길동", "345678910" );
		Student s5 = new Student(1111, "홍길동", "45678912" );
		
		// Set에 값을 할당 : 
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		hset.add(s4);
		hset.add(s5);
		
		System.out.println(hset.size());
		
		System.out.println("=======Set에 저장된 값을 출력 : Iterator 사용 ========");
		Iterator<Student> ir = hset.iterator();
		while(ir.hasNext()) {
			
			Student student = ir.next();
			
			System.out.println(student);
			System.out.println(ir.next());
		
		}
		System.out.println("======Set에 저장된 값을 출력 : Enhanced For 사용========");
		for(Student k : hset) {
			System.out.println(k.stuID);
		
		}
		
	}
}
