package chapter14.ex02;

public class TryCatch {

	public static void main(String[] args) {
		/*
		    예외 처리 : 예외가 발생 되더라도 프래그램이 멈추지 않도록 처리 . 
		 	예외를 처리하는 방법 
		 	   1. throws 로 미루는 방법 : 마지막에 호출하는 곳에서 예외를 처리 
		 	   			throw : 예외를 강제로 발생 시킬때 사용 
		 	   2. try catch 문을 사용해서 내가 직접 예외를 처리 
		 */
		
		try  {   //try 블락 
		
			System.out.println( 3 / 0 );       //예외가 발생됨 
		
		} catch (ArithmeticException e) {   //catch 블락 
			
			// try 블락에서 오류가 발생되면 catch 블락이 작동이 되고,
			// try 블락에서 오류가 발생되지 않으면 catcha 블락이 작동 되지 않음. 
			System.out.println("catch 블락 작동됨 ");

		}finally {  // try에서 오류가 발생해도 , 발생하지 않아도 작동 
			System.out.println("Finally 블락은 무조건 실행됨 ");	
		}
		
		System.out.println("====프로그램 마지막 라인임 ===");

		

	}

}
