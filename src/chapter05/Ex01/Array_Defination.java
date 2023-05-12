package chapter05.Ex01;

public class Array_Defination {
	public static void main(String[] args) {
		/*
		 자료형 : 자바는 변수명 앞에 반드시 자료형이 선언되어야 한다. 
		 - 기본 자료형 (8) : boolean, 정수 (byte, short, int, long), 실수 (float, double), 문자(char) 
		 - 변수명과 값이 Stack 메모리 영역에 저장됨 
		 - 사용전에 반드시 초기값이 할당 되어 있어야 한다. 
		 - 첫자가 소문자로 되어 있다. 
		 - == <== Stack 영역의 값을 비교하는 연산자.
		  
		 - 참조 자료형 : 배열 / 열거 / 객체(class) / 인터페이스 
		 - 무한대로 만들 수 있다. 
		 - 변수명 (Stack) : Heap 영역의 참조 주소 값이 변수명에 저장되어있다. 
		 - 값 (Heap) 
		 - 참조 자료형에서 == <== Stack의 값을 비교(Heap의 주소를 비교) Heap의 값을 비교할때는 equals()를 사용해야한다. 
		 - Heap 영역은 반드시 초기값이 들어 있어야 한다. 
		 - 변수선언만 하고 초기값을 넣지 않더라도 강제로 자동으로 할당이 됨. 
		 - boolean(false), 정수[byte, short, int, long] : 0,
		 실수 [float, double] : 0.0
		  
		 배열 : 하나의 배열 변수에 여러개의 값을 할당할 수 있다. 
		 - 반드시 방의 갯수를 선언해야한다. 
		 - 한번 방의 갯수가 지정되면 늘리거나 줄일 수 없다. 
		 - 배열의 방번호 : index [ 0, 1, 2, 3, 4 ] 
		 - 배열의 방의 갯수 : 배열변수명.length() 
		 - 초기값을 설정하지 않더라도 자동으로 기본 값이 들어감.
		  
		 */
		// 1. 변수 선언
		int a = 10;
		int b;
		b = 20;
		b = 50;

		// 2. 배열 선언
		int[] arr1 = new int[3];
		// int[] : 배열변수에 저장할 자료형, arr1 : 배열 변수명,
		// new : 변수의 값을 Heap 영역에 저장하겠다.
		// int[3] : 배열의 방의 갯수 : 3, index(0, 1, 2)

		// 3. 배열의 기본값을 출력 : 선언만해도 강제로 초기값이 Heap에 들어감
		System.out.println(arr1[0]); // arr1 배열변수의 0번방의 값을 출력
		System.out.println(arr1[1]); // arr1 배열변수의 1번방의 값을 출력
		System.out.println(arr1[2]); // arr1 배열변수의 2번방의 값을 출력
		
		System.out.println("====================");
		// 4. 배열 방의 값을 저장
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			
				// 배열 방의 값을 출력
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);
			
			
			System.out.println("=======================");
			
			double[] arr2;		// 배열 변수 선언
			arr2 = new double[6];	// 선언 후 나중에 방 크기 지정, index(방번호) : 0, 1, 2, 3, 4, 5
			
			System.out.println(arr2[0]);	// 0.0
			
			//배열 변수 arr2의 각 방에 실수를 저장 
			arr2[0] = 10.0;  
			arr2[1] = 20.0;  
			arr2[2] = 30.0;  
			arr2[3] = 40.0;  
			arr2[4] = 50.0;  
			arr2[5] = 60.0;
			arr2[6] = 70.0;		// ArrayIndexOutOfBound Exception(배열의 방 번호를 알 수 없다.)
									// 컴파일 오류 : 이클립스에서 자동으로 감지
									// 실행 오류 : 실행시 오류 발생
			
			// 값을 출력
			System.out.println("arr2의 0번재 방의 값" + arr2[0] );
			System.out.println("arr2의 1번재 방의 값" + arr2[1] );
			System.out.println("arr2의 2번재 방의 값" + arr2[2] );
			System.out.println("arr2의 3번재 방의 값" + arr2[3] );
			System.out.println("arr2의 4번재 방의 값" + arr2[4] );
			System.out.println("arr2의 5번재 방의 값" + arr2[5] );
			
			
			System.out.println("======For 문을 사용해서 배열에 값을 할당 후 출력하기===============");
			
			// 1부터 100까지 배열 변수에 저장 후 합계 출력
			
			int [] arr3 = new int[100];
			
			System.out.println(arr3.length); 	// 배열 방의 갯수를 출력
			
			// for 문을 사용해서 배열 변수의 값을 할당
			for(int i = 0 ; i < 100 ; i++) {
				arr3[i] = i+ 1;						// 배열의 각방에 1[0],2[1],3,4,5,.......100[99]
			}
			
			
			// for 문을 사용해서 배열의 각 방에 저장된 값을 할당
			for(int i = 0 ; i < 100 ; i++) {
				System.out.println("arr3 변수의 ["+ i + "] 번째 방의 값을 출력 : " + arr3[i]);
			}
			
	}

}
