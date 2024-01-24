package ch02.input03;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		int result = 0;
		int num0 = 0, num1 = 0;
		
		//라이브러리에(JDK를 포함한)에 존재하는 클래스는
		//Ctrl + Shift + O 를 누르면 자동으로 PAKAGE 경로를 등록해준다.
		//JDK에서 제공, 키보드에서 입력을 받을 때 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("더하기 연산을 합니다.");
		System.out.println("1번째 숫자 입력 >>");
		num0 = sc.nextInt();
		System.out.println("2번째 숫자 입력 >>");
		num1 = sc.nextInt();
		
		//결과 계산
		// =(대입 연산자) 는 우측의 연산이 모두 완료된 후 처리된다.
		result = num0 + num1;
		System.out.println("결과는" + result);
		
		
		sc.close(); //키보드 입력을 그만 받을 때 사용(연결이 끊어짐)
	}

}
