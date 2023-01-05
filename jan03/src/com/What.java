package com;

import java.util.Scanner;

public class What {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		int user = sc.nextInt();
		System.out.println(user);
		
		// 열어놓은 sc객체 닫기
		sc.close();
	}
}
