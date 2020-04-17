package fruit;

/*작성자 : 김보겸
수정일:2020.04.17
수정내용 : 생성자를 통한 변수 초기화 , 현재 데이터 출력메서드 생성(showResult())
*/


public class FruitSeller {

	//속성 -> 변수
	// 사과개수 
	// 수입
	// 사과가격
	// 멤버변수 or 인스턴스변수
	
	
//	int numOfApple = 20; // 사과개수
//	int myMoney = 0; // 수입
//	final int PRICE = 1000; // 사과가격
//	

	//수정 : 변수의 명시적 초기화 변경  
	int numOfApple; // 사과개수
	int myMoney; // 수입
	final int APPLE_PRICE; // 사과가격
	
	//생성자
	FruitSeller(){
//		numOfApple=20;
//		myMoney=0;
//		APPLE_PRICE=1000;
		
		this(20,0,1000); // 아래 파라미터값에 넣어짐 
	}
	
	FruitSeller(int price){
		this(20,0,price);
	}
	
//	FruitSeller(int numOfApple, int myMoney, int price){
//		this.numOfApple=numOfApple; // this.인스턴스변수 = 매개변수 
//		this.myMoney=myMoney;
//		APPLE_PRICE=price;
//		
//	}
	
	
	public FruitSeller(int numOfApple, int myMoney, int aPPLE_PRICE) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = aPPLE_PRICE;
	}
	
	// 기능 : 메서드
	// 1. 돈을 받는다. -> 매개변수 int money
	// 2. 받은 돈의 사과의 개수를 구한다.
	// 3. 나의 사과개수에서 반환해야하는 사과의 개수를 빼준다.
	// 4. 받은금액은 나의 수입으로 더한다.
	// 5. 사과의개수를 반환한다 -> 반환 데이터 int return 사과의개수
	
	int saleApple(int money) { // 1번
		int buyApple = money/APPLE_PRICE; // 2번
		numOfApple = numOfApple-buyApple; //3번
		
	myMoney = myMoney+money; // 4번
		
		
		return buyApple; //5번 손님이사간 사과개수를 의미함
		
	}

	

	void showResult() {
		
		System.out.println("현재 보유금액 :"+myMoney+"이고 현재 보유사과는 :"+numOfApple);
	}
	
	
	
}
