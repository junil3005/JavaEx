package com.javaex.oop.goods.v3;

import com.javaex.oop.goods.v2.Goods;

//	Goods v3. 생성자
//	생성자가 만들어져 있지 않으면 JVM이 기본생성자를 끼워 넣는다.
//  개발자가 생성자를 만들면 JVM은 기본생성자를 끼워넣지 않는다.
//	Setter가 없으면 Read-Only

class Goods {  // 디폴트생략
	// 필드	
	private String name;  
	private int price;	 
	
	// 생성자
	public Goods(String name, int price) { 
		this.name = name;
		this.price = price;		
	}
	
	public String getName() { // 규칙
		return name; // 네임필드를 위한 게터
		
	}
	
//	public void setName(String name) {
//		this.name = name;
//		// this -> 현재 인스턴스 자체		
//	}
	
	public int getPrice() { // 파라미터 x
		return price;
		
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//		
//	}
	
	// 일반 메서드 
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.printf("가격: %,d원%n", price);
		
	}
	// Goods 테스트 클래스
		public class GoodsApp { // 퍼블릭

		public static void main(String[] args) {
//			Goods camera = new Goods();
//			camera.name = "Nikon";
			Goods camera = new Goods("Nikon", 400_000);	
			camera.showInfo();
//			
			
			Goods notebook = new Goods();
			notebook.setName("LG그램");
			notebook.setPrice(900_0000);
			
			notebook.showInfo(); // System.out.println 대신 사용함
			
			Goods mug = new Goods();
			mug.setName("머그컵");
			mug.setPrice(2_000);
			
			mug.showInfo();
		}

		 		
	}		
	
}

	
