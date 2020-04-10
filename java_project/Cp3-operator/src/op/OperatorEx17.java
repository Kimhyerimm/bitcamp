package op;

public class OperatorEx17 {

	public static void main(String[] args) {


		float pi=3.141592f; // float타입 pi에 3.141592f저장
		float shortPi = (int)(pi*1000)/1000f; // 먼저 pi*1000계산하면 3141.592f임
		// 후에 int로 변환하면 소수점다 날림 -> 3141남음 /1000f하면 3.141 [ int x float 하면 큰타입이 먹음 ]
		System.out.println(shortPi); //3.141나옴

	}

}
