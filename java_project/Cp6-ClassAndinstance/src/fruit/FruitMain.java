package fruit;

public class FruitMain {

	public static void main(String[] args) {
		
		
		// 셀러 생성
		FruitSeller seller = new FruitSeller();//인스턴스 생성
		// 메모리에 FruiteSeller의 변수와 메서드가 올라감
		
		// 구매자 생성
		FruitBuyer buyer = new FruitBuyer();//인스턴스 생성
		
		// 바이어가 사과를 구매
		buyer.buyApple(seller, 5000); // 5000파라미터기본값 b_money
		// 돌고돌아 FriutSeller의 return값인 5가 b_num에 저장됨
		System.out.println("구매자가 5000원을 지불해서 사과를 구매했습니다.");
		
		
		System.out.println("판매자 판매 정보 출력");
		System.out.println("현재 사과의 개수"+ seller.numOfApple);
		System.out.println("판매 금액 :"+ seller.myMoney);
		
		System.out.println("---------------------");
		
		System.out.println("구매자의 정보");
		System.out.println("현재 남은 금액"+buyer.b_myMoney);
		System.out.println("보유한 사과의 개수"+buyer.b_numOfApple);
	}

}
