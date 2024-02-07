package ch13.sec01;

public class GenericExample {
public static void main(String[] args) {
	
	Box<String> box1 = new Box<>();
	box1.content = "안녕하세여.";
	String str = box1.content;
	System.out.println(str);
	
	Box<String> box2 = new Box<>();
	box2.content = 100;
	int value = box2.content;
	System.out.println(value);
}
}
