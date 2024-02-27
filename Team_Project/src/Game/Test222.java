package Game;

import java.util.Scanner;

public class Test222 {

	
	public static int count = 0;
	public static final int GAMESTATE = 0;
	public static final int BLACK = 1;
	public static final int WHITE = 2;

	public static void Board() {
		// 오목판 생성 메서드
		final char board[][] = new char[11][11];

		// x,y 좌표 변수 생성 및 초기화
		int _x = 0;
		int _y = 0;

		// 가로 세로 10x10 오목 테이블 생성
		for (int y = 0; y < 11; y++) {
			for (int x = 0; x < 11; x++) {
				board[y][x] = '.';
				System.out.print(board[y][x]);
			}
			System.out.println();
		}
	}
	
	
	

	public static void main(String[] args) {
		// 좌표를 입력받고 승리시 메세지 출력
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			Board();			
			System.out.println("x좌표를 입력하세요");
			int x = sc.nextInt();
			System.out.println("y좌표를 입력하세요");
			int y = sc.nextInt();

			if (count == 5) {
				System.out.println("게임이 종료됩니다.");
				break;
			}
			sc.close();
		}

	}
}
