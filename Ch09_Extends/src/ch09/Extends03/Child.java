package ch09.Extends03;

public class Child extends Father{
	
	float day = 365 + 1.0f/4;
	
	
	Child(){
		System.out.println("Child 생성자");
	}
	
	void play() {
		System.out.println("인생은 아름다워");
	}
}
