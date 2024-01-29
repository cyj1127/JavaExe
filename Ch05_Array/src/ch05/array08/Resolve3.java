package ch05.array08;

import java.util.Arrays;

//정수배열 5개를 할당하고
//System.out.println(Arrays.toString(numArr));
//로 배열을 출력했을 때
//거꾸로 출력되도록 배열의 값을 거꾸로 저장하세요.
public class Resolve3 {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5 };
		int[] numArr1 = new int[5];

	    for(int i=0;i<numArr1.length;i++) {
	    	numArr1[i] = numArr[numArr.length-1];
	}
	    System.out.println(Arrays.toString(numArr1));

}
}