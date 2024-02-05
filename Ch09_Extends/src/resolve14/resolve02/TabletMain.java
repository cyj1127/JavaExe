package resolve14.resolve02;
//
//[시나리오]
//1. Bit camp 는 자동차 산업을 진출하기 위해 자동률 OEM 생산주문 하기로 결정했다.
//   자동차의 Specification 를 각 자동차 제조사에 제공하기위해
//   interface 를 사용해서 구현해야 할 기능을 메서드로 정해서 자동차 제조사에 보냈다.
//   - ICar 인터페이스 정한다.abstract
//  
//2.A 자동차 제조사
//	현대, 토요타, 포드는 ICar를 상속받아서 구현 클래스를 생성한다.
//	이 구현 클래스의 메서드 기능은 각 회사의 기술력이 담겨질 것이다.
//	구현 클래스가 완성되면 Bit camp 에 보내서 테스트를 진행할 예정이다.
//	
//2.B Bit camp
//	자동차 제조사에서 구현클래스(자동차)를 만드는 동안
//	Bit camp 는 이미 정해진 약속인 ICar를 토대로 CatTester클래스를 제작한다.
//	
//3. 자동차제조사는 모두 자동차(구현클래스)를 완성해서 납품하였다.
//   Bit camp 는 Main 에서 자동차 객체를 생성하고
//   CarTester객체에 주입하여 각 자동차의 테스트를 진행한다.
// 4. 테스트 후 최종 점수를 비교하여 제조사를 선택한다.

public class TabletMain {
	public static void main(String[] args) throws InterruptedException {
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] {
				new Sony(),
				new Samsung(),
				new Lg()
		};
		int[] score = new int[tabletArr.length];
		for(int i=0;i<tabletArr.length;i++) {
//			TabletTester.setTablet(tabletArr[i]);
			tabletTester.setTablet(tabletArr[i]);
			
			score[i] += tabletTester.movieTest();
			System.out.printf("Movie 테스트 점수는 %d입니다.",score[i]);
			System.out.println();
			score[i] += tabletTester.musicTest();			
			System.out.printf("Sound 테스트 점수는 %d입니다.",score[i]);
			System.out.println();
			score[i] += tabletTester.readBookTest();
			System.out.printf("readBook 테스트 점수는 %d입니다.",score[i]);
			System.out.println();
			
			System.out.printf("전체 테스트 점수는 %d입니다.",score[i]);
			System.out.println("------------------------------");
		}
		
		//가장 큰 점수를 받은 값과 인덱스 찾기
		int max = score[0];
		int maxIdx = 0;
		for(int i=1;i<score.length;i++) {
			if(max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 태블릿이고 점수는 %d입니다\n",
				maxIdx+1,max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
	}
}
