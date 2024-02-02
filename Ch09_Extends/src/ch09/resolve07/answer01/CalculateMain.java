package ch09.resolve07.answer01;

public class CalculateMain {
	public static void main(String[] args) {
		Add add = new Add(2,5);
		Div div = new Div(2,5);
		Mul mul = new Mul(2,5);
		Sub sub = new Sub(2,5);
		
		
		add.calculate();
		div.calculate();
		mul.calculate();
		sub.calculate();
		
	}


}
