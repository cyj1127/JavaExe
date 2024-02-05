package resolve14.resolve01;

public class Printer {
	protected String model;
	protected String made;
	protected String infCnt;
	protected int printCnt;
	protected int printPaperCnt;

	public Printer(String model, String made, String infCnt) {
		this.model = model;
		this.made = made;
		this.infCnt = infCnt;
		this.printCnt = 0;
		this.printPaperCnt = 100;
	}

	public void print() {
		printPaperCnt--;
	}	
}
