package ch09.resolve07.answer01;

public class Add {
	int a, b;

	public  Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setValue(int _a, int _b) {
		a = _a;
		b = _b;
	}
	public int calculate() {
		int result = 0;
		result = a + b;
		System.out.println("결과:" +result);
		return result;
	}
	
}
