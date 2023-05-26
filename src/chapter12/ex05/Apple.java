package chapter12.ex05;

public class Apple implements Fluit {

	@Override
	public void name() {
		System.out.println("사과");

	}

	@Override
	public void eat() {
		System.out.println("사과를 먹습니다.");

	}

	@Override
	public void color() {
		System.out.println("빨간색 ");

	}

}
