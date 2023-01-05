package constructor;
// 생성자
/*
 * 생성자 : 클래스가 인스턴스화될 때, 실제 인스턴스를 생성해주는 코드
 *
 * 생성자는 아래와 같은 기능도 담당.
 * 1. 클래스의 객체생성
 * 2. 멤버필드 초기화
 * 3. 필요에 따라서 초기화 메소드 실행
 * 
 * 생성자 없이 인스턴스를 발생시킬 수 없음.
 * 
 * 생성자의 형식
 * 생성자는 메소드와 유사 but 메소드와 기능적 차이 존재.
 * 
 * 1. 생성자의 이름은 반드시 클래스 이름과 동일.
 * 	 다를경우, 일반 메소드로 인식됨.(중요)
 * 2. 메소드가 아니므로 리턴타입 없음.
 * 
 * 기본생성자 (Default Constructor)
 * 자바에서는 모든 클래스마다 컴파일시 기본 생성자를 제공
 * 단, 클래스에 생성자가 하나라도 있다면 제공하지 않음.
 * 
 * 하나이상의 생성자를 정의하면 기본생성자는 제공되지 않음.
 * (생성자가 여러개 있을 수 있음)
 * 
 * 기본 생성자는 파라미터가 없는 생성자를 말함.
 * 이 기본 생성자를 이용해서 생성된 객체를 기본객체 라고 함.
 * 또한 모든 필드 값은 기본값으로 초기화됨.
 * 
 * 
 * */
public class Constructor {
	
	public Constructor() {	// 생성자 : 클래스명과 동일하고 리턴타입(void)이 없다.
		System.out.println("생성자를 호출했습니다.");
		con();
	}
	
	public void con() {
		
	}
	
	public static void main(String[] args) {
		Constructor constructor = new Constructor();	// 기본 생성자
									  // 생성자
//		Human h = new Human(null);
//		h.name = "잠만보";
		
		Human h = new Human("잠만보");
		Human h2 = new Human(5, "짱구");
		h.sleep(); h2.sleep();
		
		
	
	}
}

class Human{
	
	// 멤버필드
	int age;
	String name;
	private String ssn;
	
	public Human(String name) {	// 생성자
		this.name = name ;
	}
	public Human(int age, String name) {
		this(name); // 생성자 호출. 첫줄에 등장해야 함.
		this.age = age;
		// this.name = name; 위랑 중복사용. 한줄로 줄이기
	}
	public Human(int age, String name, String ssn) {
		this(age, name);
		this.ssn = ssn;
	}
	
	public void sleep() {	// 메소드
		System.out.println(name + "이(가) 잡니다.");
	}
	
	public void sleep(int time) {
		
	}
	
	public void sleep(int time, String spot) {
		
	}
	
	// 오버로드(p.208)
	/* 같은 이름의 메소드 또는 생성자를 정의할 때, 중복인지를 판별하는 요소로 적용되는 기준을 메소드 혹은 생성자 시그니쳐라고 함.
	 * 
	 * 이 시그니쳐는 배개변수의 수, 순서, 타입이 모두 같다면
	 * 같은 메소드/생성자로 인식. 하나라도 다르다면 다른 메소드/생성자로 인지.
	 * 
	 * 호출할때, 매개변수를 확인하고 해당 메소드/생성자를 호출
	 * 같은 이름이지만 매개변수를 다르게 사용하는 기술을 메소드 오버로드라고 함.
	 * (뒤에 오버라이드 나옴. 조심)
	 * 
	 *
	 */
	
	 
}
