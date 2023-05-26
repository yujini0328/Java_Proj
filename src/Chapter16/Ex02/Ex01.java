package Chapter16.Ex02;

class Tiger {
	String name = "호랑이";
	
}
class Lion {
	String name = "사자";
}
class Eagle {
	String name = "독수리";
}

class Animal {
	
	private Object obj = null ;
	
	//getter : 객체정보 출력
	public Object getobj() {
		return obj;
	}
	
	//setter : obj 필드의 값을 적용
	public void setobj (Object obj) {
		this.obj = obj;
	}
}


public class Ex01 {

	public static void main(String[] args) {
		/*
		 	Animal 클래스에 Tiger, Lion, Eagle 객체를 Setter 주입하고 ===> Object 타입
		 	getter 사용해서 가져와서 name 필드를 출력
		 	
		 */
		
		// Tiger
		Animal a1 = new Animal();
		
		Tiger t1 = new Tiger();
		a1.setobj(t1);
		
		Object o1 = a1.getobj();
		Tiger tt1 = (Tiger) o1;
		System.out.println(tt1.name);
		
		a1.setobj(new Tiger());
		System.out.println(((Tiger)a1.getobj()).name);

		
		// Lion
		a1.setobj(new Lion());
		System.out.println(((Lion)a1.getobj()).name);
		
		// Eagle
		a1.setobj(new Eagle());
		System.out.println(((Eagle)a1.getobj()).name);
		

	}

}
