package com.javaex.practice;

import java.util.Scanner;

public class Ex09java {

	public static void main(String[] args) {

		ex09java();

	}

	private static void ex09java() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.println("년도");

		int age = scanner.nextInt();

		if (age < 15 && age >= 65) {
			System.out.println(age + "살 무료예방접종 대상자 입니다.");
		}

		else {
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다.");
		}

		scanner.close();

	}

}
