package ch09.resolve07;

public class CalculateMain {
	public static void main(String[] args) {
		Add add1 = new Add();
		Div div1 = new Div();
		Mul mul1 = new Mul();
		Sub sub1 = new Sub();
		
		add1.setValue(2, 5);
		div1.setValue(2, 5);
		mul1.setValue(2, 5);
		sub1.setValue(2, 5);
		
		add1.calculate();
		div1.calculate();
		mul1.calculate();
		sub1.calculate();
		
	}


}
