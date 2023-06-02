package Chapter17.Ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.BooleanString;

// 1. hashCode(), equals()를 재정의 하지 않는 상태
class A {	// data 필드에 들어오는 값으로 각 객체를 식별하기 위해서는 : hash
	int data;
	
	A (int data){
		this.data = data;
		
		
	}

	@Override
	public String toString() {
		return " " + data + " ";
	}
}

// 2. hashCode(), equals() 메소드 재정의 : data 필드 값이 동일할때 hashCode가 동일
class B{
	int data;
	
	B(int data){
		this.data = data;
	}
	// 1. equals()를 재정의 : Set에 중복된 값을 넣지 않도록 식별자 생성, Object의 equals()는 stack의 주소 비교,  ==
		// data 필드의 힙의 값을 비교하도록 재정의
	@Override
	public boolean equals(Object obj) {		// b1.equals(b2)
		if (obj instanceof B) {		// 다운캐스팅하기전에 해당 타입이 존재하는지 확인 처리
			if(this.data == ((B)obj).data) {	// Heap에 저장된 data 필드의 값을 비교
				return true;
			}else {
				return false;
			}
		}
		return false;		// 기본값으로 false
	}
	
	// 2. hashCode()를 재정의 : data 필드의 값으로 hashCode를 생성하도록 재정의
		// data 필드의 값이 동일하면 동일한 hashCode()가 생성됨
	@Override
	public int hashCode() {
		
		return Objects.hash(data);	// data 필드의 값으로 hashCode를 생성함. 16진수 
	}
	
	
	// 객체를 출력시 data 필드의 값을 출력
	@Override
	public String toString() {
		return " " + data + " ";
	}
}

public class Set_Mechanism {

	public static void main(String[] args) {
		/*
		 	Set<E>	: 1. 방번호[index]가 존재하지 않는다. 2. 중복된 값을 넣을 수 업삳.
		 		- Set에 중복된 값을 넣지 못하도록 하기 위해서는 Object의 2개의 메소드가 재정의 되어 있어야 한다.
		 			- 객체의 특정 필드의 hachCode(), equals() 재정의 되어 있어야한다.
		 		- Wrapper Class : Boolean, Byte, Short, Integer, Long, Float, Double, Character, String
		 		- 자신이 생성한 특정한 클래스(Type)를 set에 넣을 경우 : hashCode(), equals() 메소드를 제정의해야함.
		 */
			// 1.  Set에 Wapper class를 사용한 경우
			
			Set<Integer> hset1 = new HashSet();
			hset1.add(22);hset1.add(33);hset1.add(22);hset1.add(33);hset1.add(33);
			
			System.out.println(hset1);
			System.out.println(hset1.size());
			
			// 2. Set Wapper class가 아닌 일반 클래스를 사용한 경우 :
			Set<A> hset2 = new HashSet();
			hset2.add(new A(22));hset2.add(new A(22));hset2.add(new A(22));hset2.add(new A(22));
			hset2.add(new A(22));hset2.add(new A(22));hset2.add(new A(22));
			
			System.out.println(hset2);
			System.out.println(hset2.size());
			
			// 3. Set에 B : data 필드에 대해서 hashCode(), equals() 재정의함.
			Set<B> hset3= new HashSet();
			hset3.add(new B(33));hset3.add(new B(33));hset3.add(new B(33));hset3.add(new B(33));
			hset3.add(new B(33));hset3.add(new B(33));hset3.add(new B(33));
			
			System.out.println(hset3);
			System.out.println(hset3.size());
	}

}
