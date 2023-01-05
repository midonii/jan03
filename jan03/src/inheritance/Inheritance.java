package inheritance;
// 상속 : 상위클래스의 내용을 하위클래스가 가져가서 자신의 것처럼 사용할 수 있음.

// 상위/   부모  / super 클래스
// 하위/자식,파생/sub 클래스

class Animal{
	int age;
	String name;
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("동물이 탄생했습니다.");
	}
	
}
// 상위-하위클래스 연결 : 'class 자식클래스 extends 부모클래스 {}'
/*
class Human{
	int age;
	String name;
}
 */
class NewHuman extends Human{
	public NewHuman(int age, String name, String ssn) {
		super(age, name, ssn);
	}
	
	// 주민번호 앞자리만,, 부모클래스에서 가져와 재정의하여 사용하기
	@Override	// 어노테이션
	public void myInfo() {
//		super.myInfo();
		System.out.println("내 주민번호는 "+ ssn.substring(0, 6) + "입니다."); 
		// ___.substring : 글자가져오기. 0번부터 시작하여 6글자.
	}
}

class Human extends Animal{
	String ssn;	// 사람만 가지는 필드 주민번호
	
	public Human(int age, String name, String ssn) {
		super(age, name); 	// 부모의 생성자 호출
		this.ssn = ssn;
	}
	
	public void myInfo() {
		System.out.println("내 주민번호는 "+ ssn.substring(0, 6) + "입니다."); 
	}
	
	
}
class Dog extends Animal{
	public Dog(int age, String name) {
		super(age,name);
	}
	
	public void sound() {
		System.out.println("Bow Wow");
	}
}
//class HoundDog extends Dog, Animal{} // 에러. 단일상속만 가능
class HoundDog extends Dog{
	public HoundDog(int age, String name) {
		super(age,name);
	}
}
class Cat extends Animal{
	public Cat(int age, String name) {
		super(age,name);
	}
	public void sound() {
		System.out.println("Meow");
	}
}

class KoreaShortHair extends Cat{ // Animal - Cat - KoreaShortHair 순 상속
	public KoreaShortHair (int age, String name) {
		super(age,name);
	}
}


public class Inheritance {
	public static void main(String[] args) {
		Human human = new Human(10, "잠만보", "921103-2222222");
		human.age = 10;
		human.name = "미선";
		
		NewHuman h = new NewHuman(5, "보노보노", "991111-1111111");
		h.myInfo();
	}
}
