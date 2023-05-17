package Chapter07.Ex03;

class Product {
	// 생성자 오버로딩 필드의 객수에 따라서 생성자 생성 : 5개 생성자(기본 생성자....)
	// 객체 자체를 출력시 그 객체의 필드의 내용을 출력
	
	// 기본 생성자
	public Product () {}
	
	String proName ;	// 제품이름
	int proNo;			// 제품번호
	int proPrice;		// 제품가격
	int proCount;		// 제품수량
	
	// 객체를 출력시 객체의 필드의 값을 출력
	@Override
	public String toString() {
		return "Product : proName = " + proName + " , proNo = " + proNo + ", proPrive = " + proPrice 
				+ " , proCount = " + proCount  ;
	}
	
	// 매개변수 1
	public Product(String proName) {
		super();
		this.proName = proName;
	}
	// 매개변수 2
	public Product(String proName, int proNo) {
		super();
		this.proName = proName;
		this.proNo = proNo;
	}
	// 매개변수 3
	public Product(String proName, int proNo, int proPrice) {
		super();
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
	}
	// 매개변수 4
	public Product(String proName, int proNo, int proPrice, int proCount) {
		super();
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.proCount = proCount;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product("자동차");
		Product p3 = new Product("자동차", 1234);
		Product p4 = new Product("자동차", 1234, 1000);
		Product p5 = new Product("자동차", 1234, 1000, 100);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		
		
	}

}
