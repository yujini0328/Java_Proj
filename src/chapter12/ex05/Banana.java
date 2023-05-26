package chapter12.ex05;

public class Banana implements Fluit {

	@Override
	public void name() {
		System.out.println("바나나");
		
	}

	@Override
	public void eat() {
		System.out.println("바나나를 먹습니다.");
		
	}

	@Override
	public void color() {
		System.out.println("노란색");
		
	}

}
