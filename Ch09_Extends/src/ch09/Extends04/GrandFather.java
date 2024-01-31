package ch09.Extends04;

public class GrandFather {
	int handsomeScrore;
	
	GrandFather(){
		System.out.println("GrandFather 생성자");
	}
	GrandFather(int score){
		this.handsomeScrore = score;
		System.out.println("GrandFather 생성자");
	}
	
	void handsome() {
		System.out.println("얼굴이 깔끼하노");
	}

}
