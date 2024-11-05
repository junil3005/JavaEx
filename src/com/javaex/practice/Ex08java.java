package com.javaex.practice;

import java.util.Scanner;

public class Ex08java {

	public static void main(String[] args) {
		ex07java();
	}

	private static void ex07java() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키:");
		float height = scanner.nextFloat();

		System.out.print("몸무게:");
		float weight = scanner.nextFloat();

		double bmi = weight / Math.pow(height, 2);

		if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("정상체중입니다.");
		} else if (bmi <= 18.5) {
			System.out.println("저체중입니다.");
		} else {
			System.out.println("과체중입니다.");
		}
		
		scanner.close();
	}

}
