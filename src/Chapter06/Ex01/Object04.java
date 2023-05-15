package Chapter06.Ex01;

class Car{
	
	//기본생성자
	public Car() {}
	
	//필드 (속성)
	String company ;	// 제조사
	String carName;		// 차명
	String carColor;	// 차색깔
	int carSpeed;		// 차의 스피드
	double carWeight;	// 차의 무게
	
	//메소드(기능)
	public void stop() {
		System.out.println(carName + " 가 멈춥니다.");
	}
	public void start() {
		System.out.println("carName" + " 가 달립니다.");
	}
	public void print () {
		System.out.println("회사명 : " + company);
		System.out.println("차명 : " + carName);
		System.out.println("차색깔 : " + carColor);
		System.out.println("차 스피드 : " + carSpeed);
		System.out.println("차 무게 : " + carWeight + "톤");
	}
}

public class Object04 {
	public static void main(String[] args) {
		// c1 객체 : 현대자동차 / 그랜져/ 검은색/ 250/ 1.0 톤
		// c2 객체 : 쌍용자동차 / 투싼/ 노란색/ 300/ 2.0 톤
		// c3 객체 : 기아자동차 / K9/ 흰색/ 350/ 1.5 톤
		
		
		System.out.println("======== c1 객채 =======");
		Car c1 = new Car();
		c1.company = "현대자동차";
		c1.carName = "그랜져";
		c1.carColor = "검은색";
		c1.carSpeed = 250;
		c1.carWeight = 1.0;
		
		c1.print();
		
		System.out.println("======== c2 객채 =======");
		Car c2 = new Car();
		c2.company = "쌍용자동차";
		c2.carName = "투싼";
		c2.carColor = "노란색";
		c2.carSpeed = 300;
		c2.carWeight = 2.0;
		
		c2.print();
		
		System.out.println("======== c3 객채 =======");
		Car c3 = new Car();
		c3.company = "기아자동차";
		c3.carName = "K9";
		c3.carColor = "흰색";
		c3.carSpeed = 350;
		c3.carWeight = 1.5;
		
		c3.print();
		
		// 각 객체의 메소드 출력 
		
		
		
	}
}
