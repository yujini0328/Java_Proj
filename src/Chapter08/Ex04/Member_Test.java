package Chapter08.Ex04;

public class Member_Test {
	public static void main(String[] args) {
		// Member 객체 생성후 setter로 주입, 
		Member m1 = new Member();
		
		//setter로 값을 주입
		m1.setMemberNo(1L);
		m1.setMemberID("Himedia");
		m1.setMemberPass("1234");
		m1.setMemberEmail("aa@aaa.com");
		m1.setMemberAge(23);
		
		m1.getMemberNo();
		m1.getMemberID();
		m1.getMemberPass();
		m1.getMemberEmail();
		m1.getMemberAge();
		
		// getter로 필드의 값을 출력함.
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberID());
		System.out.println(m1.getMemberPass());
		System.out.println(m1.getMemberEmail());
		System.out.println(m1.getMemberAge());
		
		
	}

}
