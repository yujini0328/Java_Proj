package Chapter07.Ex02;

class F{
	// 1. 메소드 : 두 배열의 각 방의 내용을 더해서 출력 : int
	// 2. 메소드 : 두 배열의 각 방의 내용을 빼서 출력  : int
	// 3. 메소드 : 두 배열의 각 방의 내용을 곱하기 출력 : int
	// 4. 메소드 : 두 배열의 각 방의 내용을 나누기 출력 : double 
	void sum(int[] a, int[] b) {
		System.out.println("두 배열의 합은 : ");
		for (int i = 0; i < a.length; i++) {
				System.out.print((a[i] + b[i]) + "\t");
		}
		System.out.println();
	}
	void Diff(int[] a, int[] b){
		System.out.println("두 배열의 차는 : ");
		for (int i = 0; i < a.length; i++) {
				System.out.print((a[i] - b[i]) + "\t");
		}
		System.out.println();
	}
	void mul(int[] a, int[] b) {
		System.out.println("두 배열의 곱하기는 : ");
		for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] * b[i] + "\t");
		}
		System.out.println();
	}
	void div(int[] a, int[] b) {
		System.out.println("두 배열의 나누기는 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%.5f\t", (double)a[i] / b[i]);
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// 1. 정수를 담는 배열 arr1 방 100개를 생성 : 7의 배수만
				// 7 14 21 ....
		System.out.println("=====7의 배수====");
		int[] arr1 = new int[100];	// index : 0 ~ 99
		int a = 0;	// 7의 배수를 저장하는 변수
		
		// for문을 사용해서 각 방에 7의 배수를 저장
		for(int i = 7; ; i++) {
			if(i%7==0) {
				arr1[a] = i;
				a++;
			}
			if(a == 100)break;
		}
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		
		
		// 2. 정수를 담는 배열 arr2 방 100개를 생성 : 4의 배수만 저장하는데 8의 배수는 저장하지 않도록
				// 4 12 20 ....
		System.out.println("=====4의 배수(8의 배수 제외)====");
		int[] arr2 = new int[100];
		int b = 0;
		
		for(int i = 0 ; ; i++) {
			if(i%4 == 0 && i%8 != 0) {
				arr2[b] = i;
				b++;
			}
			if(b == 100)break;
		}
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
		
		System.out.println("===== 각 메소드 호출 후 출력 ======");
		F f1 = new F();
		
		f1.sum(arr1, arr2);
		f1.Diff(arr1, arr2);
		f1.mul(arr1, arr2);
		f1.div(arr1, arr2);
	}

}
