package com.javaex.oop.goods.v4;

//	Goods v4 this
//	this -> 현재 인스턴스 자체를 지칭
//	this(...) -> 현재 클래스 내부의 다른 생성자를 지칭
class Goods {  // 디폴트생략
	// 필드	
	private String name;  
	private int price;	 
	
	// 생성자
	public Goods(String name) {
		this.name = name;	
	}
		
	public Goods(String name, int price) { 
//		this.name = name;
		this(name); //	다른 생성자 호출
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
			
//			Goods notebook = new Goods();
//			notebook.setName("LG그램");
			Goods notebook = new Goods.("LG그램" , 900_0000);
			
			notebook.showInfo(); // System.out.println 대신 사용함
			
			Goods mug = new Goods();
			mug.setName("머그컵");
			mug.setPrice(2_000);
			
			mug.showInfo();
		}

		 		
	}		
	
}

	
