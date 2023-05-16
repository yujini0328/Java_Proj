package Chapter07.Ex02;

class B{
	
	// 매개 변수로 배열을 받아서 처리하는 메소드
	// void : 리턴이 없을때
	void print(int[] a) {		// 배열의 정보를 출력하는 메소드
		
		// for 문으로 출력
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n \n");
		
		
		 
	}
	
	
	
}


public class Method02 {

	public static void main(String[] args) {

		// 1. 객체생성후 메소드 호출
		B b1 = new B();
		
		// 2. 배열을 선언후 값을 넣고 메소드 호출시 인풋 값으로 배열을 넣어줌
		int [] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		// 3. 메소드 호출시 배열을 매개변수로 넣어줌
		b1.print(arr1);
		
		System.out.println("=====================");
		B b2 = new B();
		
		b2.print((new int[] {10,20,30,40,50,60}));
	}

}
