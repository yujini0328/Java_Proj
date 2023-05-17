package Chapter07.Ex04;

class Car{
	// 각 생성자에서 값을 할당할때 초기값을 로드 각 필드의 기본값을 할당
	// this()를 사용해서 인풋받은 값을 넣어서 출력
	
	
	// 기본 생성자에서 초기값 할당
	Car () {
		company = "회사명 없음";
		carName = "차명 없음";
		carColor = "차색 등록안됨";
		carDoor = 0;
		carWeight = 0.0;
	}
	
	String company;
	String carName;
	String carColor;
	int carDoor;
	double carWeight;
	
	Car (String company){
		this();
		this.company = company;
	}
	
	Car(String company, String carName){
		this(company);
		this.carName = carName;
	}
	
	Car(String company, String carName, String carColor){
		this(company, carName);
		this.carColor = carColor;
	}
	
	Car(String company, String carName, String carColor, int carDoor){
		this(company, carName, carColor);
		this.carDoor = carDoor;
	}
	Car(String company, String carName, String carColor, int carDoor, double carWeight){
		this(company, carName, carColor, carDoor);
		this.carWeight = carWeight;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", carDoor=" + carDoor
				+ ", carWeight=" + carWeight + "]";
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		System.out.println(c1);

	}

}
