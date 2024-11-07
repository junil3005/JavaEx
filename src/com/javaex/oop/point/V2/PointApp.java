package com.javaex.oop.point.V2;

//	v2
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
	
}
public class PointApp {

	public static void main(String[] args) {
	Point p1 = new Point();
	p1.setx(5);
	p1.setY(5);
	p1.draw();  // show info(); 랑 같은 개념
	
	Point p2 = new Point();
	p2.setx(10);
	p2.setY(23);
	p2.draw();

	}

}
