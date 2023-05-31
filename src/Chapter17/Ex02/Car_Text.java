package Chapter17.Ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Car_Text {

	public static void main(String[] args) {
		// 1. Car 타입의 객체 5개 생성후
		Car c1 = new Car("현대자동차", "그랜저", "검은색", 300);
		Car c2 = new Car("기아자동차", "에쿠스", "흰색", 350);
		Car c3 = new Car("쌍용자동차", "투산", "은색", 250);
		Car c4 = new Car("삼성자동차", "SM5", "빨강색", 270);
		Car c5 = new Car("벤츠", "벤츠", "은색", 370);
		
		// 2. ArrayList에 저장
		List<Car> Car1 = new ArrayList<>();
		Car1.add(c1);
		Car1.add(c2);
		Car1.add(c3);
		Car1.add(c4);
		Car1.add(c5);
		System.out.println(Car1.size());
		
		// 3. Vector에 저장
		List<Car> Car2 = new Vector();
		Car2.add(c1);
		Car2.add(c2);
		Car2.add(c3);
		Car2.add(c4);
		Car2.add(c5);
		System.out.println(Car2.size());
		
		// 4. LinkedList에 저장
		List<Car> Car3 = new LinkedList<>();
		Car3.add(c1);
		Car3.add(c2);
		Car3.add(c3);
		Car3.add(c4);
		Car3.add(c5);
		System.out.println(Car3.size());
		
		// 5. 리스트에 저장된 Car 객체를 가지고 와서 출력 For문으로 출력
		System.out.println("====For 문을 사용해서 ArrayList에 저장된 값을 출력=====");
		for(int i = 0 ; i < Car1.size() ; i++) {
			System.out.println(Car1.get(i) + " ");	// c1, c2, c3, c4, c5
		}
		System.out.println();
		
		// 6. 리스트에 저장된 Car 객체를 가지고 와서 출력  Enhanced For문으로 출력
		System.out.println("====Enhanced For 문을 사용해서 ArrayList에 저장된 값을 출력=====");
		for(Car k : Car1) {
			System.out.println(k + " ");
		}

	}

}
