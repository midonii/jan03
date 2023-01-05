package test;

import java.util.Arrays;

public class Calc {
	
// void vs void(x)
// 주석처럼(void) 하던가, void 없이 하려면 return타입 받고 출력을 main에
	
	
/*	public void add(int num, int num2) {
		System.out.println(num + num2);
	}
*/
	
	public int add(int num, int num2) {
		int result = num + num2;
		return result;
	}
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
//		calc.add(10, 30);
		int result = calc.add(10, 30);
		System.out.println(result);
		
		String result1 = calc.print("홍길동");
		System.out.println(result1);
		
		int[] result2 = calc.makeArray(2, 10);
		System.out.println(Arrays.toString(result2));
		
	}
	
	// 문제. 파라미터 int 타입 두개를 받습니다.
	// 앞 숫자는 시작숫자, 뒷 숫자는 끝 숫자입니다.
	// for 문을 돌려 값을 화면에 출력해주세요.
	// 예) (4, 8) ---> [4, 5, 6, 7, 8]
	
	int[] makeArray(int x, int y) {
		int[] arr = new int[y-x+1];
		int i = 0;
		int j = x;
		for(i = 0; i <= y-x; i++) {
			arr[i] = j;
			j++;
		}
		return arr;
	}
	
	
	/*public*/ String print(String name) {
		return "입력하신 이름은 " + name + "입니다.";
	}
	
}
