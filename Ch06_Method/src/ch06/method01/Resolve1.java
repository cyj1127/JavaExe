package ch06.method01;
/*1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
   작은 값을 반환하는 메서드를 작성하고 사용하세요
   */

import java.util.Scanner;

public class Resolve1 {

	public static void minnum(int num0, int num1) {
		int result = 0;
		if (num0 < num1)
			result = num0;
		else
			result = num1;	
		System.out.println("최소값: " + result);

}
		

	public static void maxnum(int num0, int num1) {
		int result = 0;
		if (num0 < num1)
			result = num1;
		else
			result = num0;	
		System.out.println("최대값: " + result);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력");
		int num0 = sc.nextInt();
		System.out.println("두 번째 정수 입력");
		int num1 = sc.nextInt();

		minnum(num0, num1);
		maxnum(num0, num1);
		
		sc.close();
	}
}
