package ch09.interface12;

public class Scv implements StarUnit {

	@Override
	public void walk() {
		System.out.println("슈루루룩~");
	}

	@Override
	public void attack() {
		System.out.println("징징이");

	}

	@Override
	public void die() {
		System.out.println("펑");

	}

}
