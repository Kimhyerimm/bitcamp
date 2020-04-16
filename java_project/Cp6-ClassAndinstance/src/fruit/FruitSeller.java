package fruit;

public class FruitSeller {

	//속성 -> 변수
	// 사과개수 
	// 수입
	// 사과가격
	// 멤버변수 or 인스턴스변수
	
	int numOfApple = 20; // 사과개수
	int myMoney = 0; // 수입
	final int PRICE = 1000; // 사과가격
	
	
	// 기능 : 메서드
	// 1. 돈을 받는다. -> 매개변수 int money
	// 2. 받은 돈의 사과의 개수를 구한다.
	// 3. 나의 사과개수에서 반환해야하는 사과의 개수를 빼준다.
	// 4. 받은금액은 나의 수입으로 더한다.
	// 5. 사과의개수를 반환한다 -> 반환 데이터 int return 사과의개수
	
	int saleApple(int money) { // 1번
		int buyApple = money/PRICE; // 2번
		numOfApple = numOfApple-buyApple; //3번
		
	myMoney = myMoney+money; // 4번
		
		
		return buyApple; //5번 손님이사간 사과개수를 의미함
		
	}

	
	
	
}
