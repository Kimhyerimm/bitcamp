package fruit;

public class buy {

	int buyer_money = 50000;
	int buyer_apple = 0;
	int current_buyer_money=0;
	int current_buyer_apple =0;
	
	void buyer(sell a, int provide_price) {
		
		int buy_apple=a.seller(provide_price);
		int current_buyer_money = buyer_money-provide_price;
		int current_buyer_apple = buyer_apple+buy_apple;
	}
	
}
