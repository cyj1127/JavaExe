package resolve14.resolve02;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;

	// 외부에서 데이터 값을 필드에 주입
	// CarTest는 ICar에 의존적이다.
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;

	}


	public TabletTester() {
		// TODO Auto-generated constructor stub
	}


	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}

	public int movieTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.movie();
			tablet.movie();
		}
		return (int) (Math.random() * 50) + 50; // 0이상~99이하 ,(int)형 변환으로 소수점 사라짐
	}

	public int musicTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.music();
			
		}
		return (int) (Math.random() * 50) + 50;
	}

	public int readBookTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.readBook();
			
		}
		return (int) (Math.random() * 50) + 50;
	}
}
