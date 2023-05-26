package chapter14.ex03;

class A {
	int a; 
}
class B extends A {
	int b; 
}
class C extends A {
	int c ; 
}

public class Ex01 {
	public static void main(String[] args) {
		
		A a1 = new B(); 	
		C c1 = (C) a1; 		//예외 발생 
		
		String [] arr = new String[] { "안녕", "오늘", "날씨", "맑음"}; 
		System.out.println(arr[4]);   //예외 발생 
		
		String str = null ; 
		System.out.println(str.charAt(1));	//예외 발생 
	
		
		//완료시간 : 14:20분 까지 : p.jangwoo@gmail.com 
		System.out.println("====1. 방법으로 예외 처리(각 각 처리 )  == ");
		System.out.println("====2. 방법으로 예외 처리 (여러 catch 로 예외 처리 ) == ");
		System.out.println("====3. 방법으로 예외 처리 (Exception으로 한꺼번에 처리 ) == ");
		System.out.println("====4. 방법으로 예외 처리 (catch 블락에서 세밀하게 철리하고 그외는 Exception) == ");

		
		
		

	}

}
