package Chapter10.Ex03;
// 상속, 메소드 오버라이딩(인스턴스 메소드), 업캐스팅, 다운캐스팅, 배열에 객체를 넣고 빼기 ...

// 부모 클래스 : 자식클래스의 공통적으로 적용되는 필드, 매소드 정의
class Human {	// (부모) 사람 <==> (자식) 학생, 교수, 근로자
	
	// 기본 생성자가 생략되어 있다.
	// Human () {}
	
	//필드 : 상속받을 자식 클래스의 공통으로 사용하는 속성을 정의
	String name;
	int age;
	
	
	// 메소드 : 인스턴스 메소드
	void eat () {
		System.out.println("Human - 모든 사람은 잠을 잡니다.");
	}
}


// 자식 클래스
class Student  extends Human {
	// 기본 생성자가 생략되어 있다. <= 상속 관계에서는 기본 생성자 내부에 부모 클래스의 기본 생성자를 호출
	Student () {
		super();		// 부모 클래스의 생성자를 호출 : 생략되어 있다.
	}
	
	// Human의 필드와 메소드가 
	// 필드
	int stuID;		// 학생에게만 적용되는 필드
	
	// 메소드 : 학생 클래스에서만 적용되는 메소드
	void goToSchool () {
		System.out.println("Student - 학생은 학교에 갑니다.");
	}
	// 메소드 오버라이딩 : 부모 클래스에서 정의한 메소드를 자식 클래스가 재정의
	@Override
	void eat() {
		System.out.println("Student - 학생은 식당에서 식사를 합니다.");
	}
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	 
}

class Professor extends Human{
	// Human의 필드와 메소드
	
	int professorID;
	
	void goToTeah () {
		System.out.println("교수는 학생들을 가르치러 학교에 갑니다.");
	}
	
	// 메소드 오버라이딩 : Human의 eat ()을 재정의
	@Override
	void eat() {
		System.out.println("Professor - 교수는 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Professor [professorID=" + professorID + ", name=" + name + ", age=" + age + "]";
	}
	
}

class Worker extends Human{
	// Human의 필드와 메소드를 상속
	
	int workerID;
	void goToWork () {
		System.out.println("근로자는 일하러 일터로 출근합니다.");
	}
	
