package Chapter17.Ex02;

public class Car {
	String company;
	String carName;
	String carColor;
	int maxSpeed;
	
	// 생성자를 통해서 필드의 값 입력
	public Car(String company, String carName, String carColor, int maxSpeed) {
		super();		// Object 클래스의 기본 생성자 호출:
		this.company = company;
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}


	// 객체 자체를 출력 :
	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
}
