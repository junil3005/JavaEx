package com.javaex.practice04;

public class Ex02java {
	
	public static void main(String[] args) {
	
	double[] d = {1.2, 3.3, 6.7};
	
	// 뒤에서부터 처음으로
	// .length == 3
	// 인덱스 범위 0 ~ .length - 1
	for (int i = d.length -1; i >=0; --i) {
		System.out.println(d[i]);
	}
}
	
}

