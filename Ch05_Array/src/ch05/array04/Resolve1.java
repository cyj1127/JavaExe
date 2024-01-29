package ch05.array04;

//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve1 {
	public static void main(String[] args) {
		String [] names = {"일번","이번","삼번","사번","오번","육번",
				"칠번","팔번","구번","십번"};
		
		System.out.println(names.length);
		for(int i=0; i<=names.length;i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.println();
	}
}
