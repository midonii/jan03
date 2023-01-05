package com;

public class Random01 {
	public static void main(String[] args) {
		double d = Math.random();	// 0<d<1 인 수 출력
//		System.out.println(d);
		
		for(int i = 0; i < 10; i++) {
			double d2 = (Math.random() * 15) + 1;	// 0+1< d2 <15+1 출력
//			System.out.println(d2);
		}
		
		int d3 = (int) (Math.random() * 10) + 1;	// 1 < d3 < 10 정수 
		System.out.println(d3);		
	}
}
