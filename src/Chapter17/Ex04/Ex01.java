package Chapter17.Ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 	1. for문을 사용해서 1 ~ 100까지 HashSet에 값을 저장
		 	2. Iterator를 사용해서 HashSet에 저장된 값을 출력
		 	3. Enhanced for문을 사용해서 출력
		 	4. HashSet에 저장된 값을 ===> 배열로 변환, 일반 for 문을 사용해서 출력
		 	
		 	
		 */
		// 1. for문을 사용해서 1 ~ 100까지 HashSet에 값을 저장
		Set<Integer> hSet = new HashSet();
		
		System.out.println("============1. for문을 사용해서 1 ~ 100까지 HashSet에 값을 저장==============");
		for(int i = 0 ; i <= 100 ; i++) {
			hSet.add(i);
		}
		System.out.println(hSet);
		
		// 2. Iterator를 사용해서 HashSet에 저장된 값을 출력
		System.out.println("===========2. Iterator를 사용해서 HashSet에 저장된 값을 출력============");
		Iterator<Integer> iterator = hSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		
		// 3. Enhanced for문을 사용해서 출력
		System.out.println("===========3. Enhanced for문을 사용해서 출력============");
		for(int k : hSet) {
			System.out.print(k + "\t");
		}
		System.out.println();
		
		// 4. HashSet에 저장된 값을 ===> 배열로 변환, 일반 for 문을 사용해서 출력
		System.out.println("===========4. HashSet에 저장된 값을 ===> 배열로 변환, 일반 for 문을 사용해서 출력============");
		Object[] obj = hSet.toArray();
		
		for(int i = 0 ; i < obj.length ; i++) {
			System.out.print(obj[i] + "\t");
		}
	}
}
