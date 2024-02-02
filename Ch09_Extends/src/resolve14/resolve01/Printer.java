package resolve14.resolve01;

public class Printer {
	 String model;
	 String made;
	 String infCnt;
	 int printCnt;
	 int printPaperCnt;
	
	public Printer() {
		System.out.println("Printer 생성자");
	}

	public Printer(String model,String made, String infCnt) {
		this.model = model;
		this.made = made;
		this.infCnt = infCnt;
		this.printCnt = 0;
		this.printPaperCnt = 100;
	}
}
