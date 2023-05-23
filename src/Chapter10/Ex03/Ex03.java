package Chapter10.Ex03;

class Customer{
	
	void memberInfo() {
		System.out.println("회원님은 기본 회원님입니다.");
	}
}
class Gold extends Customer{

	@Override
	void memberInfo() {
		System.out.println("회원님은 골드 회원님입니다.");
	}

}
class Silver extends Customer{
	
	@Override
	void memberInfo() {
		
		System.out.println("회원님은 골드 회원님입니다.");
	}
}
class Bronze extends Customer{
	
	@Override
	void memberInfo() {
		
		System.out.println("회원님은 골드 회원님입니다.");
	}
}

public class Ex03 {
	

	public static void main(String[] args) {
		
		// 자식을 객체화해서 부모 타입으로 지정
		// 부모의 메소드 호출시 오버라이딩된 메소드 출력
		// for / Enhanced For 문에 넣어서 출력
		Customer c1 = new Customer();
		Customer c2 = new Gold();
		Customer c3 = new Silver();
		Customer c4 = new Bronze();
		
		c1.memberInfo();
		c2.memberInfo();
		c3.memberInfo();
		c4.memberInfo();
		
		System.out.println("=========for 문==============");
		Customer arr[] = new Customer[] { c1, c2, c3, c4 } ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].memberInfo();
		}
		
		
		System.out.println("=====Enhanced For 문======");
		for(Customer k : arr ) {
			k.memberInfo();
		}

	}

}
