package Chapter08.Ex03;

class Student {			// default : 외부 패키지에서 접근 불가함.
	
	
	// 외부에서 접근이 불가한 필드, 외부 클래스에서 필드에 직접 값을 접근할 수 없도록 설정.
	private String stuName;
	private String stuAddr;
	private int age;
	private double weight;
	
	// getter, setter를 사용해서	: 접근 지정자를 public
		//private 필드에 값을 넣을때(setter)
		//private 필드에 값을 불러올때 getter를 사용.
	
	//stuName 필드에 대한 getter : 필드의 값을 리턴
	public String getStuName() {
		return stuName;
	}
	
	//stuName 필드에 대한 setter : 필드의 값을 외부에서 주입
	public void setStuName(String stuName) {
		this.stuName = stuName;
		
	}
	
	// getter
	public String getStuAddr() {
		return stuAddr;
	}
	// setter
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	// getter : age 필드에 대한
	public int getAge() {
		return age;
	}
	//setter : age 필드에 대한
	public void setAge(int age) {
		this.age = age;
	}
	// getter : weight에 대한
	public double getWeight() {
		return weight;
	}
	// setter : weight에 대한
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
}

public class Private {

	public static void main(String[] args) {
		
		Student s1 = new Student ();
		
		//private 필드에 직접 접근 불가 : 외부 클래스에서 : getter, setter를 사용해서 값을 출력, 입력
//		s1.stuName = "홍길동";					// private
//		System.out.println(s1.stuName);		// private

		//getter를 사용해서 필드의 내용을 출력
		System.out.println(s1.getStuName());
		
		// setter를 사용해서 필드의 값을 입력
		s1.setStuName("홍길동");
		System.out.println(s1.getStuName());
		
		// setter를 사용해서 필드의 값입력
		s1.setStuName("서울");
		s1.setAge(25);
		s1.setWeight(75.5);
		
		System.out.println("===============================");
		// getter를 사용해서 필드의 값을 출려
		System.out.println(s1.getStuName());
		System.out.println(s1.getStuAddr());
		System.out.println(s1.getAge());
		System.out.println(s1.getWeight());
	}

}
