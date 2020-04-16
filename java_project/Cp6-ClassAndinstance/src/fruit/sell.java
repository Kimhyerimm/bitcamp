package fruit;

public class sell {

	
	int seller_apple = 50;
	int seller_money = 10000;
	int apple_price = 3000;
	

	
	int seller(int buyer_provide_money){
		
		
		seller_money = seller_money+buyer_provide_money;
		// 셀러 현재 돈 = 셀러 돈 + 구매자에게 제공받은 돈
		int buyer_apple = buyer_provide_money/apple_price; 
		//  셀러가 바이어에게 줄 사과개수 = 구매자가 준 돈 / 사과가격
		
		seller_apple = seller_apple - buyer_apple;
		// 현재 셀러 사과개수 = 원래 셀러 사과개수 - 셀러가 바이어게 줄 사과 개수
		
		return buyer_apple;
		
		// 셀러가 바이어에게 줄 사과개수 를 바이어게 반환
		
		
	}
		
	
	
}
