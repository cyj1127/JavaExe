package Game;

/*1.테이블 생성
 *2.흑돌과 백돌 좌표 입력받기
 *3.
 */
public class Board {

	public Board() {
		// 오목판 생성
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

}
