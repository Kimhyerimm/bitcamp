package fruit;

public class sell {

	
	int seller_apple = 50;
	int seller_money = 10000;
	int apple_price = 3000;
	int seller_provide_apple_to_buyer=0;
	int current_seller_apple=0;
	int current_seller_price=0;
	
	
	int seller(int buyer_provide_money){
		
		int current_seller_price = seller_money+buyer_provide_money;
		// 셀러 현재 돈 = 셀러 돈 + 구매자에게 제공받은 돈
		int seller_provide_apple_to_buyer = buyer_provide_money/apple_price; 
		//  셀러가 바이어에게 줄 사과개수 = 구매자가 준 돈 / 사과가격
		
		int current_seller_apple = seller_apple - seller_provide_apple_to_buyer;
		// 현재 셀러 사과개수 = 원래 셀러 사과개수 - 셀러가 바이어게 줄 사과 개수
		
		return seller_provide_apple_to_buyer;
		
		// 셀러가 바이어에게 줄 사과개수 를 바이어게 반환
		
		
	}
		
	
	
}
