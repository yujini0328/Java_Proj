package Chapter16.Ex03;

class Tiger {
	String name = "호랑이";
	
}
class Lion {
	String name = "사자";
}
class Eagle {
	String name = "독수리";
}


class Animal <T> {
	
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// Animal Generic 클래스에 Tiger, Lion, Eagle 클래스를 Setter 주입하고, Getter로 가져와서 필드의 내용을 출력
		
		// Tiger
		Animal <Tiger> tiger =  new Animal<Tiger>();
		
		tiger.setT(new Tiger());
		System.out.println(tiger.getT().name);
		
		// Lion
		Animal <Lion> lion =  new Animal<Lion>();
		
		lion.setT(new Lion());
		System.out.println(lion.getT().name);
		
		// Eagle
		Animal <Eagle> eagle =  new Animal<Eagle>();
		
		eagle.setT(new Eagle());
		System.out.println(eagle.getT().name);

	}

}
