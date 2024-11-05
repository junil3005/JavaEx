package com.javaex.practice;

import java.util.Scanner;

public class Ex06java {

	public static void main(String[] args) {
		ex06java();

	}

	private static void ex06java() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("나이를 입력하세요.");
		System.out.println("나이:");

		int age = scanner.nextInt();

		if (age >= 19 && age < 65) {
			System.out.println("1번 그룹");
		} else {
			System.out.println("2번 그룹");
		}

		scanner.close();
	}
}