package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchWithResource01 {

	public static void main(String[] args)   {
		/*
		 	//객체를 사용후 RAM에서 그 객체를 제거 해야 한다. 
		 	    - finally 블락에서 사용한 객체를 close() 
		 	    
		 	일반 예외 : 반드시 예외를 처리해야 한다. 컴파일 단계에서 예외 이클립스에서 오류 출력 
		 	   -- throws : 예외를 미루는 방법 
		 	   -- try catch : 자신이 직접 예외 처리 
		 */
		
		System.out.println("문자를 콘솔에서 한자 입력 하세요. ");
		
		//1. 수동 리소스 해제 : finally 블락에서 해제 
		InputStreamReader ir1 = null;   //콘솔에서 1 문자를 읽어 드리는 객체 
		
		ir1 = new InputStreamReader(System.in);    // ir1은 콘솔에서  1 문자 읽어 들일 수 있는 객체를 활성화

			try {
				char input = (char)ir1.read();     //byte ==> char타입으로 변환해서 input 변수에 담는다. 
				System.out.println("입력한 문자는 : " + input );
				
			} catch (IOException e) {
				
				System.out.println("IOException이 발생이 되었습니다. 문자 하나만 넣어 주세요. ");
				e.printStackTrace();   //예외에 대한 자세한 정보를 출력 하도록 한다. <<디버깅>>
				
			} finally {   //객체를 사용후 메모리에서 제거해야 한다. ir1.close() 
				
				if (ir1 != null ) {  //ir1 객체가 null 이 아닐때 객체를 제거함. 				
					try {
						ir1.close();
					} catch (IOException e) {
						System.out.println("객체 제거시 예외가 발생되 었습니다. ");
						e.printStackTrace();
					}
				}	
			}
			
			
  
	}

}
