package com.javaex.oop.goods.v2;

// Goods v1. 필드
class Goods {  // 디폴트생략
	// 필드 선언 -> private
	// 정보는 은닉하고 Getter와 Setter를 통한 우회 접근이 필요
	//	데이터를 다루는 기능 (메서드) 함께 구현
	
	private String name;  // private
	private int price;	  // private
	
	// Getters / Setters
	ㅇpublic String getName() { // 규칙
		return name; // 네임필드를 위한 게터
		
	}
	
	public void setName(String name) {
		this.name = name;
		// this -> 현재 인스턴스 자체		
	}
	
	public int getPrice() { // 파라미터 x
		return price;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	// 일반 메서드 
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.printf("가격: %,d원%n", price);
		
	}
	
	
}
// Goods 테스트 클래스
	public class GoodsApp { // 퍼블릭

	public static void main(String[] args) {
		Goods camera = new Goods();
		// 생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		
//		camera.name = "Nikon";
//		camera.price = 400_000;
		camera.setName("Nikon");
		camera.setPrice(400_000);
		
//		System.out.printf("%s -> %,d%n", camera.name,
////				camera.price);
//		
//		System.out.printf("%s -> %,d%n", camera.getName(),
//				camera.getPrice());
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
	
