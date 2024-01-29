package ch06.method01;
//4. gugudan(3);

//구구단 메서드를 void 리턴형으로 제작하세요.
//3을 입력하면 3단이 출력됩니다.
import java.util.Scanner;

public class Resolve4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("단을 입력하세요 >>");
				int dan = sc.nextInt();
		
				int result = gugudan(dan);
				System.out.println(result);				
		sc.close();
	}
	public static void gugudan(int num0) {
		for(int i=num0;i<=9;i++) {
			for(int j=1;j<=9;j++) { 	
			System.out.println(num0+"x"+j+"="+(i*j));
			
			}
		}
}
}