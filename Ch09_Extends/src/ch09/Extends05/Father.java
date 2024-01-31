package ch09.Extends05;

public class Father extends GrandFather{
	
	//long타입은 마지막에 L을 붙혀줘야 long 타입이 됨
	private long money = 10000000000000000L;
	
	public Father(){
		System.out.println("Father 생성자");
	}
	public Father(int score, long money){
		super(score);	//GrandFather의 매개변수 생성자 호출
		this.money = money;
		System.out.println("Father 매개변수 생성자");
	}
	public void wealth() {
		System.out.println("돈이 많다");
	}
}
