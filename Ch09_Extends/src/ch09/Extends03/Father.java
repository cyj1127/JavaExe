package ch09.Extends03;

public class Father extends GrandFather{
	
	//long타입은 마지막에 L을 붙혀줘야 long 타입이 됨
	long money = 10000000000000000L;
	
	Father(){
		System.out.println("Father 생성자");
	}
	
	void wealth() {
		System.out.println("돈이 많다");
	}
}
