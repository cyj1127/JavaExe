package ch06.method01;
/*1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
   작은 값을 반환하는 메서드를 작성하고 사용하세요
   */

import java.util.Scanner;

public class Resolve1 {

public static int minnum(int num0, int num1){

	if(num0<num1) 
		
	
	}

	public static int max(int num0, int num1) {
		if (num0 < num1)
			return;
	}

	public static void ArithResult(int result0) {
		System.out.println("작은 값은: " + result0);
	}

	public static void ArithResult1(int result1) {
		System.out.println("큰 값은: " + result1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력");
		int num0 = sc.nextInt();
		System.out.println("두 번째 정수 입력");
		int num1 = sc.nextInt();

		int result = minnum(num0, num1);
		int result1 = maxnum(num0, num1);
		ArithResult(result);
		ArithResult1(result1);

		sc.close();
	}
}
