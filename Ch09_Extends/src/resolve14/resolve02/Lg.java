package resolve14.resolve02;

public class Lg implements ITablet {

	@Override
	public void movie() throws InterruptedException{
		System.out.println("LG - 화질이 굉장히 좋다!");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("LG - 음질이 굉장히 좋다!");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LG - 선명도가 굉장히 좋다!");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

}
