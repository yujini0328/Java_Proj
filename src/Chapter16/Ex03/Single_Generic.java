package Chapter16.Ex03;


class Apple { String apple = "사과"; }
class Banana {String banana = "바나나";}
class Pencil { String pencil = "연필";}


class Goods <T> {	// 클래스 이름 뒤의 <T> : 객체를 생성할때 지정되는 타입
	private T t;
	
	// getter
	public T getT() {
		return t;
	}
	
	// setter
	public void setT(T t) {
		this.t = t;
	}
}


public class Single_Generic {

	public static void main(String[] args) {
		/*
		 	제너릭 클래스 : 다양한 타입을 저장할 수 있는 클래스
		 		- 클래스 이름 뒤에 : <T> 	<== 인풋되는 타입을 지정함.	T : Type
		 		- 객체를 생성할때 <T>에 들어있는 타입을 지정해서 객체를 생성하게 됨.
		 		- <T>에 들어오는 타입은 반드시 객체형 자료형이어야 한다. 기본 자료형은 올 수 없다.
		 		  wrapper class를 사용함.
		 		  
		 		  Wrapper class : 기본 자료형을 객체형 자료형으로 만듬.
		 		  	  기본자료형 <===> 객체형자료형
		 		  	- boolean <===> Boolean 
		 		  	- char	  <===> Charter
		 		  	- byty	  <===> Byte
		 		  	- short   <===> Short
		 		  	- int     <===> Integer
		 		  	- long    <===> Long
		 		  	- float   <===> Float
		 		  	- double  <===> Double
		 		  
		 */
		
		// 사과 객체 생성
		Goods <Apple> apple = new Goods<Apple>();
		
		// Setter를 사용해서 Apple 객체를 주입
		apple.setT(new Apple()); 	// setter 사용해서 Apple 객체를 주입
		
		// getter를 사용해서 Apple 객체를 가져옴. // 자신이 원하는 객체를 주입후 다운캐스팅 없이 출력
		System.out.println(apple.getT().apple);
		
		// 바나나 객체를 저장
		Goods <Banana> banana = new Goods <Banana> ();
		
		// Setter를 사용해서 Banana 객체 주입
		banana.setT(new Banana());
		
		// Getter를 사용해서 Banana 객체를 가져와서 필드의 내용을 출력	// 다운캐스팅 없이 필드의 내용을 출력
		System.out.println(banana.getT().banana);
		
		// 연필 객체를 저장
		Goods <Pencil> pencil = new Goods <>();
		
		// Setter를 사용해서 Pencil 객체를 저장
		pencil.setT(new Pencil());
		
		// Getter를 사용해서 Pencil 객체의 필드를 줄력
		System.out.println(pencil.getT().pencil); 

	}

}
