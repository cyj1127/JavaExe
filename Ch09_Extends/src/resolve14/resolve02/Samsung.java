package resolve14.resolve02;

public class Samsung implements ITablet {

	@Override
	public void movie() throws InterruptedException{
		System.out.println("Samsung - 주사율이 굉장히 높다!");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("Samsung - 잡음이 굉장히 없다!");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Samsung - 밝기가 아주 적당해!");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
