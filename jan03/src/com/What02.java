package com;

import java.io.IOException;

public class What02 {

	public static void main(String[] args) throws IOException {

		// 다른 입력방법 : System.in.read()
		System.out.println("한글자를 입력해주세요.");
		int user = System.in.read();	// System.in.read()는 int타입으로 받아올 수 있음.
		System.out.println(user);
		System.out.println((char)user); // 문자로 받아오려면 형변환필요.
		// 대부분 scanner 사용. 한글자(문자)를 받아오려면 sys.in.read가 나을수도, 아닌 경우에는 scanner 쓰는게 편리.
		System.in.read(); 		// 엔터키 처리
		System.in.read(); 
		
		System.out.println("두번째숫자를 입력하세요.");
		int sec = System.in.read();
		System.out.println(sec); 	// sys.in.read의 치명적 단점 : 엔터까지(\n, \r)도 먹음. 
		System.in.read(); 		// 엔터키 처리 위해서 두번 입력해줘야함.
		System.in.read(); 
		
		int third = System.in.read();
		System.out.println(third);
		System.in.read();
		System.in.read();
		
		
		
	}

}
