package ch05.array04;

import java.util.Arrays;

//4. int배열을 10개 생성하세요.
//int배열에 3의 배수를 차례대로 저장하세요.
//그리고 거꾸로 출력하세요.
public class Resolve4 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i=1;i<num.length;i++) {
			num[i] = 3*(i+1);
		}
		System.out.println(Arrays.toString(num));
		
		for(int i=num.length; i>=0;i--){
			System.out.print(num[i] +",");
		}
	}
}
