package com.javaex.api.practice.Rectangle;

public class Rectangle {
	private int width;
	private int height;
	private int radius;
}

public Rectangle(int width, int height, int radius) {
	this.width = width;
	this.height = height;
	this.radius = radius;
	
}

@Override
	public boolean equals (Object obj) {
	if (obj instanceof Rectangle) {
		Rectangle other = (Rectangle)obj;
		return radius == other.radius;		
	}
	
	return super.equals(obj);
}
