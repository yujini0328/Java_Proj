package chapter14.ex05;

class Aaa {
	void abc() throws ClassNotFoundException {
		bcd(); 
	}
	void bcd() throws ClassNotFoundException {
		cde(); 
	}
	void cde() throws ClassNotFoundException {
		//DB 연결시 사용 : 일반 예외 : 반드시 예외 처리 (1. 자신이 직접 철리, 2. throws로 미룬다. )
		Class cls = Class.forName("java.lang.Object1");	
		System.out.println("존재하는 클래스 입니다. ");
	}
}
public class Throws_Excption03 {

	public static void main(String[] args)  {

		Aaa a1 = new Aaa(); 
			try {
				a1.abc();
			} catch (ClassNotFoundException e) {
				
			//	e.printStackTrace();    //오류에 대한 자세한 정보를 출력해 달라 
			}

		System.out.println("프로그램 정상 종료됨");
	}

}
