package fruit;

public class main {

	public static void main(String[] args) {
	
		buy b = new buy();
		sell s = new sell();
		
		
		b.buyer(s,6000);
		System.out.println("구매자가 6000원 지불했습니다");
		
		System.out.println("셀러의 현재 돈은"+s.current_seller_price+"입니다");
		System.out.println("셀러의 현재 사과는"+s.current_seller_apple+"입니다");
		
		System.out.println("-------------");
		
		System.out.println("바이어의 현재 돈은"+b.current_buyer_money+"입니다");
		System.out.println("바이어의 현재 사과는"+b.current_buyer_apple+"입니다");

	}

}
