package ch06.method01;

import java.util.Scanner;

//매서드를 만들기 전 코드
public class MethodEx2 {
	
	//main메서드 내의 계산하는 부분을 옮긴다.
	//void 함수는 리턴을 하지 않고 계산만 하는 함수다.
	public static void calcArith(int num0, int num1, String op) {
		int result = 0;		//결과값 저장 변수

		//계산을 하는 부분
		switch (op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default:
			break;
		}
		//결과값 출력
		System.out.println("결과값은" + result + "입니다.");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//처리하기 전 입력받는 부분
		System.out.println("1번째 정수 입력");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수 입력");
		int num1 = sc.nextInt();
		System.out.println("연산자 정수 입력");
		String op = sc.next();
		
		calcArith(num0,num1,op);

		sc.close();
		
	}
}
