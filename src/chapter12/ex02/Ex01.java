package chapter12.ex02;

abstract class Calc {
	abstract int add ( int a, int b ); 		// 두 정수를 인풋 받아서 더한 값을 리턴 
	abstract int diff ( int a, int b); 		// 빼기
	abstract int mul  ( int a, int b); 		// 곱하기
	abstract double div (int a , int b) ;   // 나누기 	
}

class Calc_Impl extends Calc {

	@Override
	int add(int a, int b) {		
		return a + b ;
	}
	@Override
	int diff(int a, int b) {
		return a-b ;
	}
	@Override
	int mul(int a, int b) {
		return a * b;
	}

	@Override
	double div(int a, int b) {
		return (double)a / (double) b ;
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		//위의  추상 클래스를 
		//1. 콘크리트 클래스를 생성 해서 작동,   << 매번 자주 사용 할때 >> 
		Calc c1 = new Calc_Impl(); 
		int a = 4; 
		int b = 5; 
		
		System.out.println(c1.add(a, b));
		System.out.println(c1.diff(a, b));
		System.out.println(c1.mul(a, b));
		System.out.println(c1.div(a, b));
	
		//2. 익명클래스를 생성 해서 작동 << 한번만 쓰고 버림 >> 
		Calc c2 = new Calc() {

			@Override
			int add(int a, int b) {
					return a + b;
			}

			@Override
			int diff(int a, int b) {
				return a - b;
			}

			@Override
			int mul(int a, int b) {
				return a * b;
			}

			@Override
			double div(int a, int b) {
				return (double) a / (double) b ;
			}
			
		}; 
		
		System.out.println(c2.add(a, b));
		System.out.println(c2.diff(a, b));
		System.out.println(c2.mul(a, b));
		System.out.println(c2.div(a, b));
		
		
		//14: 00 까지 : p.jangwoo@gmail.com 
		
		

	}
}
