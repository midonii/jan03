package apple;
// AppleBuyer, AppleSeller 구동시킬 소스파일
public class AppleMain {
	public static void main(String[] args) {
		AppleSeller seller = new AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		
		buyer.buyApple(seller,  3000); // seller1 
		
		seller.tellSeller();
		buyer.tellBuyer();
		
	}
}
