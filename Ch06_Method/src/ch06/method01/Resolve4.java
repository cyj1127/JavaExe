package ch06.method01;
//4. gugudan(3);

//구구단 메서드를 void 리턴형으로 제작하세요.
//3을 입력하면 3단이 출력됩니다.
import java.util.Scanner;

public class Resolve4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("단을 입력하세요 >>");
				int dan = sc.nextInt();
		
			gugudan(dan);
							
		sc.close();
	}
	public static void gugudan(int num0) {
				for(int i=num0;i<=9;) {
			for(int j=1;j<=9;j++) {
			
			System.out.println(i+"x"+j+"="+(i*j));
						}
			}		
		}
}
