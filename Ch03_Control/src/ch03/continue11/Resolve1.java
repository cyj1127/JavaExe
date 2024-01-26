package ch03.continue11;

//3.for문을 이용해서 1부터 100까지의 정수 주에서 3의 배수의 총합을 출력하는 코드를 작성해보세요.
public class Resolve1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i =1;i<=100;i++) {
			if(i % 3==0)
			sum = sum+i;		
				}
		System.out.println(sum);
	}
	}
