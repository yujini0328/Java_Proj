package Chapter17.Ex04;

import java.util.Set;
import java.util.TreeSet;

class Aa implements Comparable<Aa> {	// 일반 객체를 TreeSet에 넣어서 정렬해서 출력 : Comparable 인터페이스의 compareTo() 재정의
	String name;
	// 생성자를 통해서 필드의 값 입력
	Aa(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Aa o) {
			return (this.name.compareTo(o.name)); // 오름 차순으로 저장
	}
	
	@Override
	public String toString() {
		return " " + name + " ";
	}
	
}

class Bb implements Comparable<Bb>{
	int userID;
	
	Bb(int userID){
		this.userID = userID;
	}
	
	@Override
	public int compareTo(Bb o) {
		if(this.userID < o.userID) {
			return 1;
		}else if(this.userID == o.userID) {
			return 0;
		}else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return " " + userID + " ";
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// 두 클래스를 TreeSet에 저장시 정렬되어 출력되도록 구현
		// 
		Set<Aa> aaSet = new TreeSet();
		
		aaSet.add(new Aa("홍길동")); aaSet.add(new Aa("김길순")); aaSet.add(new Aa("안길문"));
		
		System.out.println(aaSet);
		
		Set<Bb> bbSet = new TreeSet();
		
		bbSet.add(new Bb(1111));bbSet.add(new Bb(2222));bbSet.add(new Bb(3333));
		
		System.out.println(bbSet);
	}

}
