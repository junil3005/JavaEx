package com.javaex.basic.flow;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		whileEx();
		whileGuGu();
			
		}
		
		private static void whileEx() {
			// while (condition) { }
			// : condition이 참인 동안 블록을 반복
			/*
			 * I Like Java0
			 * I Like Java1
			 * I Like Java2
			 * I Like Java3
			 * I Like Java4
			 */
			int i = 0; //	반복 제어 변수
			
			while ( i < 5 ) {
				System.out.println("I Like Java" + i);
				// 주의: 반복 제어변수를 잘 조정해야 한다.
				i += 1;
			}
		}
		
		private static void whileGuGu() {
			// 단을 입력받아서 해당 단의 구구단을 출력\
			Scanner scanner = new Scanner(System.in);
			System.out.println("단을 입력하세요.");
			System.out.println("단:");
			
			int dan = scanner.nextInt();
			int i = 0; // 반복 제어 변수
			
			while ( i < 10) {
				System.out.println(dan + "*" + i + " = " +
									(dan * 1));
				i += 1;
			}	
				
			scanner.close();
			
			}
			
		}


