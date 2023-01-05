package com;

import java.util.Random;

public class Random02 {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(50);	// 0<= num < 20 까지 정수출력 
			System.out.println(num);
		}
	}
}
