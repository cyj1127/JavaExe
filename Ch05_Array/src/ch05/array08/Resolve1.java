package ch05.array08;

import java.util.Arrays;

//1. 정수 배열 5개를 할당하고
//Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
public class Resolve1 {
	public static void main(String[] args) {
		int[] num = { 47, 3, 16, 18, 26 };

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		System.out.println("최소값: " + num[0]);
		System.out.println("최대값: " + num[num.length-1]);
	}

}
