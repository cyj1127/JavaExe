package ch09.Extends03;

public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child();
		child.handsome();
		child.wealth();
		child.play();
		
		System.out.println("당신의 얼굴은 10점 만점에 " +child.handsomeScrore + "점 입니다.");
		System.out.println("돈 :" + child.money);
		System.out.println("즐거운 날 : " + child.day);
	}
	

}
