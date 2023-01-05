package str;

import obj.Human;

public class Starter {
	public static void main(String[] args) {
		// Human 클래스를 불러서 인스턴스 만들기
//		Animal ani = new Animal();	// 불러올 수 없음. class가 public이 아니라서.
		Human human = new Human();
		human.show();
		
	}
}
