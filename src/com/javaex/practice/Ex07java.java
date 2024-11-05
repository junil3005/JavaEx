package com.javaex.practice;

import java.util.Scanner;

public class Ex07java {

	public static void main(String[] args) {
		ex07java();

	}

	private static void ex07java() {

		System.out.println("나이를 입력해주세요.");
		System.out.println("나이:");

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (age <= 7) {
			System.out.println("취학전아동//무료입니다.");
		} else if (age <= 13) {
			System.out.println("초등학생/2000원 입니다.");
		} else if (age <= 16) {
			System.out.println("중학생/3000원 입니다.");
		} else if (age <= 19) {
			System.out.println("고등학생/4000원 입니다.");
		} else {
			System.out.println("성인/5000원 입니다.");
		}
		scanner.close();
	}

}
