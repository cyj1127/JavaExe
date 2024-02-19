package Game;

public class Test {
	public static void main(String[] args) {
		char board[][] = new char[11][11];

		for (int y = 0; y < 11; y++) {
			for (int x = 0; x < 11; x++) {
				board[y][x] = '.';
				System.out.print(board[y][x]);
			}
			System.out.println();
		}
	}
}
