package ch15.thread01.ch14.sec04;

public class ThreadNameExcaple {
public static void main(String[] args) {
	Thread mainthread = Thread.currentThread();
	System.out.println(mainthread.getName());
	
	for(int i=0;i<3;i++) {
		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");
		}
	};
	threadA.start();
}
	
	Thread chatThread = new Thread() {
		@Override
		public void run() {
			System.out.println(getName() + "실행");
		}
	};
	chatThread.setName("chat-Thread");
	chatThread.start();
}
}
