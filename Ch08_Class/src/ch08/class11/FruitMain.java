package ch08.class11;


public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20);
		FruitBuyer buyer = new FruitBuyer(10000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		
		//buyer.buyApple(seller, 2000);
		seller.saleApple(buyer, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
