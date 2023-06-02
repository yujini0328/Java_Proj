package Chapter17.Ex04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet_Method {

	public static void main(String[] args) {
		/*
		 	Set<E> : 인터페이스, 객체화할 수 없다. 자식을 객체화해서 타입으로는 지정 가능하다.
		 		: 선언만된 메소드 ===> 자식 클래스 (오버라이딩해서 구현)
		 		: 인터페이스의 메소드 호출시 자식 클래스의 오버라이딩된 메소드가 작동
		 		: 방번호가 없다. 중복된 값을 넣을 수 없다. <== ID
		 		: set에 값을 저장하면 중복 제거되어서 저장이 됨. 
		 		
		 		- HashSet<E>		: 입력 순서대로 출력되지 않고 랜덤하게 값이 출력
		 		- LinkedHashSet<E>	: 넣은 순서대로 값이 출력
		 		- TreeSet<E>		: 검색을 빠르게 하기 위해서	<===
		 				값을 저장할때 정렬해서 저장이됨 : 
		 					오름 차순 정렬 (ASC) ( 1, 2, ===> 10 ) (A, B, C ===> Z) (가, 나, ===> 하)
		 					내람 차순 정렬 (DESC) (10, 9 ===> 1) (Z, Y, X ===> A) (하, 카, ===> 가) 
		 */
		// 
		
		// 0. Set 선언
		Set<String> hSet1 = new TreeSet();
		
		// 1. add(E element) : Set에 값을 추가함.
		hSet1.add("가");hSet1.add("나");hSet1.add("가");		// "가" <== Set은 중복된 값을 저장할 수 없다.
		
		System.out.println(hSet1);		// [가,나]
		
		// 2. addAll(다른 set 객체) : 자신의 set에 다른 set에 저장된 값을 넣을 수 있다. 중복된 값은 저장되지 않는다.
		Set<String> hSet2 = new TreeSet();
		hSet2.add("나");hSet2.add("다");
		
		hSet2.addAll(hSet1);
		System.out.println(hSet2);	// [가, 다, 나]	<== HashSet은 출력이 랜덤하게 됨
		
		// 3. remove (Object o) : 값으로 삭제함, (방번호로 삭제가 불가)
		hSet2.remove("나");
		
		System.out.println(hSet2);
		System.out.println(hSet2.toString());	// 컬렉션의 모든 구현체는 toString()이 재정의
		
		// 4. clear() : 모든 값을 제거함.
		hSet2.clear();
		System.out.println(hSet2);
		
		// 5. isEmpty() : set에 값이 비어있으면 true, 값이 존재하면 false
		boolean bool1 = hSet2.isEmpty();
		System.out.println(bool1);
		System.out.println(hSet2.isEmpty());
		
		 // 6.contains(Object 0) : 메소드의 매개변수로 들어오는 값이 set에 존재하면 true, 존재하지 않아면 
		Set<String> hSet3 = new TreeSet();
		hSet3.add("가");hSet3.add("나");hSet3.add("다");
		
		System.out.println(hSet3.contains("나"));	// true
		System.out.println(hSet3.contains("라"));	// false
		
		// 7. size() : set에 저장된 값의 갯수
		System.out.println(hSet3.size());
		
		System.out.println("=======Iterator를 사용한 값을 출력========");
		// 8. iterator를 사용해서 set에 저장된 값을 출력 : <== set은 방번호가 없어서 for문을 사용해서 값을 가져올 수 없다.
			// Iterator : Set에 저장된 값을 순회자
				// hasNext() : set에 다음값이 존재하면 true, 다음값이 존재하지 않으면 false
				// next() : 값을 출력하고, 다음값으로 이동
		
		// 8-1. Iterator 객체 생성
		Iterator<String> iterator = hSet3.iterator();	// Set 객체에 Iterator를 장착함.
		
		// 8-2 Iterator 객체를 사용해서 hSet3에 저장된 값을 가지고 옴
		while(iterator.hasNext()) {		// 다음 값이 존재하면 true 
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("============================");
		
		
		// 9. 향상된 for문을 사용해서 출력
		for(String k : hSet3) {
			System.out.println(k + " ");
		}
		System.out.println();
		System.out.println();
		
		// 10. toArray() : set에 저장된 값을 배열로 변환, Object []로 리턴
		Object[] obj = hSet3.toArray();
		
		System.out.println(Arrays.toString(obj));
		
		for(int i = 0 ; i < obj.length ; i++) {
			System.out.println(obj[i] + " ");
		}
		
		System.out.println("============================");
		// 11. toArray (T[] t) : set에 저장된 값을 배열로 변환, 해당 타입으로 변환
		 String[] str = hSet3.toArray(new String[0]);	// String[] 배열로 끄집어 냄.
										// Set에 저장된 값에 따라서 방크기를 지정
		 System.out.println(Arrays.toString(str));
		 
		 for(int i = 0 ; i < str.length ; i++) {
			 System.out.print(str[i] + " ");
		 }
		 System.out.println();
	}
}
