package chapter14.Ex06;

public class Account_Test {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		// 현재 잔고 출력 // 필드의 접근 제어자가 private 이므로 getter를 사용해서 필드 정보를 출력
		System.out.println(a1.getBalance());
		
		// 예금 입금	
		a1.deposit(30000);	// 3만원 입금
		System.out.println("=========================");
		
		// 추가 예금
		a1.deposit(50000); 	// 5만원 입금
		
		// 출금 : 60000원 출금		// 일반 예외를 throws 호출하는 곳에서 예외를 처리하도록 적용
		System.out.println("========================");
		try {
			a1.withdrow(60000);
			
		} catch (BalanceException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("=======================");
		
		try {
			a1.withdrow(50000);
		} catch (BalanceException e) {	// 예외 발생
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} 	

	}

}
