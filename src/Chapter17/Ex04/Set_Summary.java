package Chapter17.Ex04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Summary {

	public static void main(String[] args) {
		/*
		 	Set<E> : 
		 		- HashSet<E>		: 입력 순서대로 출력되지 않고 랜덤하게 값이 출력
		 		- LinkedHashSet<E>	: 넣은 순서대로 값이 출력
		 		- TreeSet<E>		: 검색을 빠르게 하기 위해서	<===
		 				값을 저장할때 정렬해서 저장이됨 : 
		 					오름 차순 정렬 (ASC) ( 1, 2, ===> 10 ) (A, B, C ===> Z) (가, 나, ===> 하)
		 					내람 차순 정렬 (DESC) (10, 9 ===> 1) (Z, Y, X ===> A) (하, 카, ===> 가) 
		 */
		
		// 1. 객체 생성
		Set<String> hset = new HashSet();
		Set<String> lset = new LinkedHashSet();
		Set<String> tset = new TreeSet();
		
		// 2. 값입력 후 출력
		
		// HashSet
		hset.add("다");
		hset.add("마");
		hset.add("나");
		hset.add("가");
		System.out.println(hset); 	// HashSet : 입력하는 순서대로 출력 되지 않음.	[가, 다, 마, 나]
		
		// LinkedHashSet : 입력한 순서대로 출력
		lset.add("다");
		lset.add("마");
		lset.add("나");
		lset.add("가");
		System.out.println(lset); 	// [다, 마, 나, 가]
		
		// TreeSet : 오름차순 정렬되어서 저장이 되어 있음. 오름차순 정렬되어서 출력
		tset.add("다");
		tset.add("마");
		tset.add("나");
		tset.add("가");
		System.out.println(tset); 	// [가, 나, 다, 마]



	}

}
