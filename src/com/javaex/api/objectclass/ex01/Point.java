package com.javaex.api.objectclass.ex01;

//	object ex01
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		//	객체 내부 데이터의 문자열 출력
		return "Point("+ x + ", " + y + ")";
	}
}
