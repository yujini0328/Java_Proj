package chapter14.Ex06;

public class Account {
	
	
	private long balance = 10000;		// 은행의 예금된 잔고 : 10000원 
	
	// 기본 생성자
	Account() {}
	
	// getter : 메소드를 호출시 필드의 정보를 출력
	public long getBalance () {
		return balance;
	}
	
	// 예금을 입금/출금하는 메소드 // money +가 인풋되면 예금을 추가, -가 인풋되면 예금을 빼는것, 인풋 값을 받아서 잔고에 적용
	public void deposit (int money) {
		System.out.println("입근전 잔고는 " + balance + "원이고 " + money + "원이 입급이 되었습니다.");
		balance += money;		// balance = balance + money;
		System.out.println("총 예금 잔고는 : " + balance + "원입니다.");
	}
	
	// 예금을 출금하는 메소드 : // money를 인풋받아서 예금잔고보다 작으면 BalanceException("예금잔고가 부족합니다")
	public void withdrow(int money) throws BalanceException {
		// 코드완성
		if(balance < money) {	// 출금액이 예금액보다 많으면 예외를 처리함.
			
			System.out.println("현재 예금 잔고는 : " + balance + " 출금액은 : " + money);
			throw new BalanceException("예금 잔고가 부족합니다. " + (money -balance) + "원 모자랍니다.");
			// 예외를 강제 발생(일반예외)
		}else {
			balance -=money;	// balance = balance - money
			
			System.out.println("출금후 남은 잔고는 : " + balance);
		}
	}
}
