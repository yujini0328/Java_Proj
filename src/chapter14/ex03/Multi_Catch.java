package chapter14.ex03;

public class Multi_Catch {

	public static void main(String[] args) {
		/*
		     Multi Catch : 프로그램내에서 여러 예외를 하나의 Try Catch 를 사용해서 처리 하는 방법 
		        1. 각 각 처리하는 방법 
		        2. Try 블락에 여러 예외를 적용하고 각 각의 catch 블락을 만들어서 처리 
		        3. Try 블락에 여러 예외를 적용하고, Exception 통합적으로 한꺼번에 처리하는 방법
		 */
		
		//1. 각 각 처리하는 방법 : try catch 를 매번 적용함. 
		try {
			System.out.println( 3 / 0 );		//예외 : ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException - 발생 ");
		}
		
		try {
			int num = Integer.parseInt("10!");  //예외 : NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException - 발생 ");
		}
		
		System.out.println("===2. ===============================");
		// 2. try 블락에 여러 예외를 한꺼번에 처리 
		int num = 0 ; 
		
		try {
			
			System.out.println( 3 / 0 );			// ArithmeticException
			num = Integer.parseInt("10!");		// NumberFormatException
			
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌수 없습니다. ");
			
		} catch (NumberFormatException e) {
			System.out.println("입력한 값은 정수로 변환 할 수 없습니다. ");
		}
		
		System.out.println("==3. ");
		// 3. catch ( 여러 예외를 한꺼번에 처리 ) 
		
		try {
			System.out.println( 3 / 0 );			// ArithmeticException
			num = Integer.parseInt("10!");		// NumberFormatException
			
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("두 개의 예회를 하나의 블락에서 처리함. ");
		}
		
		
		
		
		
	
		System.out.println("프로그램 종료");

	}

}
