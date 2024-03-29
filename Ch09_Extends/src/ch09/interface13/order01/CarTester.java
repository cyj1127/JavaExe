package ch09.interface13.order01;

import ch09.interface13.ICar;

public class CarTester {
	private final int TEST_NUM = 3;
	private ICar car;
	
	//외부에서 데이터 값을 필드에 주입
	//CarTest는 ICar에 의존적이다.
	public CarTester(ICar car) {
		this.car = car;
		
	}
	public CarTester() {
		
	}

	public void setCar(ICar car) {
		this.car = car;
	}
	public int onOffTest() throws InterruptedException{
		for(int i=0;i<TEST_NUM;i++) {
		car.turnOn();
		car.turnOff();
		}
		return (int)(Math.random()*50) + 50;   //0이상~99이하 ,(int)형 변환으로 소수점 사라짐
	}
	public int speedTest() throws InterruptedException{
		for(int i=0;i<TEST_NUM;i++) {
			car.accel();
			car.accel();
			car.accel();
		}
		return (int)(Math.random()*50) + 50;
	}
	public int footBreakTest() throws InterruptedException{
		for(int i=0;i<TEST_NUM;i++) {
			car.accel();
			car.footbreak();
			car.footbreak();
			car.footbreak();
		}
		return (int)(Math.random()*50) + 50;	}
	public int driveTest() throws InterruptedException{
		for(int i=0;i<TEST_NUM;i++) {
			car.turnOn();
			car.accel();
			car.accel();
			car.footbreak();
			car.footbreak();
			car.turnOff();
		}
		return (int)(Math.random()*50) + 50;	}
}
