package resolve14.resolve03;

//GeneratorThreeNum // 난수 3개를 생성하는 역할
public class GeneratorThreeNum {

	public static int[] getRandomNum() {
		int[] numArr = new int[3];

		// 1번째 난수 생성
		numArr[0] = (int) Math.random() * 10; // (int)를 붙혀줘야 정수형으로 나온다.

		boolean isRun = true;
		while (isRun) {
			int rNum = (int) Math.random() * 10;
			/*
			 * 1번째 값과 같으면 다시 반복해서 다시 생성해라.
			 */
			if (rNum == numArr[0])
				continue;

			numArr[1] = rNum;
			isRun = false;
		}

		while (isRun) {
			int rNum = (int) Math.random() * 10;
			/*
			 * 1번째 값과 같으면 다시 반복해서 다시 생성해라.
			 */
			if (rNum == numArr[0] || rNum == numArr[1])
				continue;

			numArr[2] = rNum;
			isRun = false;
		}
		return numArr;
	}
}