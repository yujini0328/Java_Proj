package chapter12.ex06;

interface Animal1 {
	void cry() ;   //public abstract  
}
interface Animal2 {
	void run() ; 
}
interface Animal3 {
	void eat(); 
}

//인터페이스가 인터페이스를 상속 할 수 있다. extends 키를 사용한다.      
		// 클래스 가 클래스를 상속 할때. extends 
interface K extends Animal1, Animal2, Animal3 {
	// cry(), run(), eat() 
}

class G implements K {

	@Override
	public void cry() {
		System.out.println("모든 동물은 웁니다. ");	
	}

	@Override
	public void run() {
		System.out.println("모든 동물은 달립니다.");
	}

	@Override
	public void eat() {
		System.out.println("모든 동물은 먹습니다. ");
	}
	
}


public class Inharitance02 {

	public static void main(String[] args) {
		//
		K k1 = new G();     
		k1.cry();
		k1.eat();
		k1.run();
		
		Animal1 a1 = new G(); 
		a1.cry();
		
		Animal2 a2 = new G(); 
		a2.run();
		
		Animal3 a3 = new G(); 
		a3.eat();
		
		
		

	}

}
