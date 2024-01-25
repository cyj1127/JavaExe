package ch03.for10;

import java.util.Scanner;

public class Resolve14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num ;
		num = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(num + "X" + i + "=" +(num*i));
		}
		sc.close();
	}

}
