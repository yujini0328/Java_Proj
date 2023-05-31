package Chapter17.Ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Test {

	public static void main(String[] args) {
		
		// ArrayList 변수 선언 : <Student>
		List<Student> aList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);	// 콘솔로부터 값을 인풋
		
		boolean run = true ;
		int studentNum = 0;		// 스캐너로 학생 수를 인풋받는 변수
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1. 학생수 | 2. 점수 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================================================");
			System.out.println("위의 번호중 하나의 정수를 입력하세요. >>>>");
			
			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				// 스캐너로 학생수를 인풋 받아서 studentNum 변수에 할당합니다.
				System.out.println("학생 수를 입력하세요 : ");
				studentNum = sc.nextInt();
				System.out.println("당신이 입력한 학생수는 : " + studentNum + "입니다.");
				System.out.println();
				aList = new ArrayList<>(studentNum);
				
			}else if(selectNo == 2) {
				// 학생수가 인풋되지 않으면 먼저 학생수를 입력하세요 메세지 출력
				if (studentNum == 0) {
					System.out.println("먼저 학생수를 입력하세요.");
					continue;
				}
				// 학생수에 대한 각각의 student 객체를 생성후 점수를 스캐너로 입력받고 aList에 저장합니다.
				for (int i = 0; i < studentNum; i++) {
					System.out.println("학생 " + (i+1) + "의 점수를 입력하세요: ");
					int score = sc.nextInt();
					Student student = new Student();
		            student.setScore(score);
		            aList.add(student);
				}
				
			
				
			}else if(selectNo == 3) {
				// 점수의 리스트를 출력, aList의 Student
				System.out.println("점수 리스트: ");
//				for(int i = 0 ; i < aList.size() ; i++) {
//					System.out.println(aList.get(i).getScore() + " ");
//				}
				
		        for (Student student : aList) {
		            System.out.print(student.getScore() + "\t");
		        }
		        System.out.println();
		        
			}else if(selectNo == 4) {
				// 최대 점수를 출력
				// 평균 출력
				int maxScore = 0;
		        int totalScore = 0;
		        int sum = 0;
		        double avg = 0.0;
		       
		        
		        
//		        // aList에 Student객체에 getScore()를 사용해서 점수를 끄집어 내면서 처리
//		        for(int i = 0 ; i < aList.size() ; i++ ) {
//		        	Student student = aList.get(i);
//		        	
//		        	// 점수 : 객체의 getter를 사용해서 점수를 받아온다.
//		        	int score = student.getScore();
//		        	
//		        	sum += score;	// sum = sum + score;
//		        	
//		        	// 최대 점수를 maxScore 변수에 할당 : if 조건으로 처리, 삼항 연산자로 처리
//		        	if(score > maxScore) {
//		        		maxScore = score;
//		        	}
//		        }
		        
		        
		        for (Student student : aList) {
		            int score = student.getScore();
		            totalScore += score;

		            if (score > maxScore) {
		                maxScore = score;
		            }
		        }

		        double averageScore = (double) totalScore / aList.size();

		        System.out.println("최고점: " + maxScore);
		        System.out.println("평균점수: " + averageScore);
				
			}else if(selectNo == 5) {
				// while문을 빠져나옴
//				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료됨");
		sc.close();
	}
}
