package apple;
// 사과 판매자
public class AppleSeller {
// 필요한 정보
	// 판매할 사과 개수
		int appleCount = 100;
	// 사과 가격
		final int APPLE_PRICE = 1000;	// final 종단변수. 값 변경 불가
	// 수익
		int sellerMoney = 0;
	
// 필요한 메소드
	// 사과 팔기
		public int saleApple(int money) {
			int num = money / APPLE_PRICE ;	// num = 판매자가 구매할 사과 개수
			sellerMoney += money;	// 수익 = 수익 + money
			appleCount -= num;		// 남은사과개수 = 사과개수 - num 
			return num;
		}
	// 판매 정보 안내
		public void tellSeller() {
			System.out.println("남은 사과는 "+appleCount+"개 입니다.");
			System.out.println("수익은 " +sellerMoney+ "원 입니다.");
		}
}
