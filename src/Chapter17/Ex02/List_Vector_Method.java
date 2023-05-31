package Chapter17.Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Vector_Method {

	public static void main(String[] args) {
		/*
		 	List<E> : 인터페이스, 메소드만 선언되어 있다. 구현되어 있지 않다.
		 		: 방번호[index]를 가지고 있다. 중복된 값을 저장할 수 있다.
		 		: 컬렉션 값을 추가하거나, 제거나, 수정하거나, 할때 메소드를 사용함.
		 		
		 		-- ArrayList<E>		: 싱글 쓰레드
		 		-- Vector<E>		: 멀티 쓰레드 환경, 모든 메소드가 동기화 처리가 되어 있기 때문에 멀티쓰레드 환경에 유리.
		 			-- 중간에 어떤 값을 넣거나 제거할 경우 부하가 많이 발생된다.
		 			-- 빈번하게 값을 수정하는 경우 부하가 많이 발생된다.
		 		-- LinkedList<E> 	: 
		 			-- 중간의 어떤 값을 추가/제거 부하가 많이 발생 되지 않는다.
		 			-- 빈번하게 같이 변경되는 경우 사용하는 자료형
		 */
		
		// List에서 사용되는 메소드 
		
		// 자식의 구현 클래스를 객체화해서 List 타입으로 선언 : 인터페이스의 메소드를 호출하면 오버라이딩된 메소드 호출
		List<Integer> aList = new Vector();
		
		// 메소드 1 ~ 4 : 리스트에 값을 추가
		// 1. add(E element) : 마지막 방에 값을 추가함.
		System.out.println(aList);
		System.out.println(aList.size()); 	// List 컬렉션에 저장된 방의 갯수
		
		// aList
		aList.add(3); aList.add(4); aList.add(5);
		
		System.out.println(aList);
		System.out.println(aList.size()); 	// List 컬렉션에 저장된 방의 갯수
		
		// 2. add(int index, E element) : index 방번호의 값을 추가함.
		aList.add(1,6);		// 1 : index [방번호], 6 [값]
		System.out.println(aList);
		System.out.println(aList.size()); 	// List 컬렉션에 저장된 방의 갯수
			// [3, 6, 4, 5]
		
		// 3. addAll (다른 리스트객체) : 자신의 마지막 방에서 다른 컬렉션 객체의 값을 모두 추가
		List<Integer> aList2 = new Vector();
		
		aList2.add(1);aList2.add(2);
		System.out.println(aList2); 	// [1,2]
		
		aList2.addAll(aList);
		System.out.println(aList2);		// [1, 2, 3, 6, 4, 5]
		
		// 4. addAll (int index, 다른 리스트객체)
		List <Integer> aList3 = new Vector();
		
		aList3.add(1);aList3.add(2);
		
		System.out.println(aList3);		// [1,2]
		
		aList3.addAll(1,aList3);		// 자기 자신의 객체의 값을 추가할 수 있다.
		
		System.out.println(aList3); 	// [1,1,2,2]
		
		// 컬렉션 : List, Set, Map
		// List의 값을 수정 : set()
		// 5. set(int index, E element) : index 방번호에 있는 값을 element로 들어온 인자로 수정 
		
		aList3.set(1, 5);		// 1 : 방번호, 5 : 변경될 값
		aList3.set(3, 6);		// 3 : 방번호, 6 : 변경될 값
		
		System.out.println(aList3); 	// [1, 5, 2, 6]
		
		// 삭제 
		// 6. remove (int index) : index : 방번호의 값을 삭제, 삭제 후 뒤의 값이 한칸씩 앞으로 모이게 된다.
		aList3.remove(2);
		System.out.println(aList3);	// [1, 5, 6]
		
		// 7. remove(Object o) : 방번호로 삭제하는 것이 아니고 리스트에 저장된 값을 식별해서 삭제, 
		
		aList3.remove(new Integer(6));	// [1, 5]
		System.out.println(aList3); 
		
		// 8. clear() : 리스트의 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);	// []
		
		// 9. isEmpty() : 리스트에 값이 존재하지 않을 경우 true, 존재하는 경우 false
		System.out.println(aList3.isEmpty());	// true
		
		// 10. size() : 방의 갯수
		System.out.println(aList3); 		// 0
		System.out.println(aList3.size());
		System.out.println(aList2);
		System.out.println(aList2.size()); 	// 6
		
		// 리스트에 저장된 값을 가져오기
		// 11. get(int index) : index 방번호에 값을 가져오기
				// aList2 : [1, 2, 3, 6, 4, 5]
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		System.out.println(aList2.get(3));
		System.out.println(aList2.get(4));
		System.out.println(aList2.get(5));
		
		System.out.println("=====리스트의 값을 For 문을 사용해서 출력======");
		System.out.println(aList2);
		System.out.println(aList2.size());
		
		for(int i = 0 ; i < aList2.size() ; i++) {
			System.out.print(aList2.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("====리스트에 값을 향상된 For 문을 사용해서 출력=====");
		
		for(int k : aList2) {
			System.out.println(k + " ");
		}
		System.out.println();
		
		// 리스트의 값을 배열로 변환
		// 12. toArray() : 리스트에 저장된 값을 배열로 변환, 리턴 타입이 Object 이기 때문에 다운 캐스팅해서 처리
		Object[] obj = aList2.toArray();	//
		
		System.out.println(Arrays.toString(obj));
		
		// 13. toArray(T[] t) : 리스트 ===> 배열, T[] 		<== 리스트를 배열로 끄집어 낼때 해당타입의 배열로 바로 끄집어낸다.
		
		Integer[] int1 = aList2.toArray(new Integer[0]);	// int[] int1 = new int[10];
				// [0] : 방의 갯수를 지정함. 리스트의 값이 존재할 경우 리스트의 방크기로 지정됨
		
		Integer[] int2 = aList2.toArray(new Integer[10]);
		System.out.println(Arrays.toString(int2));	// [1, 2, 3, 6, 4, 5, null, null, null, null]

	}

}
