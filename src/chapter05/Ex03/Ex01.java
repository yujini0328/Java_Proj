package chapter05.Ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("=======================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수만 빼고 저장 후 출력");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장 후 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("=======================================================");
			System.out.println("1 ~ 4번까지 번호를 입력하세요 :");
			int a = sc.nextInt();
			
			if(a==1) {
				System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
				System.out.println("인덱스의 방의 크기를 정수로 지정하세요 :");
				int b = sc.nextInt();
				
				int[] arr1 = new int[b];
		        int num = 0;
		        int count = 0;
		        while (count < b) {
		            num += 7;
		            if (num % 8 == 0) {
		                arr1[count] = num;
		                System.out.println("arr1[" + count + "]: " + arr1[count]);
		                count++;
		            }
		        }
				
//				int[] arr1 = new int[b];
//		        for (int i = 0; i < arr1.length; i++) {
//		            int num = (i + 1) * 7;
//		            int num2 = (i + 1) * 8;
//		            arr1[i] = num*10 + num2;
//		        }
//
//		        for (int i = 0; i < b; i++) {
//		            int num = arr1[i] / 10;
//		            int num2 = arr1[i] % 10;
//		            System.out.println("arr1[" + i + "]: " + num + " (7의 배수), " + num2 + " (8의 배수)");
//		        }
				
			}else if(a==2) {
				System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수만 빼고 저장 후 출력");
				System.out.println("인덱스의 방의 크기를 정수로 지정하세요 :");
				int b = sc.nextInt();
				
				int[] arr1 = new int[b];
		        int num = 0;
		        int count = 0;
		        while (count < b) {
		            num += 1;
		            if (num % 4 != 0) {
		                arr1[count] = num;
		                System.out.println("arr1[" + count + "]: " + arr1[count]);
		                count++;
		            }
		        }
				
			}else if(a==3) {
				System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장 후 출력");
				System.out.println("인덱스의 방의 크기를 정수로 지정하세요 :");
				int b = sc.nextInt();
				
				int[] arr1 = new int[b];
		        int num = 0;
		        int count = 0;
		        while (count < b) {
		            num += 3;
		            if (num % 6 != 0) {
		                arr1[count] = num;
		                System.out.println("arr1[" + count + "]: " + arr1[count]);
		                count++;
		            }
		        }
			}else if(a==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}
			
		}while(true);
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
