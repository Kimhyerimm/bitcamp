package fruit;

public class FruitBuyer {

	//속성 : 변수
	// 보유한 나의 돈
	// 사과의 개수
	
	int b_myMoney=10000; // 구매자 현재 돈
	int b_numOfApple=0; // 구매자 현재 사과 개수
	
	// 기능 :메서드
	// 1. 셀러찾기[받기]
	// 2. 지출할 돈 정의
	// 3. 셀러에게 돈을 주고 판매요청 -> 사과받음
	// 4. 사과의 개수를 받은 사과 만큼 증가
	// 5. 지출한 돈은 나의 돈에서 차감한다.
	
	// 참조변수 : 객체 주소값을 저장하는 변수
	void buyApple(FruitSeller seller, int b_money) { //1번,2번
		
		int b_num = seller.saleApple(b_money); // 3번
		b_numOfApple = b_numOfApple + b_num; //4번
		b_myMoney = b_myMoney-b_money; //5번
		
		
	}
	
	
}
