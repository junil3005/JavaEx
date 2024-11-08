package com.javaex.oop.point.v4;

//	v4. 메서드 오버로딩
class Point {
	// 필드 
	private int x;
	private int y;
	

	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getters/Setters
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
		
	}
	
	// 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	// 메서드 오버로딩
	// 한 클래스 내에 같은 이름을 가진 메서드
	// 각 메서드는 매개변수의 타입, 순서, 개수에 따라 구별
	
	public void draw(boolean bShow) {
		String message = String.format("점[x=%d, y=%d]을 ", x,y);
		message += bShow ? "그렸습니다.":" 지웠습니다. ";
		if (bShow)
			message += "그렸습니다.";
		else
			message += "지웠습니다.";
		System.out.println(message;)
		
	}
}
public class PointApp {

	public static void main(String[] args) {
	Point p1 = new Point();
	p1.setx(5);
	p1.setY(5);
	p1.draw();  // show info(); 랑 같은 개념
	p1.draw(true);
	p1.draw(false);
	
	
	Point p2 = new Point();
	p2.setx(10);
	p2.setY(23);
	p2.draw();
	p1.draw(true);
	p1.draw(false);

	}

}