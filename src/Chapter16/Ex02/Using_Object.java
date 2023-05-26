package Chapter16.Ex02;

class Banana {
	Banana () {}
	Banana (String name) {
		this.name = name;
	}
	String name;
}

class Orange {
	Orange () {}
	Orange (String name) {
		this.name = name;
	}
	String name;
}

class Pencil {
	Pencil () {}
	Pencil (String name) {
		this.name = name;
	}
	String name;
}



class Goods2{
	
	// 필드
	private Object obj = new Object();
	
	// getter : 필드의 값을 리턴
	public Object getObj () {
		return obj;
	}
	
	// setter : 필드의 값을 할당
	public void setObj(Object obj) {	// obj 변수에 자바의 모든 클래스(여러 타입)를 담을 수 있다.
		this.obj = obj;
	}
	
	
	
}


public class Using_Object {

	public static void main(String[] args) {
		/*
		 	Object 모든 클래스의 부모이다.
		 		- 모든 객체는 Object 타입으로 저장이 가능
		 		- 다운캐스팅해서 필드/메소드의 내용을 출력할 수 있다.
		 		- 문제가 발생됨 : Object 업캐스팅 되어서 들어간 하위 타입을 알아내기가 어렵다.
		 */
		
		// 1. Goods2 객체 생성
		Goods2 g2 = new Goods2();
		
		// Goods2(상품) : Banana 바나나
		Banana b1 = new Banana("바나나");
		g2.setObj(b1); 		// b1 : Banana ===> Object으로 자동 업캐스팅됨.
		
		Object o1 = g2.getObj();	// getter를 사용해서 객체를 가지고 온다.
		Banana bb1 = (Banana) o1;	// 다운 캐스팅
		System.out.println(bb1.name);
		
		// Goods2(상품) : 오렌지
		g2.setObj(new Orange("오렌지"));		// Orange ==> Object으로 업캐스팅 되어서 들어감.
		
		System.out.println(((Orange)g2.getObj()).name);
		
		// Goods (상품) : Pencil 연필
		g2.setObj(new Pencil("연필"));		// Pencil ===> Object
		
		System.out.println(((Pencil)g2.getObj()).name);
		
		
		

	}

}
