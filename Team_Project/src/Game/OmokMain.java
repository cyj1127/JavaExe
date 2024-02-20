package Game;

import java.util.Scanner;

public class OmokMain {
	public static void main(String[] args) {
		// x,y 좌표 입력받기 위한 스캐너 생성
		Scanner sc = new Scanner(System.in);
		int _x;
		int _y;
		// x,y 좌표 입력받기
		while (true) {
			System.out.println("X좌표를 입력하세요");
			_x = sc.nextInt();
			System.out.println("Y좌표를 입력하세요");
			_y = sc.nextInt();

			sc.close();
		}

	}
}
