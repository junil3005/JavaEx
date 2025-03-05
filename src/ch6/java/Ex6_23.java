package ch6.java;

class Data { int x;}

public class Ex6_23 {

	public static void main(String[] args) {
		Data d = new Data(); // 객체 생성
		d.x = 10;
		System.out.println("manin() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " +  d.x);
	}

	static void change(int x) { // 기본형 매개변수
 		x = 1000;
		System.out.println("change() : x = " + x);
		
	
}

}