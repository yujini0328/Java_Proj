package Chapter08.Ex03;


public class Car {		// 외부 패키지에서 접근 가능
	
	private String company;
	private String carName;
	private int carMaxSpeed;
	private double carWeight;
	
	// getter, setter를 생성해서 각 필드의 값을 넣고(setter) 출력 (getter)
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public int getCarMaxSpeed() {
		return carMaxSpeed;
	}
	
	public void setCarMaxSpeed(int carMaxSpeed) {
		this.carMaxSpeed = carMaxSpeed;
	}
	public double getCarWeight() {
		return carWeight;
	}
	
	public void setCarWeight(double carWeight) {
		this.carWeight = carWeight;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
