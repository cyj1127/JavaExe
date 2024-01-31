package ch08.class09;
//2. 중화요리집을 임의대로 클래스로 만드세요
public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		
		rest.viewMenu();
		rest.selectMenu();
		rest.deliveryMenu();
		rest.KeyEnd();
	}

}
