package chapter14.ex02;

class A {
	
}
class B extends A {
	
}
class C extends A {
	
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		    예외 처리  : 13시 12분까지 
		 */
		
		
		int[] arr = new int[] { 1, 2, 3, 4, 5 } ; 
		
		try {
			
			System.out.println(arr[5]);      // 예외 ArrayIndexOutOfBoundsException
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException 작동됨 ");
			
		}
					
		A a1 = new B(); 
		
		try {
			
			C c1 = (C) a1 ; 			//예외 ClassCastException
			
		} catch (ClassCastException e) {
			System.out.println("ClassCastException 발생됨 ");
		}
		
		
		
		System.out.println("프로그램 마지막 라인 ");
		

	}

}
