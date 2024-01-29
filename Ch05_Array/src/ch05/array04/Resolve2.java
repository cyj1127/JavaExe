package ch05.array04;

//2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
public class Resolve2 {
	public static void main(String[] args) {
		String [] names = {"일번","이번","삼번","사번","오번","육번",
				"칠번","팔번","구번","십번"};
		
		System.out.println(names.length);
		for(int i=names.length-1; i>=0;i--) {
			System.out.print(names[i] + ", ");
		}
		System.out.println();
	}

}
