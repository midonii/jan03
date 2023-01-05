package test;

import java.util.Scanner;

class RandomQuiz{
	static void up(int x) {
		System.out.println("UP");
	}
	static void down(int x) {
		System.out.println("DOWN");
	}
}

public class UpDownGame {
	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 100) +1 ;
		System.out.println(num);
		int count=0;
		
		System.out.println("1~100까지 임의의 정수 하나를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			count++;
			
			if(num > x) {
				RandomQuiz.up(x);
			} else if (num < x) {
				RandomQuiz.down(x);
			} else {
				System.out.println("정답");
				break;
			}
		}
		sc.close();
		System.out.println(count+ "번 만에 맞추셨습니다.");
	}
}
