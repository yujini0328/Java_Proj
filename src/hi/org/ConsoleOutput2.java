package hi.org;

public class ConsoleOutput2 {
	public static void main(String[] args) {
		
		// 변수 선언
		String str1 = "안녕";
		String str2 = " 하세요";
		
		// 변수 선언(정수 변수)
		int a = 10;
		int b = 20;
		
		// 변수 선언(실수 변수)
		double c = 11.1;
		double d = 12.5;
		
		System.out.println("==========변수의 내용을 출력===============");
		
		System.out.println("str1 변수의 값은 : " + str1);
		System.out.printf("str2 변수의 값은 : %s", str2);
		
		
		System.out.println("=== println을 사용해서 문자열과 변수를 출력 ( + ) ===");
		
		System.out.println("str1 : " + str1 + " , str2 : " + str2);
		System.out.printf("str1 : %s , str2 : %s", str1, str2);
		
		
		
	}

}
