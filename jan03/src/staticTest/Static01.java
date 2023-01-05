package staticTest;

// static 키워드
/*
 * 정적(static)
 * 자바에서는 동적과 정적의 개념으로 구분
 * 정적은 클래스가 로드되는 시점을, 동적은 로드된 클래스가 실행된 이후를 말함.
 * 이 중 객체는 동적데이터로, 프로그램이 실행된 이후 발생되는 형태.
 * 
 * 정적멤버 : 인스턴스를 만들지 않고 사용할 수 있는 멤버
 * 			모든 객체를 통틀어 하나만 생성되고, 모든 객체가 그것을 공유.
 * 			'클래스명.멤버명' 으로 호출.
 * 			클래스에 의지함.
 * 
 * 인스턴스멤버 : 인스턴스 생성시 가지게 되는 자신의 변수
 * 				별도의 기억공간을 가지고 객체마다 각각 다른 값을 가짐.
 * 				'인스턴스명.멤버명' 으로 호출.
 */
public class Static01 {
	
	public static int add1(int num1, int num2) {
		return num1 + num2 ;
	}
	
	public static void main(String[] args) {
//		Static01.add1(12, 13);	// 정적멤버. 객체생성없이 그냥 사용
		/*Static01.*/ add1(12,13);	// 동일 클래스 내에서 호출시에는 클래스명 생략가능
		Calc.add2(12,13);		// 정적멤버.
//		Calc.div(12,6);			// 에러. 동적멤버. 객체 생성 후 사용해야함.
		Calc.num = 10;
	}
}

class Calc{
	
	public int number;
	static int num;
	
	public static void add2(int num1, int num2) {
		System.out.println(num1 + num2);
		num = num1 + num2;	// static 붙은 변수 호출가능
//		number = num1 + num2; // 에러. static에서 non-static 호출불가
//		div(10,200); // public 메서드 호출불가
	}
	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
		num = num1 + num2; // non-static에서 static 변수 호출가능
		number = num1 + num2;	// non-static이 non-static 호출가능
		add2(10,50);	// static 메서드 호출가능
	}
}

/* 주의사항
 * static 메소드는 객체가 생성되지 않은 상태에서 호출
 * 객체 안에서만 존재하는 인스턴스 변수들 사용 불가
 * 정적변수와 지역변수만 사용가능
 * 
 * 정적메소드에서 인스턴스메소드를 호출하면 에러
 * 인스턴스 메소드도 객체가 생성되어야만 사용가능하기 때문.
 * 
 * 정적메소드에서 정적메소드 호출 가능
 * 정적메소드는 this 키워드 사용불가. (this 키워드는 인스턴스)
 * 
 * final 상수는 수정불가이므로 객체를 만들지 않고 사용하는것이 좋음.
 * 따라서 static final 로 사용.
 */
