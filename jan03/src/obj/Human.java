package obj;

public class Human {
	// 필드	: 값(정보)을 저장할 변수
	public int age;	// 접근지정자(public) 
	public String name;
	
	// 생성자 : 인스턴스를 생성하는 코드
	// 메소드 : 기능(함수)
	Animal ani;
	
	public void show() {
		ani = new Animal();		// Animal 객체 Ani 생성
//		ani.name		// name이 Animal 클래스 private 변수이므로 불러올 수 없음.
//		ani.sleep();	// sleep() : private method
//		ani.age = 10;	// default 변수 : 다른클래스에서 불러올 수 있음.
		
		ani.setName("홍길동");	// ani.setName에 홍길동 저장
		System.out.println(ani.getName());	// getName 실행
	}
}

// private은 클래스 밖에서 사용이 불가능함.
// 외부에서 써야한다면? private의 값을 저장, 호출할때 필요한 메소드 : getter(), setter()
class Animal{
	private String name;	// private : Animal 클래스에서만 사용가능.
	int age;
	
	// 메소드 암호화. 외부에서 못보게 함.
	private void sleep() {
		System.out.println("비밀스럽게 잡니다.");
	}
	
	public String getName() {	// getter : 값을 리턴
								// get_ / set_ : name이 private 변수이므로 밖에서 사용 불가능.
		return name;			// 				-> 새로운 public 변수와 public 메소드를 사용하여 밖에서 값을 불러와 해당 클래스 내에서 name을 다룸. 
	}
	
	public void setName(String name) {	
		this.name = name;		// setter : 값을 생성
	}

}
