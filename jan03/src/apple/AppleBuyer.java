package apple;

public class AppleBuyer {
// 필드
	// 가지고 있는 돈
	int buyerMoney = 5000;
	// 구매할 사과의 수
	int appleCount = 0;	// 초기화(int - 0 / float - 0.0 / char - 0 / boolean - false / String - null)
	
// 메소드
	// 사과 사기
	public void buyApple(AppleSeller seller, int money) { // buyApple 실행문(클래스명 변수명)
//		int count = seller.saleApple(money);	// AppleSeller의 saleApple 메소드 실행. return값이 필요하니 int 값 지정.
//		appleCount += count;
		appleCount += seller.saleApple(money);
		buyerMoney -= money;
	}
	// 구매 정보 안내
	public void tellBuyer() {
		System.out.println("구매할 사과는 "+appleCount+"개 입니다.");
		System.out.println("남은 돈은 "+buyerMoney+"원 입니다.");
	}

}
