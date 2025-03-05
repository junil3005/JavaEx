package com.javaex.basic.flow;

import java.util.Scanner;

public class px01 {

	public static void main(String[] args) {
		ifconditional();

	}
	
	private static void ifconditional(){
		
	System.out.print("숫자를 입력하세요.");
	System.out.print("\n숫자:");
	Scanner scanner = new Scanner(System.in);
	int n= scanner.nextInt();
			
	if ( n % 2 == 0 ) {
		System.out.println("짝수입니다.");		
	} else if ( n % 2 == 1) {
		System.out.println("홀수입니다.");
	} else if ( n < 0 ) {
		System.out.println("음수입니다.");		
	} else {
		System.out.println("0입니다.");		
	} 	
			
}
	

}
