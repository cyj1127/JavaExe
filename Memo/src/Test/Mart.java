package Test;
public class Mart {
	private int price ;
	private int totalMoney;
	 String pear;
	
	
	public Mart(int price, int totalMoney, String pear) {
		this.price = price;
		this.totalMoney = totalMoney;
		this.pear = pear;
	}
	
		public void calculator() {
			if(totalMoney >= price) {
				int change = totalMoney - price;
			System.out.println(pear + "를" + price + "에 구매하였습니다.");
			System.out.println("거스름돈은" + change + "원 입니다.");
			}
			else {
				System.out.println("돈이 부족하여 구매할 수 없습니다.");
			}
			}
		public static void main(String[] args) {
			Mart mart = new Mart(2500,5000,"배");
			
			mart.calculator();
		}
			}
	
