package resolve14.resolve01;

public class inkjetPrinter extends Printer{
	private int inkLevel = 50;
	
	
	public inkjetPrinter(String model,String made,
			String infCnt, int inkLevel) {
		super(model,made,infCnt);
		this.inkLevel = inkLevel;
		
	}
}
