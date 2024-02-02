package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class HyundaiCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("HyundaiCar - 시동이 부드럽게 잘 걸린다.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void turnOff()throws InterruptedException {
		System.out.println("HyundaiCar - 시동이 부드럽게 잘 꺼진다.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("HyundaiCar - 엑셀이 터보로 동작된다.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footbreak() throws InterruptedException {
		System.out.println("HyundaiCar - 브레이크가 부드럽게 동작된다.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}