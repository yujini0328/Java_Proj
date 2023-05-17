package Chapter07.Ex04;

public class Ex01 {
	
	// 두 배열의 각 방의 내용을 더해서 출력
	public static void arrSum (int[] a, int[] b) {
		// for 문을 사용해서 각 배열의 방의 값을 더해서 출력
//		for(int i = 0 ; i < 500/7 && i < 500/9 ; i++) {
//			System.out.print(a[i] + b[i] + "\t");
//		}
		int [] c = new int[71]; // 제일 큰 배열의 방의 크기를 지정함. 두 배열의 더한 값을 저장하는 배열
		
		for(int i = 0, j = 0 ; i < a.length; i++, j++) {	// a 배열의 index 0 ~ 70
			if(i > 54) {
				c[i] = a[i];
			}else {
				c[i] = a[i] + b[j] ;						// b 배열의 index 0 ~ 54
			}
			System.out.print(c[i] + "\t");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("======7의 배수======");
		int[] a;	// 0 ~ 500까지의 7의 배수를 저장, 방의 크기 : 500/7
		a = new int[500/7];		// a : 500까지 저장할 방의 크기 지정
		
		// for 문을 사용해서 배열 a에 7의 배수 저장
		for(int i = 0, j = 7 ; i < a.length ; i++) {
			if(j < 500) {
				a[i] = j;
				j+=7;
			}
		}
		for(int i = 0; i < a.length ; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		System.out.println("======9의 배수======");
		int[] b;	// 0 ~ 500까지의 9의 배수를 저장, 방의 크기 : 500/9
		
		b = new int[500/9];
		for(int i = 0, j = 9 ; i < b.length ; i++) {
			if(j < 500) {
				b[i] = j;
				j+=9;
			}
		}
		for(int i = 0; i < b.length ; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		
		System.out.println("=====각 배열의 합=====");
		arrSum(a, b);	// 각 방의 내용을 더해서 출력 

	}

}
