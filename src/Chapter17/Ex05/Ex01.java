package Chapter17.Ex05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Student {	// Map : key : 중복되면 안됨, equals(), hashCode()
	
	int stuID;		// 중복되면 안되도록 처리,
	String stuName;
	
	public Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
		return false;
		if(getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stuID, other.stuID);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(stuID);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		
		// Key : Student, 
		Map <Student, String> linkMap = new LinkedHashMap();
		Student s1 = new Student(111, "홍");
		
		linkMap.put(s1, "홍");
		
		System.out.println(linkMap);

	}

}
