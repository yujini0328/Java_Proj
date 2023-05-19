package Chapter10.Ex01;

// 부모 클래스(Animal) : 동물
class Animal{
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("Animal - 모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("Animal - 모든 동물은 잠을 잡니다.");
	}
}

// 자식 클래스(Tiger, Eagle, Lion ===> Animal)		// 추가적으로 필드1 :  Sound, 메소드1 : 00Run
class Tiger extends Animal{
	String tigerSound;
	void tigerRun() {
		System.out.println("Tiger - 호랑이는 껑충껑충 달립니다.");
	}
	
}

class Eagle extends Animal{
	String eagleSound;
	void eagleRun() {
		System.out.println("Eagle - 독수리는 하늘을 날아다닙니다.");
	}
}

class Lion extends Animal{
	String lionSound;
	void lionRun() {
		System.out.println("사자는 펄쩍 펄쩍 달립니다.");
	}
}

// 자식의 자식 클래스(LionChild ==> Lion)
class LionChild extends Lion{
	String lionChildSound;
	void lionchildRun() {
		System.out.println("새끼사자는 엉금엉금 기어갑니다.");
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		
		// 부모 : Animal 클래스 생성
		Animal a1 = new Animal();	// a1 :은 Animal 타입만 존재
		
		
		// 자식 : Tiger, Eagle, Lion	===> Animal
		Tiger t1 = new Tiger();		// t1 : Tiger, Animal 타입도 존재
		
		Eagle e1 = new Eagle();		// e1 : Eagle, Animal
		
		Lion l1 = new Lion();		// l1 : Lion, Animal
		
		// 자식의 자식 : LionChild  ===> Lion
		LionChild lc1 = new LionChild();	//lc1 : LionChild, Lion, Animal 타입이 존재
		
		
		
		
	}

}
