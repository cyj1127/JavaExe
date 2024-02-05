package resolve14.resolve01;

public class razerPrinter extends Printer{
	private int tonerLevel = 50;
	
	
	public razerPrinter(String model,String made,
			String infCnt, int tonerLevel) {
		super(model,made,infCnt);
		this.tonerLevel = tonerLevel;
	}
		public void print() {
			super.print();		//종이를 1매씩 출력
			this.printPaperCnt++;
			this.tonerLevel -= 1;
			System.out.println("정상적으로 출력중입니다.");
		}
		@Override
		public String toString() {
			return "razerPrinter [tonerLevel=" + tonerLevel + ", model=" + model + ", made=" + made + ", infCnt="
					+ infCnt + ", printCnt=" + printCnt + ", printPaperCnt=" + printPaperCnt + "]";
		}
	
	}
