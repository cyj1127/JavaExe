package resolve14.resolve02;

public class Sony implements ITablet {

	@Override
	public void movie() throws InterruptedException{
		System.out.println("Sony - 색감이 너무 좋다!");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("Sony - 베이스가 듣기 좋다!");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void readBook() throws InterruptedException{
		System.out.println("Sony - 눈에 피로함이 적다!");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

}
