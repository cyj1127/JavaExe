package ch15.thread01.ch14.sec06.exam02;

public class WorkObject {
public synchronized void methodA() {
	Thread thread = Thread.currentThread();
	System.out.println(thread.getName()+": methodA 작업 실행");
	//아래 부분을 주석처리하면 ThreadA와 ThreadB가 제각각
	//동작하는 것을 볼 수 있다.
	notify();
	try {
		wait();
	}catch (InterruptedException e) {
		
	}
}

public synchronized void methodB() {
	Thread thread = Thread.currentThread();
	System.out.println(thread.getName()+": methodB작업 실행");
	//아래 부분을 주석처리하면 ThreadA와 ThreadB가 제각각
		//동작하는 것을 볼 수 있다.
	notify();
	try {
		wait();
	}catch (InterruptedException e) {
}
}
}
