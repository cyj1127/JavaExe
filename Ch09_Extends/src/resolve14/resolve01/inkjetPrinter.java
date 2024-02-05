package resolve14.resolve01;

public class inkjetPrinter extends Printer {
	private int inkLevel = 50;

	public inkjetPrinter(String model, String made, String infCnt, int inkLevel) {
		super(model, made, infCnt);
		this.inkLevel = inkLevel;

	}

	public void print() {
		super.print();		//종이를 1매씩 사용
		this.printPaperCnt ++;
		this.inkLevel -= 1;
		System.out.println("정상적으로 출력중입니다.");
	}

	@Override
	public String toString() {
		return "inkjetPrinter [inkLevel=" + inkLevel + ", model=" + model + ", made=" + made + ", infCnt=" + infCnt
				+ ", printCnt=" + printCnt + ", printPaperCnt=" + printPaperCnt + "]";
	}
	
	
	
}
