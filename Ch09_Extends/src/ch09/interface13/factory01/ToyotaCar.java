package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class ToyotaCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("ToyotaCar - 정확하게 걸린다 데스.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void turnOff()throws InterruptedException {
		System.out.println("ToyotaCar - 시동이 잘 꺼진다 데스.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("ToyotaCar - 혼또니 이빠이 빠르다 데스.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footbreak() throws InterruptedException {
		System.out.println("ToyotaCar - 부드럽게 멈췄다 데스.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
