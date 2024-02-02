package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("FordCar - sidong ON is pooding.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void turnOff()throws InterruptedException {
		System.out.println("FordCar - sidong Off is mallangCow.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("FordCar - So very fast.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footbreak() throws InterruptedException {
		System.out.println("FordCar - Pooding break.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
