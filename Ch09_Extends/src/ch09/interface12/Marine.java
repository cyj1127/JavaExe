package ch09.interface12;

public class Marine implements StarUnit {

	@Override
	public void walk() {
		System.out.println("아장아장");
	}

	@Override
	public void attack() {
		System.out.println("DuDuDuDu!");

	}

	@Override
	public void die() {
		System.out.println("으악~!!");

	}

}
