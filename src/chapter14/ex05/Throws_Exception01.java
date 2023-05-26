package chapter14.ex05;

/* 예외 처리 : 
    1. try ~ catch : 내가 직접 예외 처리 
    2. throws : 메소드 블락에 메소드를 호출하는쪽에서 처리하도록 미루는 것 
        일반예외는 반드시 처리해야 되는 예외, 실행예외는 처리해되고 안해도 된다.       
*/ 

//1. 내가 직접 예외를 처리함. 
class A {
	void abc () {
		bcd();       //bcd() 메소드 호출 
	}
	void bcd()  {
		
		try {
			Thread.sleep(1000);      //일반 예외 : 1초 동안 대기해라.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}    	
	}	
}

//2. 예외 전가 (throws ) : 내가 예외를 처리 하지 않고 메소드를 호출하는곳에서 예외를 처리하도록 미루는것 
class B {
	void abc() {
		
		try {
			bcd();    //메소드를 호출시 예외 처리를 해야 함. 
		} catch (InterruptedException e) {	
			e.printStackTrace();
		} 
	}
	void bcd() throws InterruptedException {  //예외를 전가 : throws 
		Thread.sleep(1000);  //InterruptedException   
	}	
}
class C {
	void abc() {
		try {
			bcd();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	void bcd() throws Exception {
		Thread.sleep(1000);
	}
}

public class Throws_Exception01 {

	public static void main(String[] args) {
		

	}

}
