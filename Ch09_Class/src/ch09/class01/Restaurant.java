package ch09.class01;

import java.util.Scanner;

//2. 중화요리집을 임의대로 클래스로 만드세요
	public class Restaurant {
		private String[] menu = {"짜장면", "짬뽕", "탕수육", "깐풍기"};
		
		private int selectNum;
		private Scanner sc = new Scanner(System.in);
		
		public void viewMenu() {
			for(int i=0;i<menu.length;i++) {
				System.out.println(i + "." + menu[i]);
			}
		}
		public void selectMenu() {
			System.out.println("메뉴를 고르세요 >>");
			selectNum = sc.nextInt();
		}
		
		public void deliveryMenu() {
			String menus = menu[selectNum];
			System.out.println(menus + "이(가) 나왔습니다.");
			
			
		}
		public void KeyEnd() {
			sc.close();
		}
		
	}
