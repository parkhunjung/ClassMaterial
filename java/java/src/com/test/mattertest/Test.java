package com.test.mattertest;

import java.util.Scanner;

public class Test {
	
	static Scanner scan;
	
	static {
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
//		m1();
		m2();
		
	}

	private static void m2() {
		
		
		
	}

	private static void m1() {
		
		System.out.print("숫자 입력 : ");
		int input = scan.nextInt();
		for (int i=0; i<input; i++) {
			System.out.print("*");
			
			for(int j=i; j<input; j++) {
				System.out.print(" ");
			}
		}
		
		
		
		
	}
	
	
}