	// 메소드 오버라이딩
	@Override
	void eat() {
		System.out.println("Woker - 근로자는 맛있게 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Worker [workerID=" + workerID + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		// 1. 상속에서 부모 클래스의 필드와 메소드 상속 확인
		
		// Human 클래스 h1 객체 생성 : h1 : Human 타입만 내포하고있음.
		Human h1 = new Human();
			// h1 : Human의 필드와 메소드만 접근
			// h1은 Human을 객체화했기 때문에 Student / Professor / Worker 클래스를 내포하고 있지 않아서 다운 캐스팅 할 수 없다.
		
		// 다운 캐스팅 오류 발생 : 명시해야 한다. <== 주의 : 런타임 오류 발생 : instanceof를 사용해서 해당 타입이 존재하는 확인 후 캐스팅 필요.
		System.out.println(h1 instanceof Human);	// True
		System.out.println(h1 instanceof Student); 	// False
		System.out.println(h1 instanceof Professor); 	// False
		System.out.println(h1 instanceof Worker); 	// False
		
		// 오류 : 컴파일 오류(이클립스에서 오류를 발생 시킴), 런타임오류(실행시 오류발생)
		if( h1 instanceof Student ) {
		Student ss1 = (Student) h1;	
		}else {
			System.out.println("h1에는 Student 타입이 존재하지 않습니다.");
			
		}
		
		System.out.println("=================================");
		// Student 클래스 s1 객체를 생성 
		Student s1 = new Student();		// s1 : Human / Student 내포하고 있고, Student 타입으로 지정되어 있다.
			// s1 : Human의 필드와 메소드, Student 필드와 메소드를 모두 접근 가능
		//s1은 Human의 필드 메소드, Student 필드 메소드 모드 접근
		s1.name = "홍길동";		// Human
		s1.age = 20;			// Human
		
		s1.stuID = 1234;		// Student에 필드
		
		
		Human s2 = new Student();		// s2 : Human / Student 내표하고 있고, Human 타입으로 지정되어 있다.
			// s2 : Human의 필드와 메소드만 접근
		
		s2.name = "이순신";
		s2.age = 30;
		
		// s2는 Human / Student 타입으로 이동이 가능하다.
		
		// s2 : Human ====> Student : 다운 캐스팅 : 명시 
		System.out.println(s2 instanceof Student ); 	// true
		
		
		Student ss2 = null;
		
		if(s2 instanceof Student) {
			ss2 = (Student) s2;
		}
		
		// ss2 : Human / Student 내포하고 있고 Student 타입으로 다운캐스팅 : Human / Student 필드 메소드를 모두 사용 가능
		ss2.name = "세종대왕";	// Human
		ss2.age = 50;			// Human
		
		ss2.stuID = 2345;		// Student
		
		// 업캐스팅 : ss2 : Student (자식) ===> Human(부모) : 명시하지 않아도 자동으로 캐스팅됨
		System.out.println(ss2 instanceof Human); 	// true
		
		Human hh1 = ss2;	// 업캐스팅은 캐스팅시 instanceof를 사용하지 않아도 됨... 컴파일단계에서 오류가 발생됨.
		
		// 자식을 객체화해서 부모 타입으로 지정 후 배열 / 컬렉션에 저장 후에 끄집어 내서 출력함.
		
		Student s10 = new Student();	// hs : Human / Student 
		Professor p10 = new Professor();	// hp : Human / Professor 
		Worker w10 = new Worker();	// hw : Human / Worker
		
		// 각 객체의 필드의 값을 입력
		// s10
		s10.name = "김똘똘";
		s10.age = 30;
		s10.stuID = 1234;
		
		// p10
		p10.name = "김교수";
		p10.age = 40;
		p10.professorID = 2345;
		
		// w10에 값입력
		w10.name = "홍근로자";
		w10.age = 20;
		w10.workerID = 3456;
		
		// 위의 객체를 배열 / 컬렉션(ArrayList/Vector / Set / Map)에 넣어서 처리함.
		
		// 배열 / 컬렉션의 저장되는 것은 동일한 타입으로 지정되어야 한다.
		// s10 : Student, p10 : Professor, w10 : Worker		<== Human
		
		// s10, p10, w10 자동으로 upcasting 되어서 Human 타입으로 저장됨
		Human[] arr = new Human[] {s10, p10, w10};
		
		// arr[0] : Human / Student 
		// arr[1] : Human / Professor
		// arr[2] : Human / Worker
		
		// 배열의 각 방의 값을 끄집어 내어서 변수에 재할당
		Human h20 = arr[0];
		Human h21 = arr[1];
		Human h22 = arr[2];
		
		// 배열의 각 방의 내용을 끄집어 낼때 다운 캐스팅 하면서 끄집어 낸다.
		Student s20 = (Student) arr[0]; 	// Human ==> Student 으로 다운캐스팅
		Professor s21 = (Professor) arr[1]; // Human ==> Professor로 다운캐스팅
		Worker s22 = (Worker) arr[2];

		// 각 객체의 필드의 내용을 출력
		System.out.println("// Student 객체 정보 출력");
		System.out.println(s20);
		System.out.println("// Professor 객체 정보 출력");
		System.out.println(s21);
		System.out.println("// WorKer 객체 정보 출력");
		System.out.println(s22);
		
		//3. 메소드 오버 라이딩 테스트
		
		// 3-1 . Human 객체 생성 후 eat () 메소드 호출
		Human h30 = new Human();	// h30 : Human 
		h30.eat();		// Human 클래스의 메소드 호출
		
		//3-2. Student 객체 생성시 Student 타입으로 지정
		Student s30 = new Student (); 		// s30은 Human / Student
		s30.eat();		// Student 클래스의 eat(); 호출
		
		//
		Professor p30 = new Professor();
		Worker w30 = new Worker();
		
		p30.eat();		// Professor 클래스의 eat();
		w30.eat();		// Worker 클래스의 eat();
		
		
		System.out.println("==== 오버라이딩된 메소드가 출력됨 ====");
		// 자식 클래스를 생성하면서 부모 클래스 타입으로 지정 후 오버라이딩된 메소드 호출
		Human h40 = new Student();		// h40 : Human / Student,
		Human h41 = new Professor();
		Human h42 = new Worker();
		
		// Human 클래스의 eat() 메소드 호출
		h40.eat();		// Human 클래스의 eat() 호출시, Student 클래스의 오버라이딩된 eat()이 작동됨
		h41.eat();		// Human 클래스의 eat() 호출시, Professor 클래스의 오버라이딩된 eat()이 작동됨
		h42.eat();		// Human 클래스의 eat() 호출시, WorKer 클래스의 오버라이딩된 eat()이 작동됨
		
		
		// 부모의 메소드(eat())를 호출시 자식 클래스의 오버라이딩된 메소드가 출력됨(eat()) <=== 매우 매우 중요함.
		
		
		
		
		
		
		
		
		
	}

}
